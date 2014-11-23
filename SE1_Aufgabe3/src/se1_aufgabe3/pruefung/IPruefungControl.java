package se1_aufgabe3.pruefung;

import se1_aufgabe3.accounting.IStudent;

public interface IPruefungControl
{
	IPruefung createFor(IStudent inStudent);
	void saveState(IPruefung inPruefung);
}
