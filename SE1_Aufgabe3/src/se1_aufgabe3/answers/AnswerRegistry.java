package se1_aufgabe3.answers;

import java.util.Collection;
import se1_aufgabe3.accounting.*;
import se1_aufgabe3.cardarchive.ICardArchive;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.*;
import se1_aufgabe3.db.DatabaseConnection;

public class AnswerRegistry implements IAnswerRegistry {

	private final IAccountingRegistry accounting;
	private final ICardArchive cardArchive;
	
	public AnswerRegistry(IAccountingRegistry inAccounting, ICardArchive inCardArchive) {
		this.accounting = inAccounting;
		this.cardArchive = inCardArchive;
	}
	
	@Override
	public Collection<IAbgegebeneAntwort> getAntwortenVonStudent(IStudent inStudent) {
		return null;
	}

	@Override
	public IAbgegebeneAntwort getNaechsteUngepruefteAntwort() {
		return null;
	}

	@Override
	public Collection<IAbgegebeneAntwort> getGepruefteAntwortenVon(IMitarbeiter inMitarbeiter) {
		return null;
	}

	@Override
	public <T extends IAntwort> void saveAnswer(IStudent inStudent, ILernkarte<T> inLernkarte, IAntwort inAntwort)
	{
		AbgegebeneAntwort<T> antwort = new AbgegebeneAntwort<>(inAntwort, inStudent, inLernkarte);
		StringBuilder query = new StringBuilder().append("INSERT INTO abgegebene_antworten (lernkarten_id, student_matr, antwort_data) VALUES(").append("'").append(inLernkarte.getId().toString()).append("',").append("").append(inStudent.getMatrikelNr()).append(",'");
		if(inAntwort instanceof ISingleChoiceAntwort)
		{
			for(IAntwortMoeglichkeit moeglichkeit : ((ISingleChoiceAntwort)inAntwort).getAntwortMoeglichkeiten())
			{
				query.append(moeglichkeit.getAntwort()).append(";");
			}
			query.setLength(query.length() - 1);
		}
		else if(inAntwort instanceof IMultiChoiceAntwort)
		{
			for(IAntwortMoeglichkeit moeglichkeit : ((IMultiChoiceAntwort)inAntwort).getAntwortMoeglichkeiten())
			{
				query.append(moeglichkeit.getAntwort());
				if(moeglichkeit.isRichtig())
					query.append("+");

				query.append(";");
			}
			query.setLength(query.length() - 1);
		}

		query.append("');");
		DatabaseConnection.getInstance().exec(query.toString());
	}

}
