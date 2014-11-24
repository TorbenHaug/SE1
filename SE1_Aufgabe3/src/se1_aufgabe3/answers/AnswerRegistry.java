package se1_aufgabe3.answers;

import java.util.Collection;
import se1_aufgabe3.accounting.*;
import se1_aufgabe3.cardarchive.ICardArchive;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

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
		// TODO save
	}

}
