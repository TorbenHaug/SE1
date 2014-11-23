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
public class SingleChoice extends Antwort implements ISingleChoiceAntwort
{
    private final ArrayList<IAntwortMoeglichkeit> antwortMoeglichkeiten;

    public SingleChoice(ArrayList<IAntwortMoeglichkeit> antwortMoeglichkeiten) {
	    super(AntwortType.SingleChoice);
        this.antwortMoeglichkeiten = antwortMoeglichkeiten;
    }

    @Override
    public ArrayList<IAntwortMoeglichkeit> getAntwortMoeglichkeiten() {
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

	public IAntwortMoeglichkeit getRichtigeAntwort()
	{
		for(IAntwortMoeglichkeit antwortMoeglichkeit : this.antwortMoeglichkeiten)
		{
			if(antwortMoeglichkeit.isRichtig())
				return antwortMoeglichkeit;
		}

		throw new NoCorrectAnswerException();
	}

	@Override
	public boolean isCorrect(final IAntwort inAntwort)
	{
		if(!(inAntwort instanceof ISingleChoiceAntwort))
			throw new IncompatibleAnswersException();

		ISingleChoiceAntwort singleChoiceAntwort = (ISingleChoiceAntwort)inAntwort;
		return this.getRichtigeAntwort().equals(singleChoiceAntwort.getRichtigeAntwort());
	}

	@Override
	public boolean needsManualCheck()
	{
		return false;
	}
}
