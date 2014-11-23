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
public class Bild extends Antwort implements IBildAntwort
{
    private final File bild;

    public Bild(File bild) {
	    super(AntwortType.Bild);
	    if(!isValidBild(bild))
	    	throw new InvalidFileException();
	    
        this.bild = bild;
    }

    @Override
    public File getBild() {
        return bild;
    }
    
    public static boolean isValidBild(File inFile)
    {
    	return inFile.getName().toLowerCase().matches(".*(jpg|png|bmp)$");
    }
}
