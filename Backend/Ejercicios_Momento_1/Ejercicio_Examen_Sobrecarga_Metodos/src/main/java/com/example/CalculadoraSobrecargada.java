package com.example;

public class CalculadoraSobrecargada {

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double sumar(int numero1, double numero2) {
        return numero1 + numero2;
    }
}
