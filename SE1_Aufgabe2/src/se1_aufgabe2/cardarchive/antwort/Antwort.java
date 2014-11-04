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
public class Antwort implements PersistentEntity {
    public static enum AntwortType{
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

	public AntwortType getType()
	{
		return type;
	}
}
