package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Laptop", 1500000.0, 15);
        Producto producto2 = new Producto("Teclado", 160000.0, 20);

        producto1.vender(2);
        producto2.vender(21);

        producto1.setPrecio(2000000.0);

        ArrayList<Producto> tecnologia = new ArrayList<>();
        tecnologia.add(producto1);
        tecnologia.add(producto2);
        for (Producto producto : tecnologia) {
            System.out.println(producto.toString());
        }

        System.out.println(producto2.getStock());

    }

}
