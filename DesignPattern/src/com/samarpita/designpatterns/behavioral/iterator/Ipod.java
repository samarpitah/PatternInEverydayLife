/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samarpita
 */
public class Ipod implements Mp3Player {

    private List<String> songs;

    private SongsIterator iterator;

    public Ipod() {
        songs = new ArrayList<>();
    }

    public void setSongs(String song) {
        songs.add(song);
    }

    @Override
    public SongsIterator getIterator() {
        iterator = new Mp3PlayerIterator(songs);
        return iterator;

    }
}
