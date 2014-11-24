package se1_aufgabe3.cardarchive;

import java.util.ArrayList;
import java.util.UUID;
import se1_aufgabe3.accounting.IProfessor;
import se1_aufgabe3.cardarchive.antwort.IAntwort;

public interface ILernkarte<T extends IAntwort>
{
	String getFrage();
	IProfessor getErsteller();
	T getAntwort();
	ArrayList<IAnhang> getAnhaenge();
	UUID getId();
	IFach getFach();
	T prepareAnswer(Object inValue);
}
