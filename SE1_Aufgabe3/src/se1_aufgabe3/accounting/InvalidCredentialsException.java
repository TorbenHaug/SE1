package se1_aufgabe3.accounting;

public class InvalidCredentialsException extends RuntimeException
{
	public InvalidCredentialsException()
	{
		super("Invalide Einloginformationen.");
	}
}
