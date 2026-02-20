package com.gameshop;

/**
 * Procesador de ventas con descuentos VIP.
 *
 * @author [PON TU NOMBRE AQUÍ]
 */
public class ProcesadorVentas {

    // VULNERABILIDAD SONARLINT: Contraseña en texto plano
    private String dbClave = "admin_super_secreto_123";

    /**
     * Calcula el precio final con descuento VIP e IVA.
     *
     * @param precioBase el precio base del juego
     * @param esVIP true si el cliente es VIP, false en caso contrario
     * @return el precio final con descuentos e IVA aplicados
     */
    public double calcularPrecio(double precioBase, boolean esVIP) {
        double descuento = 0;

        if (esVIP) {
            // CODE SMELL: Magic Number (0.15 representa el 15% de descuento)
            descuento = precioBase * 0.15;
        }

        // FIX: Al VIP se le debe RESTAR el descuento, no sumarlo
        double precioFinal = precioBase - descuento;

        // CODE SMELL: Magic Number (1.21 representa el 21% de IVA)
        precioFinal = precioFinal * 1.21;

        return precioFinal;
    }
}