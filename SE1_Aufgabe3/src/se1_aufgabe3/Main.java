package se1_aufgabe3;

import se1_aufgabe3.accounting.AccountingRegistry;
import se1_aufgabe3.accounting.IAccountingRegistry;
import se1_aufgabe3.answers.AnswerRegistry;
import se1_aufgabe3.answers.IAnswerRegistry;
import se1_aufgabe3.cardarchive.CardArchive;
import se1_aufgabe3.cardarchive.ICardArchive;

public class Main {

	public static void main(String[] args) {
		IAccountingRegistry accounting = new AccountingRegistry();
		ICardArchive cardArchive = new CardArchive(accounting);
		IAnswerRegistry answerRegistry = new AnswerRegistry(accounting, cardArchive);
	}

}
