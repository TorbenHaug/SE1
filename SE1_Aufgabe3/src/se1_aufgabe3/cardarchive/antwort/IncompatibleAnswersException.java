package se1_aufgabe3.cardarchive.antwort;

public class IncompatibleAnswersException extends RuntimeException
{
	public IncompatibleAnswersException()
	{
		super("Die beiden angegebenen Antworttypen stimmmen nicht überein.");
	}
}
