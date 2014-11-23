/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.answers;

import se1_aufgabe2.accounting.*;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.Antwort;
import se1_aufgabe3.cardarchive.antwort.IAntwort;
import se1_aufgabe3.common.PersistentEntity;
import se1_aufgabe3.accounting.IMitarbeiter;
import se1_aufgabe3.accounting.IStudent;

/**
 *
 * @author ClausTorben
 */
public class AbgegebeneAntwort<T extends Antwort> implements PersistentEntity, IAbgegebeneAntwort<T>
{
    private final IAntwort wert;
	private final ILernkarte<T> lernkarte;
	private IMitarbeiter geprueftVon;
	private boolean warRichtig;
	private final IStudent answerer;

    public AbgegebeneAntwort(IAntwort wert, IStudent inAnswerer, ILernkarte<T> inLernkarte) {
        this.wert = wert;
	    this.lernkarte = inLernkarte;
	    this.warRichtig = false;
	    this.answerer = inAnswerer;
    }

    @Override
    public IAntwort getWert() {
        return wert;
    }

	@Override
	public ILernkarte<T> getLernkarte()
	{
		return lernkarte;
	}

	@Override
	public IMitarbeiter getGeprueftVon()
	{
		return geprueftVon;
	}

	@Override
	public void setGeprueftVon(IMitarbeiter inGeprueftVon)
	{
		geprueftVon = inGeprueftVon;
	}

	@Override
	public boolean isWarRichtig()
	{
		return warRichtig;
	}

	@Override
	public void setWarRichtig(final boolean inWarRichtig)
	{
		warRichtig = inWarRichtig;
	}
	
	@Override
	public IStudent getAnswerer()
	{
		return this.answerer;
	}
}
