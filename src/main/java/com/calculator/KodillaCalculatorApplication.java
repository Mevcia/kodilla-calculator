package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCalculatorApplication {

    public static void main(String[] args) {
        Calculator add = new Calculator();
        System.out.println("Sum 5 and 8 equals: " + add.addVariables(5,8));

        Calculator substract = new Calculator();
        System.out.println("Substraction 90 - 30 equals: " + substract.substractVariables(90, 30));
    }
}
