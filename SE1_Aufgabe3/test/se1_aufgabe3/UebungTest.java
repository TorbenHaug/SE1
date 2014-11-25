package se1_aufgabe3;

import org.junit.*;
import se1_aufgabe3.accounting.AccountingRegistry;
import se1_aufgabe3.accounting.IAccountingRegistry;
import se1_aufgabe3.answers.AnswerRegistry;
import se1_aufgabe3.answers.IAnswerRegistry;
import se1_aufgabe3.cardarchive.*;
import se1_aufgabe3.common.AnswerResult;
import se1_aufgabe3.db.DatabaseConnection;
import se1_aufgabe3.pruefung.*;

public class UebungTest
{
	IAccountingRegistry m_accountingRegistry;
	ICardArchive m_cardArchive;
	IAnswerRegistry m_answerRegistry;
	IPruefungControl m_pruefungControl;

	@Before
	public void setup()
	{
		DatabaseConnection.getInstance().connect("jdbc:mysql://localhost:3306/sole", "root", "");
		this.m_accountingRegistry = new AccountingRegistry();
		this.m_cardArchive = new CardArchive(this.m_accountingRegistry);
		this.m_answerRegistry = new AnswerRegistry(this.m_accountingRegistry, this.m_cardArchive);

		this.m_pruefungControl = new PruefungControl(this.m_answerRegistry);
	}

	@Test
	public void testDurchlauf()
	{
		IFach fach = this.m_cardArchive.getFachByName("Software Engineering");
		IUebung uebung = this.m_pruefungControl.createFor(this.m_accountingRegistry.getStudentMitKennung("abq264"), fach, fach.getLernkarten());
		int[] results = { 0, 0, 0 };
		while(uebung.canContinue())
		{
			uebung.getNextLernkarte();
			AnswerResult result = uebung.setAnswer(0);
			results[result.ordinal()]++;
		}

		Assert.assertTrue(results[0] == 3);
		Assert.assertTrue(results[1] == 2);
		Assert.assertTrue(results[2] == 0);
	}
}