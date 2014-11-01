/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.accounting;

/**
 *
 * @author ClausTorben
 */
public class Professor {
    private final String name;
    private final int perNr;
    private final String hawKennung;

    public Professor(String name, int perNr, String hawKennung) {
        this.name = name;
        this.perNr = perNr;
        this.hawKennung = hawKennung;
    }

    public String getName() {
        return name;
    }

    public int getPerNr() {
        return perNr;
    }

    public String getHawKennung() {
        return hawKennung;
    }
}
