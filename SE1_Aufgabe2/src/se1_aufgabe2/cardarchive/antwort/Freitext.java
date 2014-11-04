/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive.antwort;

/**
 *
 * @author ClausTorben
 */
public class Freitext extends Antwort {
    private String antwort;

    public Freitext() {
	    super(AntwortType.Freitext);
    }
    
    public Freitext(String antwort) {
	    this();
        this.antwort = antwort;
    }

    public String getAntwort() {
        return antwort;
    }

    public void setAntwort(String antwort) {
        this.antwort = antwort;
    }
    
}
