package com.gameshop;

/**
 * Sistema de recompensas para clientes VIP.
 *
 * @author [Pablo]
 */
class SistemaRecompensasVIP {
    private static final String PREMIUM = "Premium";
    private static final String ESTRELLA = "*";
    private static final String CLIENTE_LEYENDA = "¡CLIENTE LEYENDA!";
    private static final String CLIENTE_ORO = "¡CLIENTE ORO!";
    private static final int PUNTOS_LEYENDA = 500;
    private static final int PUNTOS_ORO = 100;

    /**
     * Comprueba si el cliente es VIP Premium.
     *
     * @param tipoCliente el tipo de cliente
     * @return true si es Premium, false en caso contrario
     */
    public boolean comprobarVip(String tipoCliente) {
        if (tipoCliente == null) {
            return false;
        }
        return PREMIUM.equals(tipoCliente);
    }

    /**
     * Genera un reporte con estrellas según los puntos.
     *
     * @param puntos los puntos del cliente
     * @return el reporte generado
     */
    public String generarReporte(int puntos) {
        StringBuilder reporte = new StringBuilder();

        for (int i = 0; i < puntos; i++) {
            reporte.append(ESTRELLA);
        }

        if (puntos >= PUNTOS_LEYENDA) {
            reporte.append(CLIENTE_LEYENDA);
        } else if (puntos >= PUNTOS_ORO) {
            reporte.append(CLIENTE_ORO);
        }

        return reporte.toString();
    }
}