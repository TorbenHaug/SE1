package se1_aufgabe3.cardarchive.antwort;

import java.util.Collection;
import java.util.List;

public interface IMultiChoiceAntwort
{
	List<IAntwortMoeglichkeit> getAntwortMoeglichkeiten();
	void addAntwortMoeglichkeit(String inAntwort, boolean inIstRichtig);
	void removeAntwortMoeglichkeit(IAntwortMoeglichkeit inMoeglichkeit);
	Collection<IAntwortMoeglichkeit> getRichtigeAntworten();
}
