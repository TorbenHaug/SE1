package se1_aufgabe3.cardarchive.antwort;

public interface IAntwort
{
	Antwort.AntwortType getType();

	/**
	 * Prüft ob die gegebene Antwort mit dieser übereinstimmt
	 * 
	 * @param inAntwort	die zu prüfende Antwort
	 * @return			Wahr oder falsch
	 * @throws			IncompatibleAnswersException
	 */
	public boolean isCorrect(IAntwort inAntwort);

	public boolean needsManualCheck();
}
