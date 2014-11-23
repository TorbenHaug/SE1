package se1_aufgabe3.cardarchive.antwort;

import java.util.ArrayList;

public interface ISingleChoiceAntwort
{
	ArrayList<IAntwortMoeglichkeit> getAntwortMoeglichkeiten();
	void addAntwortMoeglichkeit(String inAntwort, boolean inIstRichtig);
	void removeAntwortMoeglichkeit(IAntwortMoeglichkeit inMoeglichkeit);
	IAntwortMoeglichkeit getRichtigeAntwort();
}
