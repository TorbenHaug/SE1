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
import se1_aufgabe3.cardarchive.antwort.Antwort.AntwortType;
import se1_aufgabe3.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class Lernkarte<T extends IAntwort> implements PersistentEntity, ILernkarte<T>
{
    private final UUID id;
    private final String frage;
    private final IProfessor ersteller;
    private T antwort;
    private final ArrayList<IAnhang> anhaenge;
    private final IFach fach;

    public Lernkarte(String frage, IProfessor ersteller, T antwort, ArrayList<IAnhang> anhaenge, IFach fach) {
        this.id = UUID.randomUUID();
        this.frage = frage;
        this.ersteller = ersteller;
        this.antwort = antwort;
        this.anhaenge = anhaenge;
        this.fach = fach;
    }

    @Override
    public String getFrage() {
        return frage;
    }

    @Override
    public IProfessor getErsteller() {
        return ersteller;
    }

    @Override
    public T getAntwort() {
        return antwort;
    }

    public void setAntwort(T inAntwort)
    {
        this.antwort = inAntwort;
    }

    @Override
    public ArrayList<IAnhang> getAnhaenge() {
        return anhaenge;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public IFach getFach() {
        return fach;
    }

    @Override
    public T prepareAnswer(final Object inValue)
    {
        T moeglicheAntwort = this.getAntwort();
        if(moeglicheAntwort instanceof ISingleChoiceAntwort)
        {
            List<IAntwortMoeglichkeit> antwortAuswahl = new ArrayList<>();
            antwortAuswahl.add(new AntwortMoeglichkeit(((IAntwortMoeglichkeit)inValue).getAntwort(), true));
            return (T)new SingleChoice(antwortAuswahl);
        }
        else if(moeglicheAntwort instanceof IMultiChoiceAntwort)
        {
            List<IAntwortMoeglichkeit> antwortAuswahl = new ArrayList<>();
            List<IAntwortMoeglichkeit> gewaehlt = (List)inValue;
            for(IAntwortMoeglichkeit moeglichkeit : gewaehlt)
            {
                antwortAuswahl.add(new AntwortMoeglichkeit(moeglichkeit.getAntwort(), true));
            }
            return (T)new MultiChoice(antwortAuswahl);
        }
        else if(moeglicheAntwort instanceof IFreitextAntwort)
        {
            return (T)new Freitext((String)inValue);
        }
        else if(moeglicheAntwort instanceof IAudioAntwort)
        {
            return (T)new Audio(new File((String)inValue));
        }
        else if(moeglicheAntwort instanceof IBildAntwort)
        {
            return (T)new Bild(new File((String)inValue));
        }

        return null;
    }

	@Override
	public AntwortType getType() {
		return this.antwort.getType();
	}
}
