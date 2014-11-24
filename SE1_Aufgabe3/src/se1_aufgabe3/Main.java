package se1_aufgabe3;

import se1_aufgabe3.accounting.AccountingRegistry;
import se1_aufgabe3.accounting.IAccountingRegistry;
import se1_aufgabe3.answers.AnswerRegistry;
import se1_aufgabe3.answers.IAnswerRegistry;
import se1_aufgabe3.cardarchive.*;
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
			AnswerResult result = uebung.setAnswer(0);
			results[result.ordinal()]++;
		}

		control.finishUebung(uebung);

		System.out.println(String.format("Richtig: %d ; Falsch: %d ; Ausstehend: %d", results));
	}
}