package com.example;

public class PlatoTipico {

    protected String nombre;
    protected double precioBase;

    public PlatoTipico (String nombre, double precioBase){
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public double calcularPrecioFinal(){
        return precioBase;
    }

    public void mostrarFactura(){
        System.out.println(this.nombre);
        System.out.println(calcularPrecioFinal());
    }

}