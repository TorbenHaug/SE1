package se1_aufgabe3.accounting;

import se1_aufgabe3.common.EmailType;
/**
 * Zentrale Account Verwaltungs Komponente
 * 
 *
 */
public class AccountingRegistry implements IAccountingRegistry {

	
	public AccountingRegistry() {
		
	}
	
	/* (non-Javadoc)
	 * @see se1_aufgabe3.accounting.IAccountingRegistry#getStudentMitKennung(java.lang.String)
	 */
	@Override
	public IStudent getStudentMitKennung(String inKennung) {
		return new Student("Tim Hagemann", inKennung, 2170310, 3, new EmailType("tim.hagemann@haw-hamburg.de"));
	}

	/* (non-Javadoc)
	 * @see se1_aufgabe3.accounting.IAccountingRegistry#getStudentMitMatrikelNr(int)
	 */
	@Override
	public IStudent getStudentMitMatrikelNr(int inNummer) {
		return new Student("Tim Hagemann", "abq264", inNummer, 3, new EmailType("tim.hagemann@haw-hamburg.de"));
	}

	/* (non-Javadoc)
	 * @see se1_aufgabe3.accounting.IAccountingRegistry#getMitarbeiterMitPersonalNr(int)
	 */
	@Override
	public IMitarbeiter getMitarbeiterMitPersonalNr(int inNr) {
		return new Mitarbeiter("Fritz Wurst", inNr, new EmailType("fritz.wurst@haw-hamburg.de"));
	}

	/* (non-Javadoc)
	 * @see se1_aufgabe3.accounting.IAccountingRegistry#getProfessorMitPersonalNr(int)
	 */
	@Override
	public IProfessor getProfessorMitPersonalNr(int inNr) {

		return new Professor("Hans Wurst", inNr, "hans.wurst", new EmailType("hans.wurst@haw-hamburg.de"));
	}

	/* (non-Javadoc)
	 * @see se1_aufgabe3.accounting.IAccountingRegistry#loginAs(java.lang.String, java.lang.String)
	 */
	@Override
	public IPerson loginAs(final String inUser, final String inPassword)
	{
		if(inUser.equals("abq264") && inPassword.equals("1337H4X0R"))
			return new Student("Tim Hagemann", "abq264", 2170310, 3, new EmailType("tim.hagemann@haw-hamburg.de"));

		throw new InvalidCredentialsException();
	}
}
