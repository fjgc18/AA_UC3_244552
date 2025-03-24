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
     * Postcondición:El segmento del arreglo estará ordenado.
     */
    public static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(arreglo, inicio, fin);
            quickSort(arreglo, inicio, indicePivote - 1);
            quickSort(arreglo, indicePivote + 1, fin);
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


