package se1_aufgabe3.pruefung;

import java.util.ArrayList;
import java.util.Collection;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ICardSelection;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public class Uebung implements IUebung
{
	private ICardSelection m_cardSelection;
	private final IStudent m_student;
	private Collection<IAntwort> m_antworten = new ArrayList<>();

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
		return this.m_antworten;
	}

	@Override
	public void addAntwort(IAntwort inAntwort)
	{
		this.m_antworten.add(inAntwort);
	}
}