package se1_aufgabe3.pruefung;

import java.util.Collection;
import se1_aufgabe3.cardarchive.ICardSelection;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public interface IPruefung
{
	void addLernkarten(ICardSelection inCardSelection);
	boolean isOver();
	boolean canContinue();
	boolean isUebung();
	Collection<IAntwort> getAntworten();
}
