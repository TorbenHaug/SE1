/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive;

import java.util.ArrayList;

/**
 *
 * @author ClausTorben
 */
public class SingleChoice extends Antwort{
    private final ArrayList<AntwortMoeglichkeit> antwortMoeglichkeiten;

    public SingleChoice(ArrayList<AntwortMoeglichkeit> antwortMoeglichkeiten) {
        this.antwortMoeglichkeiten = antwortMoeglichkeiten;
    }

    public ArrayList<AntwortMoeglichkeit> getAntwortMoeglichkeiten() {
        return antwortMoeglichkeiten;
    }
}
