package com.example;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto (String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public int getStock (){
        return stock;
    }

    public void vender (int cantidad){
        if (cantidad <= 0) {
            System.out.println("Invalido");
        }
        else if (cantidad > stock) {
            System.out.println("Stock insuficiente");
        }
        else{
            this.stock-=cantidad;
        }
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
    }

}
