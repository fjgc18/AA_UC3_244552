
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Thinkpad
 */
public class Pruebas {

    public static void main(String[] args) {
        // Pruebas de Ordenamiento
        int[] arreglo = {4, 3, 1, 2};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));

        Ordenamiento.bubbleSort(arreglo);
        System.out.println("Bubble Sort: " + Arrays.toString(arreglo));

        int[] arreglo2 = {4, 3, 1, 2};
        Ordenamiento.quickSort(arreglo2, 0, arreglo2.length - 1);
        System.out.println("Quick Sort: " + Arrays.toString(arreglo2));

        // Pruebas de Búsquedas
        int indice = Busquedas.busquedaLineal(arreglo, 3);
        System.out.println("Búsqueda Lineal (3): " + indice);

        int indice2 = Busquedas.busquedaBinaria(arreglo, 3);
        System.out.println("Búsqueda Binaria (3): " + indice2);
    }
}

