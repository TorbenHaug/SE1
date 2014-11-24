package se1_aufgabe3.pruefung;

import java.util.Map;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.answers.IAnswerRegistry;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public class PruefungControl implements IPruefungControl
{
	private final IAnswerRegistry m_answerRegistry;

	public PruefungControl(final IAnswerRegistry inAnswerRegistry)
	{
		m_answerRegistry = inAnswerRegistry;
	}

	@Override
	public IUebung createFor(IStudent inStudent)
	{
		return new Uebung(inStudent);
	}

	@Override
	public void finishUebung(final IUebung inUebung)
	{
		for(Map.Entry<ILernkarte<? extends IAntwort>, IAntwort> antwort : inUebung.getAnswersForLernkarten().entrySet())
		{
			this.m_answerRegistry.saveAnswer(inUebung.getStudent(), antwort.getKey(), antwort.getValue());
		}
	}
}