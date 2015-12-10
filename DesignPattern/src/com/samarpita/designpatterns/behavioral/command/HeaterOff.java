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
public class HeaterOff implements Command {

    ElectronicDevice electronicDevice;

    public HeaterOff(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
         electronicDevice.off();
    }

}
