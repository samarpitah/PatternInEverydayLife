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
public class TestClient {

    public static void main(String[] args) {
        Calculation calculationAdd = new Addition();
        Calculation calculationSubstract = new Subtraction();

        calculationAdd.setNext(calculationSubstract);
        UserInput userInput = new UserInput(5, 4, "pow");
        
        calculationAdd.calculate(userInput);
    }

}
