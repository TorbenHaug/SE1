package se1_aufgabe3.accounting;

public class InvalidEmailException extends RuntimeException {
	public InvalidEmailException() {
		super("Angebene Email ist nicht in einem g�ltigen Format");
	}
}
