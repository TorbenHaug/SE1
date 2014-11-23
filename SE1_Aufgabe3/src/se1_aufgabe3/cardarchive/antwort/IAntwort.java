package se1_aufgabe3.cardarchive.antwort;

public interface IAntwort
{
	Antwort.AntwortType getType();

	public boolean isCorrect(IAntwort inAntwort);

	public boolean needsManualCheck();
}
