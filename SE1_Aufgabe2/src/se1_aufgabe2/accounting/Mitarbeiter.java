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
public class Mitarbeiter implements PersistentEntity{
    private final String name;
    private final int persNr;
    private final EmailType mail;

    public Mitarbeiter(String name, int persNr, EmailType inMail) {
        this.name = name;
        this.persNr = persNr;
        this.mail = inMail;
    }

    public String getName() {
        return name;
    }

    public int getPersNr() {
        return persNr;
    }
    
    public EmailType getEmail()
    {
    	return this.mail;
    }
}
