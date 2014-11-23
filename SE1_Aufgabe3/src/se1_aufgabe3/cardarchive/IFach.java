package se1_aufgabe3.cardarchive;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import se1_aufgabe3.accounting.IProfessor;
import se1_aufgabe3.cardarchive.antwort.Antwort;

public interface IFach
{
	String getName();
	Collection<ILernkarte> getLernkarten();
	<T extends Antwort> void createLernkarte(String frage, T antwort, IProfessor professor, ArrayList<File> anhaengeFile);
}
