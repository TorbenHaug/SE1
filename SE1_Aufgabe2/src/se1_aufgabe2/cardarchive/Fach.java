/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import se1_aufgabe2.accounting.Professor;
import se1_aufgabe2.cardarchive.antwort.Antwort;
import se1_aufgabe2.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class Fach implements PersistentEntity {
    private final String name;
    private final List<Lernkarte> lernkarten;

    public Fach(String name){
        this.name = name;
        this.lernkarten = loadFromDB();
    }
    
    public String getName() {
        return name;
    }
    
    public Collection<Lernkarte> getLernkarten()
    {
        return null;
    }
     
    private List<Lernkarte> loadFromDB(){
        //funktion to load
        return new ArrayList<>();
    }
    
    public <T extends Antwort> void createLernkarte(String frage, T antwort, Professor professor, ArrayList<File> anhaengeFile){
        ArrayList<Anhang> anhaenge = new ArrayList<>();
        for (File f: anhaengeFile){
            anhaenge.add(new Anhang(f));
        }
        getLernkarten().add(new Lernkarte<>(frage, professor, antwort, anhaenge, this));
    }
}
