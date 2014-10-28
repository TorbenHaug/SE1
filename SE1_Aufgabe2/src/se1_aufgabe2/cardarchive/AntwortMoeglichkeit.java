/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive;

/**
 *
 * @author ClausTorben
 */
public class AntwortMoeglichkeit {
    private final String antwort;
    private final boolean richtig;

    public AntwortMoeglichkeit(String antwort, boolean richtig) {
        this.antwort = antwort;
        this.richtig = richtig;
    }

    public String getAntwort() {
        return antwort;
    }

    public boolean isRichtig() {
        return richtig;
    }
    
}
