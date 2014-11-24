/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.cardarchive.antwort;

import java.util.*;

/**
 *
 * @author ClausTorben
 */
public class MultiChoice extends Antwort implements IMultiChoiceAntwort
{
    private final List<IAntwortMoeglichkeit> antwortMoeglichkeiten;

    public MultiChoice(List<IAntwortMoeglichkeit> antwortMoeglichkeiten) {
	    super(AntwortType.MultiChoice);
        this.antwortMoeglichkeiten = antwortMoeglichkeiten;
    }

    @Override
    public List<IAntwortMoeglichkeit> getAntwortMoeglichkeiten() {
        return antwortMoeglichkeiten;
    }
	
	@Override
	public void addAntwortMoeglichkeit(String inAntwort, boolean inIstRichtig)
	{
		this.antwortMoeglichkeiten.add(new AntwortMoeglichkeit(inAntwort, inIstRichtig));
	}

	@Override
	public void removeAntwortMoeglichkeit(IAntwortMoeglichkeit inMoeglichkeit)
	{
		this.antwortMoeglichkeiten.remove(inMoeglichkeit);
	}

	@Override
	public Collection<IAntwortMoeglichkeit> getRichtigeAntworten()
	{
		List<IAntwortMoeglichkeit> richtig = new ArrayList<>();
		for(IAntwortMoeglichkeit antwortMoeglichkeit : this.antwortMoeglichkeiten)
		{
			if(antwortMoeglichkeit.isRichtig())
				richtig.add(antwortMoeglichkeit);
		}

		return richtig;
	}

	@Override
	public boolean isCorrect(final IAntwort inAntwort)
	{
		if(!(inAntwort instanceof IMultiChoiceAntwort))
			throw new IncompatibleAnswersException();

		IMultiChoiceAntwort multiChoiceAntwort = (IMultiChoiceAntwort)inAntwort;
		if(multiChoiceAntwort.getAntwortMoeglichkeiten().size() != this.getAntwortMoeglichkeiten().size())
			return false;

		for(IAntwortMoeglichkeit moeglichkeit : this.getAntwortMoeglichkeiten())
		{
			if(!multiChoiceAntwort.getAntwortMoeglichkeiten().contains(moeglichkeit))
				return false;
		}

		return true;
	}

	@Override
	public boolean needsManualCheck()
	{
		return false;
	}
}
