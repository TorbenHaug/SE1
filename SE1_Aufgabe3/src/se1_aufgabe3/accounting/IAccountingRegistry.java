package se1_aufgabe3.accounting;

/**
 * Zentrale Benuterverwaltung.
 * Interagiert mit LDAP der HAW
 */
public interface IAccountingRegistry
{
	/**
	 * Gibt eine Studenten anhand seiner Kennung zur�ck.
	 * 
	 * @param inKennung
	 * @return
	 */
	public IStudent getStudentMitKennung(String inKennung);
	
	/**
	 * Gibt eine Studenten anhand seiner MatrikelNr zur�ck.
	 * 
	 * @param inNummer
	 * @return
	 */
	public IStudent getStudentMitMatrikelNr(int inNummer);
	
	/**
	 * Gibt einen Mitarbeiter anhand seiner PersonalNr zur�ck
	 * 
	 * @param inNr
	 * @return
	 */
	public IMitarbeiter getMitarbeiterMitPersonalNr(int inNr);
	
	/**
	 * Gibt einen Mitarbeiter anhand seiner PersonalNr. zur�ck
	 * 
	 * @param inNr
	 * @return
	 */
	public IProfessor getProfessorMitPersonalNr(int inNr);

	/**
	 * Pr�ft die Logindaten und gibt den dazugeh�rigen User zur�ck 
	 * @param inUser - Username
	 * @param inPassword - Password
	 * @return IPerson
	 * @throws InvalidCredentialsException
	 */
	public IPerson loginAs(String inUser, String inPassword);
}
