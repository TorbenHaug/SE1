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
public class Mitarbeiter {
    private final String name;
    private final int persNr;

    public Mitarbeiter(String name, int persNr) {
        this.name = name;
        this.persNr = persNr;
    }

    public String getName() {
        return name;
    }

    public int getPersNr() {
        return persNr;
    }
}