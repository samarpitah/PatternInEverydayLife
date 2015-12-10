/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.mediator;

/**
 *
 * @author samarpita
 */
public class UserImpl implements User {

    private FacebookGroupMediator facebookGroupMediator;
    private String name;

    UserImpl(FacebookGroupMediator facebookGroupMediator, String name) {
        this.facebookGroupMediator = facebookGroupMediator;
        this.name = name;
        registeUserInGroup();

    }

    @Override
    public void sendMessage(String message) {
        facebookGroupMediator.broadcastMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Facebook Group: "+ facebookGroupMediator+" Hello " + name + " New Message : " + message);

    }

    private void registeUserInGroup() {
        facebookGroupMediator.registerUSer(this);

    }

}
