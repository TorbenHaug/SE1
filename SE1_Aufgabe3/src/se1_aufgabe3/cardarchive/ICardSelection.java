package se1_aufgabe3.cardarchive;

import java.util.Collection;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public interface ICardSelection
{
	IFach getFach();
	Collection<ILernkarte<? extends IAntwort>> getLernkarten();
	ILernkarte<? extends IAntwort> getNext();
	ILernkarte<? extends IAntwort> getCurrent();
}
