package com.example;

public class ProductoDigital extends Producto {

    int tamaño;

    public ProductoDigital(String nombre, double precio,int stock, int tamaño) {
        super(nombre, precio, stock);
        this.tamaño = tamaño;
    }

    @Override
    public void vender(int cantidad){
        if (getStock() == 0) {
            System.out.println("Producto sin stcok");
        }
        else{
            super.vender(cantidad);
        }
    }

}
