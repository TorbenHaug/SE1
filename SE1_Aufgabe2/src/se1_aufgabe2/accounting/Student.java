/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.accounting;

/**
 *
 * @author ClausTorben
 */
public class Student {
    private final String name;
    private final String akennung;
    private final int matrikelNr;
    private final short semester;

    public Student(String name, String akennung, int matrikelNr, short semester) {
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

    public short getSemester() {
        return semester;
    }
    
    
}
