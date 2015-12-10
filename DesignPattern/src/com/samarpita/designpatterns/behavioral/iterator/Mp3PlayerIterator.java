/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.iterator;

import java.util.List;

/**
 *
 * @author samarpita
 */
public class Mp3PlayerIterator implements SongsIterator {

    private List<String> songs;
    private int currentPosition = 0;

    public Mp3PlayerIterator(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public Boolean hasNext() {

        if (currentPosition == songs.size()) {
            return false;
        }

        return true;
    }

    @Override
    public String Next() {
        String song = songs.get(currentPosition);
        currentPosition++;
        return song;
    }

}
