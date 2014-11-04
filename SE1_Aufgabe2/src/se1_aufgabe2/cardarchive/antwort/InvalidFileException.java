package se1_aufgabe2.cardarchive.antwort;

public class InvalidFileException extends RuntimeException {
	public InvalidFileException()
	{
		super("Datei hatte den falschen Typ");
	}
}
