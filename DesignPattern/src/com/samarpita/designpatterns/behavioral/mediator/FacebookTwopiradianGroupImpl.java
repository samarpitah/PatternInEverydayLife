/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author samarpita
 */
public class FacebookTwopiradianGroupImpl implements FacebookGroupMediator {
    
    private List<User> userList = new ArrayList<>();
    
    @Override
    public void registerUSer(User user) {
        userList.add(user);
    }
    
    @Override
    public void broadcastMessage(User user, String msg) {
        for (User userObj : userList) {
            
            if (userObj != user) {
                userObj.receiveMessage(msg);
            }
        }
        
    }
}
