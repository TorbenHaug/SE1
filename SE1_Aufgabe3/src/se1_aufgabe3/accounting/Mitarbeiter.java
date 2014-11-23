/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.accounting;

import se1_aufgabe3.common.EmailType;
import se1_aufgabe3.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class Mitarbeiter implements PersistentEntity, IMitarbeiter
{
    private final String name;
    private final int persNr;
    private final EmailType mail;

    public Mitarbeiter(String name, int persNr, EmailType inMail) {
        this.name = name;
        this.persNr = persNr;
        this.mail = inMail;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPersNr() {
        return persNr;
    }
    
    @Override
    public EmailType getEmail()
    {
    	return this.mail;
    }
}
