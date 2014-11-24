package se1_aufgabe3;

import java.util.*;
import se1_aufgabe3.accounting.AccountingRegistry;
import se1_aufgabe3.accounting.IAccountingRegistry;
import se1_aufgabe3.answers.AnswerRegistry;
import se1_aufgabe3.answers.IAnswerRegistry;
import se1_aufgabe3.cardarchive.*;
import se1_aufgabe3.cardarchive.antwort.*;
import se1_aufgabe3.common.AnswerResult;
import se1_aufgabe3.pruefung.*;

public class Main
{

	public static void main(String[] args)
	{
		IAccountingRegistry accounting = new AccountingRegistry();
		ICardArchive cardArchive = new CardArchive(accounting);
		IAnswerRegistry answerRegistry = new AnswerRegistry(accounting, cardArchive);

		IPruefungControl control = new PruefungControl(answerRegistry);
		IFach fach = cardArchive.getFachByName("Software Engineering");
		IUebung uebung = control.createFor(accounting.getStudentMitKennung("abq264"), fach, fach.getLernkarten());
		int[] results = { 0, 0, 0 };
		while(uebung.canContinue())
		{
			ILernkarte<? extends IAntwort> karte = uebung.getNextLernkarte();
			IAntwort moeglicheAntwort = karte.getAntwort();
			IAntwort eigene = null;
			if(moeglicheAntwort instanceof ISingleChoiceAntwort)
			{
				IAntwortMoeglichkeit gewaehlt = ((ISingleChoiceAntwort)moeglicheAntwort).getAntwortMoeglichkeiten().get(0);
				eigene = cardArchive.prepareAnswer(karte, gewaehlt);
			}
			else if(moeglicheAntwort instanceof IMultiChoiceAntwort)
			{
				List<IAntwortMoeglichkeit> liste = new ArrayList<IAntwortMoeglichkeit>();
				liste.add(((IMultiChoiceAntwort)moeglicheAntwort).getAntwortMoeglichkeiten().get(0));
				eigene = cardArchive.prepareAnswer(karte, liste);
			}

			if(eigene != null)
			{
				AnswerResult result = uebung.addAntwort(eigene);
				results[result.ordinal()]++;
			}
		}

		control.finishUebung(uebung);

		System.out.println(String.format("Richtig: %d ; Falsch: %d ; Ausstehend: %d", results));
	}
}