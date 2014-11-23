/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.cardarchive;

import java.io.File;
import java.util.*;
import se1_aufgabe3.accounting.IProfessor;
import se1_aufgabe3.cardarchive.antwort.Antwort;
import se1_aufgabe3.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class Fach implements PersistentEntity, IFach
{
    private final String name;
    private final List<ILernkarte> lernkarten;

    public Fach(String name){
        this.name = name;
        this.lernkarten = loadFromDB();
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public Collection<ILernkarte> getLernkarten()
    {
        return null;
    }
     
    private List<ILernkarte> loadFromDB(){
        //funktion to load
        return new ArrayList<>();
    }
    
    @Override
    public <T extends Antwort> void createLernkarte(String frage, T antwort, IProfessor professor, ArrayList<File> anhaengeFile){
        ArrayList<IAnhang> anhaenge = new ArrayList<>();
        for (File f: anhaengeFile){
            anhaenge.add(new Anhang(f));
        }
        getLernkarten().add(new Lernkarte<>(frage, professor, antwort, anhaenge, this));
    }
}
