/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thinkpad
 */
public class Busquedas {
    
    /**
     * Método de búsqueda lineal.
     * @param arreglo Arreglo donde buscar.
     * @param valor Valor a buscar.
     * @return Índice del valor o -1 si no se encuentra.
     */
    public static int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i; // Índice encontrado
            }
        }
        return -1; // Valor no encontrado
    }

    /**
     * Método de búsqueda binaria.
     * @param arreglo Arreglo ordenado donde buscar.
     * @param valor Valor a buscar.
     * @return Índice del valor o -1 si no se encuentra.
     */
    public static int busquedaBinaria(int[] arreglo, int valor) {
        int inicio = 0, fin = arreglo.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arreglo[medio] == valor) {
                return medio;
            } else if (arreglo[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // Valor no encontrado
    }
}

