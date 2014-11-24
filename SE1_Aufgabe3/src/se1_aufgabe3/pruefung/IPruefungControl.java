package se1_aufgabe3.pruefung;

import java.util.Collection;
import se1_aufgabe3.accounting.IStudent;
import se1_aufgabe3.cardarchive.IFach;
import se1_aufgabe3.cardarchive.ILernkarte;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public interface IPruefungControl
{
	IUebung createFor(IStudent inStudent, IFach inFach, Collection<ILernkarte<? extends IAntwort>> inLerkarten);

	void finishUebung(IUebung inUebung);
}
