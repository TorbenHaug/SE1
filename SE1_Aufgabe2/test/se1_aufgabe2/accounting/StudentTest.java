package se1_aufgabe2.accounting;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest
{
	@Test
	public void testKennung()
	{
		Student s = new Student("Hans", "abb111", 1221, 1);
		Assert.assertTrue(s.getAbgegebeneLernkarten().size() == 0);
	}

	@Test(expected = InvalidKennungException.class)
	public void testKennungFail()
	{
		new Student("Hans", "bsd133", 1, 1);
	}
}
