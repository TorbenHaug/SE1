package se1_aufgabe3.answers;

import java.util.Collection;
import se1_aufgabe3.accounting.IMitarbeiter;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;
/**
 *Antwort Verwaltungskomponente
 *
 */
public interface IAnswerRegistry
{
	/**
	 * Gibt alle Antworten zurück, die Einstudent jemals abgegeben hat
	 * 
	 * @param inStudent
	 * @return
	 */
	public Collection<IAbgegebeneAntwort> getAntwortenVonStudent(IStudent inStudent);

	/**
	 * Gibt die nächste Abgegebene Antwort, die noch nicht durch das System oder einen 
	 * Mitarbeiter geprüft wurde, zurück
	 * 
	 * @return
	 */
	public IAbgegebeneAntwort getNaechsteUngepruefteAntwort();

	/**
	 * Gibt eine Collection von Antworten zurück, die von einem bestimmten Mitarbeiter geprüft wurden
	 * 
	 * @param inMitarbeiter
	 * @return
	 */
	public Collection<IAbgegebeneAntwort> getGepruefteAntwortenVon(IMitarbeiter inMitarbeiter);

	/**
	 * Speichert eine gegebene Antwort.
	 * 
	 * @param inStudent - Der die lernkarte bearbeitet hat
	 * @param inLernkarte - Lernkarte die bearbeitet worden ist
	 * @param inAntwort - Antwort, die gegeben wurde
	 */
	public <T extends IAntwort> void saveAnswer(IStudent inStudent, ILernkarte<T> inLernkarte, IAntwort inAntwort);
}
