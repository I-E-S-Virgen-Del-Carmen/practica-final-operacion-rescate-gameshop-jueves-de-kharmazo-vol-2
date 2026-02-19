package com.gameshop;

public class GestorInventario {

    public static final int LIMITE_STOCK = 5;

    public void verInventario(String[] nombreJuegos, int[] copiasDisponibles) {
        int totalJuegos = 0;

        for (int i = 0; i < nombreJuegos.length; i++) {
            System.out.println("Revisando stock de: " + nombreJuegos[i]);

            obtenerStock(nombreJuegos, copiasDisponibles, i);

            totalJuegos = getTotalJuegos(totalJuegos, copiasDisponibles[i]);
        }
        System.out.println("Total de juegos en el almacén: " + totalJuegos);
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
            System.out.println("¡ALERTA! Pedir más copias de " + nombreJuegos[i]);
        }
    }
}