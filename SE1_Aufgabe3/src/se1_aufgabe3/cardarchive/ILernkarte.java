package se1_aufgabe3.cardarchive;

import java.util.ArrayList;
import java.util.UUID;

import se1_aufgabe3.accounting.IProfessor;
import se1_aufgabe3.cardarchive.antwort.Antwort.AntwortType;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

/**
 * Lernkartenklasse
 */
public interface ILernkarte<T extends IAntwort>
{
	String getFrage();
	IProfessor getErsteller();
	/**
	 * Gibt die Musterlösung zurück
	 * @return
	 */
	T getAntwort();
	
	AntwortType getType();
	
	ArrayList<IAnhang> getAnhaenge();
	UUID getId();
	IFach getFach();
	/**
	 * Breiten Konversionsmethode von Object auf Antwort
	 * Mögliche Eingaben sind:
	 * 		- ISingleChoice
	 * 		- IMultiChoice
	 * 		- Freitext
	 * 		- Bild
	 * 		- Audio
	 * @param inValue - gegebene Antwortmöglichkeit
	 * @return - IAntwort oder Null, wenn das Object keine gültige Antwortmöglichkeit war
	 */
	T prepareAnswer(Object inValue);
}
