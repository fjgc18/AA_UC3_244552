/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**

 */
public class Ordenamiento {
   
     /**
     * Ordena un arreglo de enteros utilizando el algoritmo Bubble Sort.
     * 
     * @param arreglo Arreglo de enteros a ordenar.
     * Precondición:El arreglo no debe ser nulo.
     * Postcondición: El  arreglo se ordenará en orden ascendente.
     */
    public static void bubbleSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
    

     /**
     * Ordena un arreglo de enteros utilizando el algoritmo Quick Sort.
     * 
     * @param arreglo Arreglo de enteros a ordenar.
     * Precondición:El arreglo no debe ser nulo.
     * @param inicio  Índice inicial del segmento a ordenar.
     * @param fin     Índice final del segmento a ordenar.
     * Postcondición:El segmento del arreglo estará ordenado
     */
    public static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(arreglo, inicio, fin);
            quickSort(arreglo, inicio, indicePivote - 1);
            quickSort(arreglo, indicePivote + 1, fin);
        }
    }
    
    
      /**
     * Ordena un arreglo de enteros utilizando el algoritmo Insertion Sort.
     * 
     * @param arreglo El arreglo de enteros a ordenar.
     * 
     * Precondiciones: El arreglo no debe ser nulo.
     * Postcondiciones: El arreglo será ordenado en orden ascendente.
     */
    
    
    public static void insertionSort(int[] arreglo) {
        if (arreglo == null) {
            throw new IllegalArgumentException("El arreglo no puede ser nulo.");
        }
        for (int i = 1; i < arreglo.length; i++) {
            int clave = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = clave;
        }
    }
    
    
/**
     * Ordena un arreglo de números enteros en orden ascendente usando el algoritmo Selection Sort.
     *
     * Objetivo: Encontrar el elemento mínimo de un arreglo y colocarlo en su posición correcta.
     *
     * Lógica: Se divide el arreglo en dos partes: una ordenada y otra no ordenada. En cada iteración, se selecciona el elemento mínimo de la parte no ordenada y se intercambia con el primer elemento de esta parte.
     *
     * Condiciones iniciales: El arreglo no debe ser nulo. Si está vacío, no se realizan operaciones.
     *
     * Ejemplo de flujo:
     * Entrada: [64, 25, 12, 22, 11]
     * Iteración 1: [11, 25, 12, 22, 64]
     * Iteración 2: [11, 12, 25, 22, 64]
     * Iteración 3: [11, 12, 22, 25, 64]
     * Salida: [11, 12, 22, 25, 64]
     *
     * Complejidad:
     * - Mejor caso: O(n^2)
     * - Peor caso: O(n^2)
     *
     * @param arreglo El arreglo de números enteros a ordenar.
     */
    public static void selectionSort(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return; // Si el arreglo es nulo o está vacío, no se realiza ninguna operación.
        }

        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontrar el índice del elemento mínimo
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIdx]) {
                    minIdx = j;
                }
            }
            // Intercambiar el elemento mínimo con el primer elemento
            int temp = arreglo[minIdx];
            arreglo[minIdx] = arreglo[i];
            arreglo[i] = temp;
        }
    }
  
     
    
    /**
     * Método auxiliar para realizar la partición en el algoritmo Quick Sort.
     * 
     * @param arreglo Arreglo de enteros.
     * @param inicio  Índice inicial del segmento a particionar.
     * @param fin     Índice final del segmento a particionar.
     * @return Índice del pivote después de la partición.
     */
  private static int particion(int[] arreglo, int inicio, int fin) {
        int pivote = arreglo[fin];
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (arreglo[j] <= pivote) {
                i++;
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;
        return i + 1;
    }
}


