package se1_aufgabe3.cardarchive.antwort;

import java.util.List;

public interface ISingleChoiceAntwort
{
	List<IAntwortMoeglichkeit> getAntwortMoeglichkeiten();
	void addAntwortMoeglichkeit(String inAntwort, boolean inIstRichtig);
	void removeAntwortMoeglichkeit(IAntwortMoeglichkeit inMoeglichkeit);
	IAntwortMoeglichkeit getRichtigeAntwort();
}
