package se1_aufgabe3.cardarchive;

import java.util.Collection;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

/**
 * 
 * H�lt die Lernkarten f�r eine �bungssession
 *
 */
public interface ICardSelection
{
	/**
	 * 
	 * @return Fach f�r die diese �bung generiert wurde
	 */
	IFach getFach();
	/**
	 * @return Collection aller Lernkarten die bearbeitet werden sollen
	 */
	Collection<ILernkarte<? extends IAntwort>> getLernkarten();
	/**
	 * gibt die n�chste noch nicht bearbeitete Lernkrte zur�ck
	 * @return
	 */
	ILernkarte<? extends IAntwort> getNext();
	/**
	 * gibt die gerade bearbeitete Lernkarte zur�ck
	 * 
	 * @return
	 */
	ILernkarte<? extends IAntwort> getCurrent();
}
