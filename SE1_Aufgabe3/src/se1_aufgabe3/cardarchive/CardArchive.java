package se1_aufgabe3.cardarchive;

import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import se1_aufgabe3.accounting.IAccountingRegistry;
import se1_aufgabe3.accounting.IProfessor;
import se1_aufgabe3.cardarchive.antwort.*;
import se1_aufgabe3.cardarchive.antwort.Antwort.AntwortType;
import se1_aufgabe3.db.DatabaseConnection;

public class CardArchive implements ICardArchive {

	private final IAccountingRegistry accounting;
	private DatabaseConnection db;
	
	public CardArchive(IAccountingRegistry inAccounting) {
		this.accounting = inAccounting;
	}
	
	@Override
	public IFach getFachByName(String inName) {
		return new Fach(inName);
	}

	@Override
	public Collection<IFach> getFaecher()
	{
		List<IFach> faecher = new ArrayList<>();
		faecher.add(this.createFachWithName("Software Engineering"));
		return faecher;
	}

	@Override
	public IFach createFachWithName(String inName) {
		return new Fach(inName);
	}

	@Override
	public ILernkarte<? extends IAntwort> getLernkarteByID(UUID inID) {
		return null;
	}

	@Override
	public Collection<ILernkarte<? extends IAntwort>> getLernkarten() {
		String select = "SELECT * FROM lernkarten";
		ResultSet result = this.db.exec(select);
		List<ILernkarte<? extends IAntwort>> lernkarten = new ArrayList<>();
		try
		{
			while(result.next())
			{
				int id = result.getInt(1);
				String frage = result.getString(2);
				String fach = result.getString(3);
				IProfessor prof = accounting.getProfessorMitPersonalNr(1);
				AntwortType antwortType = AntwortType.valueOf(result.getString(4));
				String data = result.getString(5);
				IAntwort antwort;
				switch(antwortType)
				{
					case Audio:
						antwort = new Audio(new File(data));
						break;
					case Bild:
						antwort = new Bild(new File(data));
						break;
					case Freitext:
						antwort = new Freitext(data);
						break;
					case MultiChoice:
						String[] entries = data.split(";");
						List<IAntwortMoeglichkeit> moeglichkeiten = new ArrayList<>();
						for(String entry : entries)
						{
							if(entry.endsWith("+"))
								moeglichkeiten.add(new AntwortMoeglichkeit(entry.substring(0, entry.length() - 1), true));
							else
								moeglichkeiten.add(new AntwortMoeglichkeit(entry, false));
						}
						antwort = new MultiChoice(moeglichkeiten);
						break;
					default:
						String[] singleEntries = data.split(";");
						List<IAntwortMoeglichkeit> singleMoeglichkeiten = new ArrayList<>();
						for(String entry : singleEntries)
						{
							if(entry.endsWith("+"))
								singleMoeglichkeiten.add(new AntwortMoeglichkeit(entry.substring(0, entry.length() - 1), true));
							else
								singleMoeglichkeiten.add(new AntwortMoeglichkeit(entry, false));
						}
						antwort = new SingleChoice(singleMoeglichkeiten);
						break;
				}
				Lernkarte<? extends IAntwort> karte = new Lernkarte<>(frage, prof, antwort, new ArrayList<IAnhang>(), getFachByName(fach));
				lernkarten.add(karte);
			}
			result.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

		return lernkarten;
	}

	@Override
	public IAntwort createAntwort(Antwort.AntwortType type) {
		return null;
	}

	@Override
	public ICardSelection createSelection(final IFach inFach, final Collection<ILernkarte<? extends IAntwort>> inSelection)
	{
		return new CardSelection(inFach, inSelection);
	}

	@Override
	public <T extends IAntwort> T prepareAnswer(ILernkarte<T> inKarte, Object inValue)
	{
		T moeglicheAntwort = inKarte.getAntwort();
		if(moeglicheAntwort instanceof ISingleChoiceAntwort)
		{
			List<IAntwortMoeglichkeit> antwortAuswahl = new ArrayList<>();
			antwortAuswahl.add(new AntwortMoeglichkeit(((IAntwortMoeglichkeit)inValue).getAntwort(), true));
			return (T)new SingleChoice(antwortAuswahl);
		}
		else if(moeglicheAntwort instanceof IMultiChoiceAntwort)
		{
			List<IAntwortMoeglichkeit> antwortAuswahl = new ArrayList<>();
			List<IAntwortMoeglichkeit> gewaehlt = (List)inValue;
			for(IAntwortMoeglichkeit moeglichkeit : gewaehlt)
			{
				antwortAuswahl.add(new AntwortMoeglichkeit(moeglichkeit.getAntwort(), true));
			}
			return (T)new MultiChoice(antwortAuswahl);
		}
		else if(moeglicheAntwort instanceof IFreitextAntwort)
		{
			return (T)new Freitext((String)inValue);
		}
		else if(moeglicheAntwort instanceof IAudioAntwort)
		{
			return (T)new Audio(new File((String)inValue));
		}
		else if(moeglicheAntwort instanceof IBildAntwort)
		{
			return (T)new Bild(new File((String)inValue));
		}

		return null;
	}
}
