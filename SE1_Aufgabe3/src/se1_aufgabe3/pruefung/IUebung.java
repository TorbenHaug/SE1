package se1_aufgabe3.pruefung;

import java.util.Collection;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ICardSelection;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public interface IUebung
{
	void addLernkarten(ICardSelection inCardSelection);
	IStudent getStudent();
	boolean isOver();
	boolean canContinue();
	boolean isUebung();
	Collection<IAntwort> getAntworten();
	void addAntwort(IAntwort inAntwort);
}
