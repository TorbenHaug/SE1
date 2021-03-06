package se1_aufgabe3.pruefung;

import java.util.Collection;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.IFach;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

/**
 * Verwaltet laufende Pruefungen und Uebungen von Studenten
 */
public interface IPruefungControl
{
	/**
	 * Erstellt eine neue Übung/Prüfung für einen Studenten
	 * 
	 * @param inStudent - Eingelogter Student 
	 * @param inFach - Ausgwähltes Fach
	 * @param inLerkarten - Ausgewählte Lernkarten
	 * @return IUebung
	 */
	IUebung createFor(IStudent inStudent, IFach inFach, Collection<ILernkarte<? extends IAntwort>> inLerkarten);
}
