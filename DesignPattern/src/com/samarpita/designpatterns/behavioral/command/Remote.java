/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.command;

import java.util.List;

/**
 *
 * @author samarpita
 */
public class Remote {

    public void takeAction(List<Command> commandList) {
        for (Command command : commandList) {
            command.execute();
        }

    }

}
