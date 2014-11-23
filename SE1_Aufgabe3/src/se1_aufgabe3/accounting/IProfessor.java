package se1_aufgabe3.accounting;

import se1_aufgabe3.common.EmailType;

public interface IProfessor
{
	public String getName();

	public int getPerNr();

	public String getHawKennung();

	public EmailType getEmail();
}
