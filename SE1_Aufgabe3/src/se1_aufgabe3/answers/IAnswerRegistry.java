package se1_aufgabe3.answers;

import java.util.Collection;
import se1_aufgabe3.accounting.IMitarbeiter;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public interface IAnswerRegistry
{
	public Collection<IAbgegebeneAntwort> getAntwortenVonStudent(IStudent inStudent);

	public IAbgegebeneAntwort getNaechsteUngepruefteAntwort();

	public Collection<IAbgegebeneAntwort> getGepruefteAntwortenVon(IMitarbeiter inMitarbeiter);

	public <T extends IAntwort> void saveAnswer(IStudent inStudent, ILernkarte<T> inLernkarte, IAntwort inAntwort);
}
