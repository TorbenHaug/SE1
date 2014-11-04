package se1_aufgabe2.accounting;

import org.junit.Test;

import se1_aufgabe2.common.EmailType;

public class StudentTest
{
	@Test
	public void testKennung()
	{
		Student s = new Student("Hans", "abb111", 1221, 1, new EmailType("test@test.com"));
	}

	@Test(expected = InvalidKennungException.class)
	public void testKennungFail()
	{
		new Student("Hans", "bsd133", 1, 1, new EmailType("test@test.com"));
	}
}
