package se1_aufgabe2.cardarchive.antwort;

import java.io.File;

import org.junit.*;

public class AudioTest {

	@Test
	public void testAudioFile()
	{
		Audio a = new Audio(new File("test.mp3"));
	}
	
	@Test(expected = InvalidFileException.class)
	public void testAudioFileFail()
	{
		new Audio(new File("test.jpg"));
	}
}
