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

    private static int getTotalJuegos(int totalJuegos, int copiasDisponibles) {
        return totalJuegos + copiasDisponibles;
    }

    private static void obtenerStock(String[] nombreJuegos, int[] copiasDisponibles, int i) {
        if (copiasDisponibles[i] <= LIMITE_STOCK) {
            System.out.println("¡ALERTA! Pedir más copias de " + nombreJuegos[i]);
        }
    }
}