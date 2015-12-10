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
public class MediatorClient {

    public static void main(String[] args) {
        FacebookGroupMediator facebookGroupMediator = new FacebookTwopiradianGroupImpl();
        User user1 = new UserImpl(facebookGroupMediator, "sam");
        User user2 = new UserImpl(facebookGroupMediator, "Arjun");
        User user3 = new UserImpl(facebookGroupMediator, "Partha");
        User user4 = new UserImpl(facebookGroupMediator, "Kunal");

        user1.sendMessage("hi");
    }

}
