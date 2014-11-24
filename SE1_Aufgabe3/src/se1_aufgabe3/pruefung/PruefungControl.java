package se1_aufgabe3.pruefung;

import se1_aufgabe3.accounting.IStudent;

public class PruefungControl implements IPruefungControl
{
	@Override
	public IUebung createFor(IStudent inStudent)
	{
		return new Uebung(inStudent);
	}
}