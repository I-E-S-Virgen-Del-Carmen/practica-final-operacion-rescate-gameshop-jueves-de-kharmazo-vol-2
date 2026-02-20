package com.gameshop;

/**
 * Sistema de recompensas para clientes VIP.
 * Gestiona los niveles de cliente según los puntos acumulados.
 *
 * @author [Pablo]
 */
public class SistemaRecompensasVIP {

    // Constantes para niveles de cliente
    private static final String PREMIUM = "Premium";
    private static final String ESTRELLA = "*";
    private static final String CLIENTE_LEYENDA = "¡CLIENTE LEYENDA!";
    private static final String CLIENTE_ORO = "¡CLIENTE ORO!";

    // Puntos necesarios para cada nivel (evita magic numbers)
    private static final int PUNTOS_LEYENDA = 500;
    private static final int PUNTOS_ORO = 100;

    /**
     * Comprueba si el cliente es VIP Premium.
     *
     * @param tipoCliente el tipo de cliente a verificar
     * @return true si es Premium, false en caso contrario o si es null
     */
    public boolean comprobarVip(String tipoCliente) {
        // FIX: Previene NullPointerException cuando tipoCliente es null
        if (tipoCliente == null) {
            return false;
        }
        return PREMIUM.equals(tipoCliente);
    }

    /**
     * Genera un reporte con estrellas según los puntos del cliente.
     * Añade el nivel correspondiente (Oro o Leyenda) si se alcanzan los puntos.
     *
     * @param puntos los puntos acumulados del cliente
     * @return el reporte generado con estrellas y nivel del cliente
     */
    public String generarReporte(int puntos) {
        StringBuilder reporte = new StringBuilder();

        // Añade una estrella por cada punto
        for (int i = 0; i < puntos; i++) {
            reporte.append(ESTRELLA);
        }

        // Añade el nivel del cliente según los puntos
        reporte.append(obtenerNivelCliente(puntos));

        return reporte.toString();
    }

    /**
     * Obtiene el nivel del cliente según sus puntos.
     *
     * @param puntos los puntos acumulados del cliente
     * @return el string del nivel correspondiente (vacío, Oro o Leyenda)
     */
    private String obtenerNivelCliente(int puntos) {
        if (puntos >= PUNTOS_LEYENDA) {
            return CLIENTE_LEYENDA;
        } else if (puntos >= PUNTOS_ORO) {
            return CLIENTE_ORO;
        }
        return "";
    }
}