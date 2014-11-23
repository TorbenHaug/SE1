package se1_aufgabe3.answers;

import se1_aufgabe3.accounting.IMitarbeiter;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.Antwort;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public interface IAbgegebeneAntwort<T extends Antwort>
{
	IAntwort getWert();
	ILernkarte<T> getLernkarte();
	IMitarbeiter getGeprueftVon();
	void setGeprueftVon(IMitarbeiter inGeprueftVon);
	boolean isWarRichtig();
	void setWarRichtig(boolean inWarRichtig);
	IStudent getAnswerer();
}
