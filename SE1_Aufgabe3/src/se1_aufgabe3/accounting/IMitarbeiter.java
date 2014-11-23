package se1_aufgabe3.accounting;

import se1_aufgabe3.common.EmailType;

public interface IMitarbeiter
{
	String getName();
	int getPersNr();
	EmailType getEmail();
}
