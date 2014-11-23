package se1_aufgabe3.cardarchive;

import java.util.Collection;
import java.util.Iterator;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public class CardSelection implements ICardSelection
{
	private final IFach m_fach;
	private final Collection<ILernkarte<? extends IAntwort>> m_lernkarten;
	private final Iterator<ILernkarte<? extends IAntwort>> m_iterator;

	public CardSelection(final IFach inFach, final Collection<ILernkarte<? extends IAntwort>> inLernkarten)
	{
		m_fach = inFach;
		m_lernkarten = inLernkarten;
		m_iterator = this.m_lernkarten.iterator();
	}

	@Override
	public IFach getFach()
	{
		return m_fach;
	}

	@Override
	public Collection<ILernkarte<? extends IAntwort>> getLernkarten()
	{
		return m_lernkarten;
	}

	@Override
	public ILernkarte<? extends IAntwort> getNext()
	{
		if(!this.m_iterator.hasNext())
			return null;

		return this.m_iterator.next();
	}
}
