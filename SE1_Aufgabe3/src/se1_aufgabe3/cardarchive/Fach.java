/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.cardarchive;

import java.io.File;
import java.util.*;
import se1_aufgabe3.accounting.IProfessor;
import se1_aufgabe3.cardarchive.antwort.*;
import se1_aufgabe3.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class Fach implements PersistentEntity, IFach
{
    private final String name;
    private final ICardArchive archive;

    public Fach(String name, final ICardArchive inArchive){
        this.name = name;
        archive = inArchive;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public Collection<ILernkarte<? extends IAntwort>> getLernkarten()
    {
        return this.loadFromDB();
    }
     
    private List<ILernkarte<? extends IAntwort>> loadFromDB(){
        List<ILernkarte<? extends IAntwort>> selectiert = new ArrayList<>();
        for(ILernkarte<? extends IAntwort> lernkarte : this.archive.getLernkarten())
        {
            if(!lernkarte.getFach().getName().equals(this.getName()))
                continue;

            if(lernkarte.getAntwort() instanceof ISingleChoiceAntwort || lernkarte instanceof IMultiChoiceAntwort)
                selectiert.add(lernkarte);
        }
        return selectiert;
    }
    
    @Override
    public <T extends Antwort> void createLernkarte(String frage, T antwort, IProfessor professor, ArrayList<File> anhaengeFile){
        ArrayList<IAnhang> anhaenge = new ArrayList<>();
        for (File f: anhaengeFile){
            anhaenge.add(new Anhang(f));
        }
        getLernkarten().add(new Lernkarte<>(frage, professor, antwort, anhaenge, this));
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Fach fach = (Fach)o;

        if(!name.equals(fach.name)) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return name.hashCode();
    }
}
