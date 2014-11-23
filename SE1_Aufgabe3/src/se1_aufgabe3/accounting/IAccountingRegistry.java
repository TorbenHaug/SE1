package se1_aufgabe3.accounting;

public interface IAccountingRegistry
{
	public IStudent getStudentMitKennung(String inKennung);
	public IStudent getStudentMitMatrikelNr(int inNummer);

	public IMitarbeiter getMitarbeiterMitPersonalNr(int inNr);

	public IProfessor getProfessorMitPersonalNr(int inNr);
}
