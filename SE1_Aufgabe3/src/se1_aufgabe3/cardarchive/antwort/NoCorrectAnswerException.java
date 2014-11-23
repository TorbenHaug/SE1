package se1_aufgabe3.cardarchive.antwort;

public class NoCorrectAnswerException extends RuntimeException
{
	public NoCorrectAnswerException()
	{
		super("Die Antwort hatte keine richtigen Antworten");
	}
}
