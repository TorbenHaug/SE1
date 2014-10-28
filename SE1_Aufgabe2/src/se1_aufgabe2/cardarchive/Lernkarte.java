/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive;

import java.util.ArrayList;
import java.util.UUID;
import se1_aufgabe2.accounting.Professor;

/**
 *
 * @author ClausTorben
 */
public class Lernkarte {
    private final UUID id;
    private final String frage;
    private final Professor ersteller;
    private final Antwort antwort;
    private final ArrayList<Anhang> anhaenge;
    private final Fach fach;

    public Lernkarte(String frage, Professor ersteller, Antwort antwort, ArrayList<Anhang> anhaenge, Fach fach) {
        this.id = UUID.randomUUID();
        this.frage = frage;
        this.ersteller = ersteller;
        this.antwort = antwort;
        this.anhaenge = anhaenge;
        this.fach = fach;
    }

    public String getFrage() {
        return frage;
    }

    public Professor getErsteller() {
        return ersteller;
    }

    public Antwort getAntwort() {
        return antwort;
    }

    public ArrayList<Anhang> getAnhaenge() {
        return anhaenge;
    }

    public UUID getId() {
        return id;
    }

    public Fach getFach() {
        return fach;
    }
}
