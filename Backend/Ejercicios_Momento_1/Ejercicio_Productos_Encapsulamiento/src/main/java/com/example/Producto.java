package com.example;

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0;
        }
        else{
            this.precio = precio;
        }
        
    }

    public int getStock() {
        return stock;
    }

    public void vender(int cantidad){
        if (cantidad > 0) {
            if (cantidad > this.stock) {
                System.out.println("Cantidad no disponible");
            }
            else{
                this.stock = this.stock - cantidad;
            }
        }
        else{
            System.out.println("Cantidad no valida");
        }
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
    }    

}