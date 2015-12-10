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
public class Addition implements Calculation {

    private Calculation calculation;

    @Override
    public void setNext(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void calculate(UserInput userInput) {
        if (userInput.getOperation().toString().equals("add")) {
            System.out.println(" the summation is : " + (userInput.getNumber1() + userInput.getNumber2()));

        } else {
            calculation.calculate(userInput);
        }
    }

}
