package se1_aufgabe2.accounting;

public class InvalidEmailException extends RuntimeException {
	public InvalidEmailException() {
		super("Angebene Email ist nicht in einem gültigen Format");
	}
}
