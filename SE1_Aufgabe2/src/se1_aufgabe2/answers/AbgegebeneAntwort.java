/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.answers;

import se1_aufgabe2.accounting.Mitarbeiter;
import se1_aufgabe2.cardarchive.Lernkarte;

/**
 *
 * @author ClausTorben
 */
public class AbgegebeneAntwort {
    private final Object wert;
	private final Lernkarte lernkarte;
	private Mitarbeiter geprueftVon;

    public AbgegebeneAntwort(Object wert, Lernkarte inLernkarte) {
        this.wert = wert;
	    this.lernkarte = inLernkarte;
    }

    public Object getWert() {
        return wert;
    }

	public Lernkarte getLernkarte()
	{
		return lernkarte;
	}

	public Mitarbeiter getGeprueftVon()
	{
		return geprueftVon;
	}

	public void setGeprueftVon(Mitarbeiter inGeprueftVon)
	{
		geprueftVon = inGeprueftVon;
	}
}
