/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive.antwort;

import se1_aufgabe2.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class AntwortMoeglichkeit implements PersistentEntity {
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

	@Override
	public boolean equals(final Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o == null || getClass() != o.getClass())
		{
			return false;
		}

		AntwortMoeglichkeit that = (AntwortMoeglichkeit)o;

		if(richtig != that.richtig)
		{
			return false;
		}
		return antwort.equals(that.antwort);
	}

	@Override
	public int hashCode()
	{
		int result = antwort.hashCode();
		result = 31 * result + (richtig ? 1 : 0);
		return result;
	}
}
