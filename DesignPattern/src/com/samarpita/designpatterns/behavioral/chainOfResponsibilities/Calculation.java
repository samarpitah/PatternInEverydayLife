/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samarpita.designpatterns.behavioral.chainOfResponsibilities;

/**
 *
 * @author samarpita
 */
public interface Calculation {

    public void setNext(Calculation calculation);

    public void calculate(UserInput userInput);

    

}
