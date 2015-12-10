/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.command;

/**
 *
 * @author samarpita
 */
public class AC implements ElectronicDevice {

    @Override
    public void On() {
        System.out.println("Please on the AC");
    }

    @Override
    public void off() {
        System.out.println("Please off the AC");
    }

}
