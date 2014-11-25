package se1_aufgabe3.pruefung;

import java.util.Collection;
import java.util.Map;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ICardSelection;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;
import se1_aufgabe3.common.AnswerResult;
/**
 * UbungsKlasse, stellt die funktionen fur eine laufende Übung bereit 
 *
 */
public interface IUebung
{
	void addLernkarten(ICardSelection inCardSelection);
	IStudent getStudent();
	boolean isOver();
	/**
	 * Prueft ob noch weitere unbeantwortete Lerkarten vorhanden sind.
	 * 
	 * @return
	 */
	boolean canContinue();
	boolean isUebung();
	/**
	 * Gibt die nächste noch nicht beantwortete Lernkarte zurück
	 * 
	 * @return
	 */
	ILernkarte<? extends IAntwort> getNextLernkarte();
	Collection<IAntwort> getAntworten();
	/**
	 * Überträgt die Antwort des Nutzers an die Übung
	 *  
	 * @param inAntwort - Antwort des Nutzers
	 * @return
	 */
	AnswerResult setAnswer(Object inAntwort);
	
	Map<ILernkarte<? extends IAntwort>, IAntwort> getAnswersForLernkarten();
}
