/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.cardarchive;

import java.util.Collection;
import java.util.UUID;
import se1_aufgabe3.cardarchive.antwort.Antwort;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

/**
 *
 * @author ClausTorben
 */
public interface ICardArchive {
    IFach getFachByName(String inName);
    Collection<IFach> getFaecher();
    IFach createWithName(String inName);
    
    ILernkarte<? extends IAntwort> getLernkarteByID(UUID inID);
    Collection<ILernkarte<? extends IAntwort>> getLernkarten();
    
    IAntwort createAntwort(Antwort.AntwortType type);

    ICardSelection createSelection(IFach inFach, Collection<ILernkarte<? extends IAntwort>> inSelection);

    <T extends IAntwort> T prepareAnswer(ILernkarte<T> inKarte, Object inValue);
}
