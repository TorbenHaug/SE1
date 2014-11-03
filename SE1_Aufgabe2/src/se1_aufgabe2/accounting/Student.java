/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.accounting;

import java.util.ArrayList;
import java.util.List;
import se1_aufgabe2.answers.AbgegebeneAntwort;

/**
 *
 * @author ClausTorben
 */
public class Student {
    private final String name;
    private final String akennung;
    private final int matrikelNr;
    private final int semester;
	private final List<AbgegebeneAntwort> abgegebeneLernkarten = new ArrayList<>();

    public Student(String name, String akennung, int matrikelNr, int semester) {
	    if(!isValidKennung(akennung))
		    throw new InvalidKennungException(akennung + " is not a valid kennung.");

        this.name = name;
        this.akennung = akennung;
        this.matrikelNr = matrikelNr;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public String getAkennung() {
        return akennung;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public int getSemester() {
        return semester;
    }

	public List<AbgegebeneAntwort> getAbgegebeneLernkarten()
	{
		return abgegebeneLernkarten;
	}

	public float getRichtigRate()
	{
		int richtig = 0;
		int alle = 0;
		for(AbgegebeneAntwort antwort : this.getAbgegebeneLernkarten())
		{
			if(antwort.getGeprueftVon() != null)
			{
				alle++;
				if(antwort.isWarRichtig())
					richtig++;
			}
		}

		return richtig / alle;
	}

	public static boolean isValidKennung(String inKennung)
	{
		return inKennung.startsWith("a") && inKennung.matches("[a-z]{3}[0-9]{3}");
	}
}
