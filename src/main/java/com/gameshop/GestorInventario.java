package com.gameshop;

import java.util.logging.Logger;

public class GestorInventario {

    public static final int LIMITE_STOCK = 5;

    private static final Logger logger = Logger.getLogger(GestorInventario.class.getName());

    public void verInventario(String[] nombreJuegos, int[] copiasDisponibles) {
        int totalJuegos = 0;

        for (int i = 0; i < nombreJuegos.length; i++) {
            logger.log(java.util.logging.Level.INFO, "Revisando stock de: {0}", nombreJuegos);

            obtenerStock(nombreJuegos, copiasDisponibles, i);

            totalJuegos = getTotalJuegos(totalJuegos, copiasDisponibles[i]);
        }
        logger.log(java.util.logging.Level.INFO, "Total de juegos en el almacén: {0}", totalJuegos);
    }

    /**
     * Calcula el total de juegos
     *
     * @param totalJuegos Total de juegos actuales
     * @param copiasDisponibles Numero de copias actuales
     * @return El nuevo total de juegos sumando las copias
     */

    private static int getTotalJuegos(int totalJuegos, int copiasDisponibles) {
        return totalJuegos + copiasDisponibles;
    }

    /**
     * Verifica el stock de un juego y manda una alerta si el stock es menor de 5.
     *
     * @param nombreJuegos Array con los nombres de los juegos
     * @param copiasDisponibles Array con todas las copias de cada juego
     * @param i posicion del juego que hemos pedido analizar
     */
    private static void obtenerStock(String[] nombreJuegos, int[] copiasDisponibles, int i) {
        if (copiasDisponibles[i] <= LIMITE_STOCK) {
            logger.log(java.util.logging.Level.WARNING, "¡ALERTA! Pedir más copias de {0}", nombreJuegos);
        }
    }
}