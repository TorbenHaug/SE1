/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.cardarchive.antwort;

import java.io.File;

/**
 *
 * @author ClausTorben
 */
public class Audio extends Antwort implements IAudioAntwort
{
    private final File audio;

    public Audio(File audio) {
	    super(AntwortType.Audio);
	    if(!isValidFile(audio))
	    	throw new InvalidFileException();
	    
        this.audio = audio;
    }

    @Override
    public File getAudio() {
        return audio;
    }
    
    public static boolean isValidFile(File inFile)
    {
    	return inFile.getName().toLowerCase().matches(".*(mp3|acc)$");
    }
}
