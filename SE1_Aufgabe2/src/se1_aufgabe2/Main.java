package se1_aufgabe2;

import se1_aufgabe2.accounting.AccountingRegistry;
import se1_aufgabe2.accounting.IAccountingRegistry;
import se1_aufgabe2.answers.AnswerRegistry;
import se1_aufgabe2.answers.IAnswerRegistry;
import se1_aufgabe2.cardarchive.CardArchive;
import se1_aufgabe2.cardarchive.ICardArchive;

public class Main {

	public static void main(String[] args) {
		IAccountingRegistry accounting = new AccountingRegistry();
		ICardArchive cardArchive = new CardArchive(accounting);
		IAnswerRegistry answerRegistry = new AnswerRegistry(accounting, cardArchive);
	}

}
