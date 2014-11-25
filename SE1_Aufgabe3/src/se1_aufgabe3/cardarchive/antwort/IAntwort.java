package se1_aufgabe3.cardarchive.antwort;

public interface IAntwort
{
	Antwort.AntwortType getType();

	/**
	 * Pr�ft ob die gegebene Antwort mit dieser �bereinstimmt
	 * 
	 * @param inAntwort	die zu pr�fende Antwort
	 * @return			Wahr oder falsch
	 * @throws			IncompatibleAnswersException
	 */
	public boolean isCorrect(IAntwort inAntwort);

	public boolean needsManualCheck();
}
