/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.iterator;

/**
 *
 * @author samarpita
 */
public class IteratorClient {

    public static void main(String[] args) {
        Ipod ipod = new Ipod();

        ipod.setSongs("jana gana mana");
        ipod.setSongs("purano sei diner katha");

        SongsIterator iterator = ipod.getIterator();

        while (iterator.hasNext()) {
            String song = iterator.Next();
            System.out.println("\n\n\n\n\n song : " + song);
        }

    }

}
