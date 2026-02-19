package com.gameshop;

public class ProcesadorVentas {

    public static final double DESCUENTO = 0.15;
    public static final double IVA = 1.21;
    // VULNERABILIDAD SONARLINT: Contraseña en texto plano
    public double calcularPrecio(double precioOriginal, boolean esVip) {
        double descuento = calcularDescuento(precioOriginal, esVip);

        // BUG LÓGICO: Al VIP se le está SUMANDO el descuento al precio original, encareciendo el juego.
        double precioFinal = precioOriginal - descuento;

        // CODE SMELL: Magic Number (1.21 representa el 21% de IVA)
        precioFinal = precioFinal * IVA;

        return precioFinal;
    }

    private static double calcularDescuento(double precioOriginal, boolean esVip) {
        double descuento = 0;

        if (esVip) {
            // CODE SMELL: Magic Number (0.15 representa el 15% de descuento)
            descuento = precioOriginal * DESCUENTO;
        }
        return descuento;
    }
}