package se1_aufgabe2.answers;

import java.util.Collection;
import se1_aufgabe2.accounting.Student;

public interface IAnswerRegistry
{
	public Collection<AbgegebeneAntwort> getAntwortenVonStudent(Student inStudent);
}
