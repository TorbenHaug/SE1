package se1_aufgabe3.pruefung;

import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.antwort.IAntwort;
import se1_aufgabe3.common.AnswerResult;

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

	@Override
	public AnswerResult addAntwort(IAntwort inAntwort)
	{
		super.addAntwort(inAntwort);
		return AnswerResult.PENDING;
	}
}