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
public class Subtraction implements Calculation {

    private Calculation calculation;

    @Override
    public void setNext(Calculation calculation) {
        this.calculation = calculation;
    }

    @Override
    public void calculate(UserInput userInput) {
        if (userInput.getOperation().equals("substract")) {
            System.out.println(" the substraction is : " + (userInput.getNumber1() - userInput.getNumber2()));

        } else {
            System.out.println("only add and substract no other option");
        }
    }

}
