package se1_aufgabe3.cardarchive.antwort;

public class InvalidFileException extends RuntimeException {
	public InvalidFileException()
	{
		super("Datei hatte den falschen Typ");
	}
}
