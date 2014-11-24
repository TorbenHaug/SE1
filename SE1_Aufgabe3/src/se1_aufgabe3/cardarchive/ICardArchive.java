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
 * Zentrale Lernkartenverwaltungskomponente
 * 
 */
public interface ICardArchive {
	/**
	 * gibt ein Fach anhand seines Namens zurück
	 * 
	 * @param inName
	 * @return IFach
	 */
    IFach getFachByName(String inName);
    
    /**
     * Gibt alle registrierten Fächer zurück
     * 
     * @return Collection<IFach>
     */
    Collection<IFach> getFaecher();
    
    /**
     * Erstellt und speichert ein Fach
     * @param inName
     * @return
     */
    IFach createWithName(String inName);
    
    /**
     * Gibt eine Lernkarte anhand seiner UUID zurück
     * 
     * @param inID
     * @return ILernkarte<? extends IAntwort>
     */
    ILernkarte<? extends IAntwort> getLernkarteByID(UUID inID);
    
    /**
     * Gibt alle Lernkarten zurück 
     * 
     * @return Collection<ILernkarte<? extends IAntwort>>
     */
    Collection<ILernkarte<? extends IAntwort>> getLernkarten();
    
    /**
     * Erstellt eine neue Antwort
     * 
     * @param type
     * @return IAntwort
     */
    IAntwort createAntwort(Antwort.AntwortType type);

    /**
     * Erstellt aus einer Collection von Lernkarten CardSelection
     *  
     * @param inFach - Fach das dieser Auswahl zugeordnet werden soll
     * @param inSelection - Liste von lernkarten die der Selection zugeordnet werden soll.
     * @return ICardSelection
     */
    ICardSelection createSelection(IFach inFach, Collection<ILernkarte<? extends IAntwort>> inSelection);

    /**
     * Prototye Generator für Lernkarten
     * 
     * @param inKarte - Bearbeitete Lernkarte
     * @param inValue - Antwort wert des Users
     * @return
     */
    <T extends IAntwort> T prepareAnswer(ILernkarte<T> inKarte, Object inValue);
}
