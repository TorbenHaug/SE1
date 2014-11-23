package se1_aufgabe3.accounting;

import se1_aufgabe3.common.EmailType;

public class AccountingRegistry implements IAccountingRegistry {

	
	public AccountingRegistry() {
		
	}
	
	@Override
	public IStudent getStudentMitKennung(String inKennung) {
		return null;
	}

	@Override
	public IStudent getStudentMitMatrikelNr(int inNummer) {
		return null;
	}

	@Override
	public IMitarbeiter getMitarbeiterMitPersonalNr(int inNr) {
		return null;
	}

	@Override
	public IProfessor getProfessorMitPersonalNr(int inNr) {

		return null;
	}

	@Override
	public IPerson loginAs(final String inUser, final String inPassword)
	{
		if(inUser.equals("abq264") && inPassword.equals("1337H4X0R"))
			return new Student("Tim Hagemann", "abq264", 2170310, 3, new EmailType("tim.hagemann@haw-hamburg.de"));

		return null;
	}
}
