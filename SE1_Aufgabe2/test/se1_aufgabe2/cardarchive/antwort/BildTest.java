package se1_aufgabe2.cardarchive.antwort;

import java.io.File;

import org.junit.*;

public class BildTest {

	@Test
	public void testBildFile()
	{
		Bild b = new Bild(new File("test.jpg"));
	}
	
	@Test(expected = InvalidFileException.class)
	public void testBildFileFail()
	{
		new Bild(new File("test.mp3"));
	}
}
