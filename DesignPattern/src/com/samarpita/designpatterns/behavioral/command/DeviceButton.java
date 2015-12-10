/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samarpita
 */
public class DeviceButton {
    
    public static void main(String[] args) {
        ElectronicDevice heater = new Heater();
        ElectronicDevice ac = new AC();
        List<Command> commands = new ArrayList<>();
        commands.add(new ACOff(ac));
        commands.add(new HeaterOn(heater));
        
        Remote remote = new Remote();
        remote.takeAction(commands);
    }
    
}
