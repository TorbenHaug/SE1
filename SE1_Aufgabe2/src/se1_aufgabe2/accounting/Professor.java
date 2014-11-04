/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.accounting;

import se1_aufgabe2.common.EmailType;
import se1_aufgabe2.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class Professor implements PersistentEntity {
    private final String name;
    private final int perNr;
    private final String hawKennung;
    private final EmailType mail;

    public Professor(String name, int perNr, String hawKennung, EmailType inMail) {
        this.name = name;
        this.perNr = perNr;
        this.hawKennung = hawKennung;
        this.mail = inMail;
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
    
    public EmailType getEmail()
    {
    	return this.mail;
    }
}
