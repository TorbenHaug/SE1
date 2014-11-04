/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive;

import java.util.Collection;
import java.util.UUID;
import se1_aufgabe2.cardarchive.antwort.Antwort;

/**
 *
 * @author ClausTorben
 */
public interface ICardArchive {
    Fach getFachByName(String inName);
    Collection<Fach> getFaecher();
    Fach createWithName(String inName);
    
    Lernkarte<? extends Antwort> getLernkarteByID(UUID inID);
    Collection<Lernkarte<? extends Antwort>> getLernkarten();
    
    Antwort createAntwort(Antwort.AntwortType type);
    
    
}
