package se1_aufgabe3.pruefung;

import se1_aufgabe3.accounting.IStudent;

public interface IPruefungControl
{
	IUebung createFor(IStudent inStudent);
	void saveState(IUebung inPruefung);
}
