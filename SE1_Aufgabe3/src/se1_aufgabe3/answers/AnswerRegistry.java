package se1_aufgabe3.answers;

import java.util.Collection;

import se1_aufgabe2.accounting.*;
import se1_aufgabe3.accounting.*;
import se1_aufgabe3.cardarchive.ICardArchive;

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

}
