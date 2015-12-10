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
public interface FacebookGroupMediator {
    public void registerUSer(User user);
    public void broadcastMessage(User user, String msg);
}
