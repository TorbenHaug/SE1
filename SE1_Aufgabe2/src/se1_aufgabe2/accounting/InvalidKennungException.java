package se1_aufgabe2.accounting;

public class InvalidKennungException extends RuntimeException
{
	public InvalidKennungException(final String s)
	{
		super(s);
	}

	public InvalidKennungException()
	{
	}
}
