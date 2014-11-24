package se1_aufgabe3.pruefung;

import se1_aufgabe3.accounting.IStudent;

public class Pruefung extends Uebung
{
	public Pruefung(IStudent inStudent)
	{
		super(inStudent);
	}

	@Override
	public boolean isUebung()
	{
		return false;
	}
}