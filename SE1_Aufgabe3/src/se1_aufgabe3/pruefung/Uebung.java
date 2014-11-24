package se1_aufgabe3.pruefung;

import java.util.*;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ICardSelection;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;
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

	//TODO
	@Override
	public AnswerResult setAnswer(Object inAntwort)
	{
		this.m_antworten.put(this.m_cardSelection.getCurrent(), inAntwort);
		if(!this.m_cardSelection.getCurrent().getAntwort().needsManualCheck())
			return this.m_cardSelection.getCurrent().getAntwort().isCorrect(inAntwort) ? AnswerResult.CORRECT : AnswerResult.WRONG;
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