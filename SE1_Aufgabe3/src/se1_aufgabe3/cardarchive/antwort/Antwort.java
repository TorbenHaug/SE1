/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.cardarchive.antwort;

import se1_aufgabe3.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public abstract class Antwort implements PersistentEntity, IAntwort
{
    public static enum AntwortType {
        MultiChoice,
        SingleChoice,
        Freitext,
        Bild,
        Audio
    }

	private final AntwortType type;

	protected Antwort(AntwortType inType)
	{
		this.type = inType;
	}

	@Override
	public AntwortType getType()
	{
		return type;
	}

	@Override
	public boolean isCorrect(final IAntwort inAntwort)
	{
		return false;
	}

	@Override
	public boolean needsManualCheck()
	{
		return true;
	}
}
