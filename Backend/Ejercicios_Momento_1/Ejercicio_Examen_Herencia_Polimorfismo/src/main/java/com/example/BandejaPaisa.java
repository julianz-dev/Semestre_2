package com.example;

public class BandejaPaisa extends PlatoTipico {

    private boolean incluyeAguacateExtra;

    public BandejaPaisa(String nombre, double precioBase, boolean incluyeAguacateExtra) {
        super(nombre, precioBase);
        this.incluyeAguacateExtra = incluyeAguacateExtra;
    }

    @Override
    public double calcularPrecioFinal() {
        if (incluyeAguacateExtra) {
            return this.precioBase + 3000;
        }
        else{
            return this.precioBase;
        }
    }

    @Override
    public void mostrarFactura() {
        super.mostrarFactura();
    }
}
