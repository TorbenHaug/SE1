/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe3.accounting;

import se1_aufgabe3.common.EmailType;
import se1_aufgabe3.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class Student implements PersistentEntity, IStudent {
    private final String name;
    private final String akennung;
    private final int matrikelNr;
    private final int semester;
    private final EmailType mail;

    public Student(String name, String akennung, int matrikelNr, int semester, EmailType inEmail) {
	    if(!isValidKennung(akennung))
		    throw new InvalidKennungException(akennung + " is not a valid kennung.");

        this.name = name;
        this.akennung = akennung;
        this.matrikelNr = matrikelNr;
        this.semester = semester;
        this.mail = inEmail;
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
    
    public EmailType getEmail()
    {
    	return this.mail;
    }
    
	public static boolean isValidKennung(String inKennung)
	{
		return inKennung.startsWith("a") && inKennung.matches("[a-z]{3}[0-9]{3}");
	}
}
