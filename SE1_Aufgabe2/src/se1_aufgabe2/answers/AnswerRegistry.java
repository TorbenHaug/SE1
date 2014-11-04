package se1_aufgabe2.answers;

import java.util.Collection;

import se1_aufgabe2.accounting.IAccountingRegistry;
import se1_aufgabe2.accounting.Mitarbeiter;
import se1_aufgabe2.accounting.Student;
import se1_aufgabe2.cardarchive.ICardArchive;

public class AnswerRegistry implements IAnswerRegistry {

	private final IAccountingRegistry accounting;
	private final ICardArchive cardArchive;
	
	public AnswerRegistry(IAccountingRegistry inAccounting, ICardArchive inCardArchive) {
		this.accounting = inAccounting;
		this.cardArchive = inCardArchive;
	}
	
	@Override
	public Collection<AbgegebeneAntwort> getAntwortenVonStudent(
			Student inStudent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbgegebeneAntwort getNaechsteUngepruefteAntwort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<AbgegebeneAntwort> getGepruefteAntwortenVon(
			Mitarbeiter inMitarbeiter) {
		// TODO Auto-generated method stub
		return null;
	}

}
