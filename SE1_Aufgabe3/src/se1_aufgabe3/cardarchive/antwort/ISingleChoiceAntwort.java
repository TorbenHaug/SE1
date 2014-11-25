package se1_aufgabe3.cardarchive.antwort;

import java.util.List;

/**
 * SingleChoiceAntwortKlasse
 */
public interface ISingleChoiceAntwort
{
	/**
	 * Gibt eine Liste der moeglichen antworten zurueck
	 * @return
	 */
	List<IAntwortMoeglichkeit> getAntwortMoeglichkeiten();
	void addAntwortMoeglichkeit(String inAntwort, boolean inIstRichtig);
	void removeAntwortMoeglichkeit(IAntwortMoeglichkeit inMoeglichkeit);
	IAntwortMoeglichkeit getRichtigeAntwort();
}
