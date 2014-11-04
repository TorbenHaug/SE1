/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive;

import java.io.File;
import se1_aufgabe2.common.PersistentEntity;

/**
 *
 * @author ClausTorben
 */
public class Anhang implements PersistentEntity {
    private File file;

    public Anhang(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }
    
    
}
