package se1_aufgabe3.pruefung;

import java.util.*;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ICardSelection;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.*;
import se1_aufgabe3.common.AnswerResult;

public class Uebung implements IUebung
{
	private ICardSelection m_cardSelection;
	private final IStudent m_student;
	private Map<ILernkarte<? extends IAntwort>, IAntwort> m_antworten = new HashMap<>();

	public Uebung(IStudent inStudent)
	{
		m_student = inStudent;
	}

	@Override
	public void addLernkarten(ICardSelection inCardSelection)
	{
		this.m_cardSelection = inCardSelection;
	}

	@Override
	public IStudent getStudent()
	{
		return this.m_student;
	}

	@Override
	public boolean isOver()
	{
		return this.m_antworten.size() == this.m_cardSelection.getLernkarten().size();
	}

	@Override
	public boolean canContinue()
	{
		return !this.isOver();
	}

	@Override
	public boolean isUebung()
	{
		return true;
	}

	@Override
	public Collection<IAntwort> getAntworten()
	{
		return this.m_antworten.values();
	}

	@Override
	public AnswerResult setAnswer(Object inAntwort)
	{
		IAntwort moeglicheAntwort = this.m_cardSelection.getCurrent().getAntwort();
		IAntwort neueAntwort = null;
		if(moeglicheAntwort instanceof ISingleChoiceAntwort)
		{
			IAntwortMoeglichkeit gewaehlt = ((ISingleChoiceAntwort)moeglicheAntwort).getAntwortMoeglichkeiten().get((Integer)inAntwort);
			neueAntwort = this.m_cardSelection.getCurrent().prepareAnswer(gewaehlt);
		}

		this.m_antworten.put(this.m_cardSelection.getCurrent(), neueAntwort);
		if(!this.m_cardSelection.getCurrent().getAntwort().needsManualCheck())
			return this.m_cardSelection.getCurrent().getAntwort().isCorrect(neueAntwort) ? AnswerResult.CORRECT : AnswerResult.WRONG;
		else
			return AnswerResult.PENDING;
	}

	@Override
	public Map<ILernkarte<? extends IAntwort>, IAntwort> getAnswersForLernkarten()
	{
		return this.m_antworten;
	}

	@Override
	public ILernkarte<? extends IAntwort> getNextLernkarte()
	{
		return this.m_cardSelection.getNext();
	}
}