package se1_aufgabe2.cardarchive;

import java.io.File;

import org.junit.*;

import se1_aufgabe3.cardarchive.Anhang;
import se1_aufgabe3.cardarchive.antwort.InvalidFileException;

public class AnhangTest {
	
	@Test
	public void testAnhangType()
	{
		Anhang h = new Anhang(new File("test.jpg"));
	}
	
	@Test(expected = InvalidFileException.class)
	public void testAnghangTypeFaile()
	{
		new Anhang(new File("test.txt"));
	}
}
