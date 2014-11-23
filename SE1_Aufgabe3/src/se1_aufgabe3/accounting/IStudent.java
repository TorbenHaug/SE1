package se1_aufgabe3.accounting;

import se1_aufgabe3.common.EmailType;

public interface IStudent
{
	public String getName();

	public String getAkennung();

	public int getMatrikelNr();

	public int getSemester();

	public EmailType getEmail();
}
