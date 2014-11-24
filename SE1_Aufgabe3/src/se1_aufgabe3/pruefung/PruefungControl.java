package se1_aufgabe3.pruefung;

import java.util.Collection;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.answers.IAnswerRegistry;
import se1_aufgabe3.cardarchive.*;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public class PruefungControl implements IPruefungControl
{
	private final IAnswerRegistry m_answerRegistry;

	public PruefungControl(final IAnswerRegistry inAnswerRegistry)
	{
		m_answerRegistry = inAnswerRegistry;
	}

	@Override
	public IUebung createFor(IStudent inStudent, IFach inFach, Collection<ILernkarte<? extends IAntwort>> inLernkarten)
	{
		IUebung uebung = new Uebung(inStudent, this.m_answerRegistry);
		uebung.addLernkarten(new CardSelection(inFach, inFach.getLernkarten()));
		return uebung;
	}
}