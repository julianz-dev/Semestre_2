package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Martillo", 15000.0, 10);
        ProductoFisico producto2 = new ProductoFisico("Libro", 5000.0, 30, 1);
        ProductoDigital producto3 = new ProductoDigital("Office", 600000.0, 15, 10);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);

        for (Producto producto : productos) {
            producto.vender(22);
            System.out.println(producto);
        }

    }
}
