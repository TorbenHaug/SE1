package se1_aufgabe3.pruefung;

import java.util.Collection;
import java.util.Map;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ICardSelection;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;
import se1_aufgabe3.common.AnswerResult;

public interface IUebung
{
	void addLernkarten(ICardSelection inCardSelection);
	IStudent getStudent();
	boolean isOver();
	boolean canContinue();
	boolean isUebung();
	ILernkarte<? extends IAntwort> getNextLernkarte();
	Collection<IAntwort> getAntworten();
	AnswerResult addAntwort(IAntwort inAntwort);
	Map<ILernkarte<? extends IAntwort>, IAntwort> getAnswersForLernkarten();
}
