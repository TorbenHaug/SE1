package se1_aufgabe3.pruefung;

import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.answers.IAnswerRegistry;
import se1_aufgabe3.common.AnswerResult;

public class Pruefung extends Uebung
{
	public Pruefung(IStudent inStudent, IAnswerRegistry inAnswerRegistry)
	{
		super(inStudent, inAnswerRegistry);
	}

	@Override
	public boolean isUebung()
	{
		return false;
	}

	@Override
	public AnswerResult setAnswer(Object inAntwort)
	{
		super.setAnswer(inAntwort);
		return AnswerResult.PENDING;
	}
}