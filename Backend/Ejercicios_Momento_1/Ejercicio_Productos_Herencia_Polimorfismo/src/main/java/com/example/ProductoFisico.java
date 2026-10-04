package com.example;

public class ProductoFisico extends Producto {

    double kg;

        public ProductoFisico (String nombre, double precio, int stock, double kg){
            super (nombre, precio, stock);
            this.kg = kg;
    }



}
