package se1_aufgabe2.accounting;

public interface IAccountingRegistry
{
	public Student getStudentMitKennung(String inKennung);
	public Student getStudentMitMatrikelNr(int inNummer);

	public Mitarbeiter getMitarbeiterMitPersonalNr(int inNr);

	public Professor getProfessorMitPersonalNr(int inNr);
}
