package se1_aufgabe3.answers;

import java.util.Collection;
import se1_aufgabe2.accounting.*;
import se1_aufgabe3.accounting.IMitarbeiter;
import se1_aufgabe3.accounting.IStudent;

public interface IAnswerRegistry
{
	public Collection<IAbgegebeneAntwort> getAntwortenVonStudent(IStudent inStudent);

	public IAbgegebeneAntwort getNaechsteUngepruefteAntwort();

	public Collection<IAbgegebeneAntwort> getGepruefteAntwortenVon(IMitarbeiter inMitarbeiter);
}
