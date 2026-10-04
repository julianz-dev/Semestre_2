package com.example;

public class Main {

    public static void main(String[] args) {

        CalculadoraSobrecargada calculadora = new CalculadoraSobrecargada();

        System.out.println(calculadora.sumar(10, 5));
        System.out.println(calculadora.sumar(7.5, 2.5));
        System.out.println(calculadora.sumar(4, 6.0));
    }
}