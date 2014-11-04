/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.answers;

import se1_aufgabe2.accounting.Mitarbeiter;
import se1_aufgabe2.accounting.Student;
import se1_aufgabe2.cardarchive.Lernkarte;
import se1_aufgabe2.cardarchive.antwort.Antwort;
import se1_aufgabe2.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class AbgegebeneAntwort<T extends Antwort> implements PersistentEntity
{
    private final Antwort wert;
	private final Lernkarte<T> lernkarte;
	private Mitarbeiter geprueftVon;
	private boolean warRichtig;
	private final Student answerer;

    public AbgegebeneAntwort(Antwort wert, Student inAnswerer, Lernkarte<T> inLernkarte) {
        this.wert = wert;
	    this.lernkarte = inLernkarte;
	    this.warRichtig = false;
	    this.answerer = inAnswerer;
    }

    public Antwort getWert() {
        return wert;
    }

	public Lernkarte<T> getLernkarte()
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

	public boolean isWarRichtig()
	{
		return warRichtig;
	}

	public void setWarRichtig(final boolean inWarRichtig)
	{
		warRichtig = inWarRichtig;
	}
	
	public Student getAnswerer()
	{
		return this.answerer;
	}
}
