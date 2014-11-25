package se1_aufgabe3.cardarchive;

import java.util.Collection;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

/**
 * 
 * Hält die Lernkarten für eine Übungssession
 *
 */
public interface ICardSelection
{
	/**
	 * 
	 * @return Fach für die diese Übung generiert wurde
	 */
	IFach getFach();
	/**
	 * @return Collection aller Lernkarten die bearbeitet werden sollen
	 */
	Collection<ILernkarte<? extends IAntwort>> getLernkarten();
	/**
	 * gibt die nächste noch nicht bearbeitete Lernkrte zurück
	 * @return
	 */
	ILernkarte<? extends IAntwort> getNext();
	/**
	 * gibt die gerade bearbeitete Lernkarte zurück
	 * 
	 * @return
	 */
	ILernkarte<? extends IAntwort> getCurrent();
}
