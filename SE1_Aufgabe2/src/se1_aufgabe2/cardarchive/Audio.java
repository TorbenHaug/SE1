/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1_aufgabe2.cardarchive;

import java.io.File;

/**
 *
 * @author ClausTorben
 */
public class Audio extends Antwort {
    private final File audio;

    public Audio(File audio) {
        this.audio = audio;
    }

    public File getAudio() {
        return audio;
    }
}
