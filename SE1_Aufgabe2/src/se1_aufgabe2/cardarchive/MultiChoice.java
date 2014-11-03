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
public class MultiChoice extends Antwort{
    private final ArrayList<AntwortMoeglichkeit> antwortMoeglichkeiten;

    public MultiChoice(ArrayList<AntwortMoeglichkeit> antwortMoeglichkeiten) {
        this.antwortMoeglichkeiten = antwortMoeglichkeiten;
    }

    public ArrayList<AntwortMoeglichkeit> getAntwortMoeglichkeiten() {
        return antwortMoeglichkeiten;
    }
	
	public void addAntwortMoeglichkeit(String inAntwort, boolean inIstRichtig)
	{
		this.antwortMoeglichkeiten.add(new AntwortMoeglichkeit(inAntwort, inIstRichtig));
	}

	public void removeAntwortMoeglichkeit(AntwortMoeglichkeit inMoeglichkeit)
	{
		this.antwortMoeglichkeiten.remove(inMoeglichkeit);
	}}