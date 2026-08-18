/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglosjava;

/**
 *
 * @author pc
 */
public class Arreglosjava {

    public static void main(String[] args) {
              // Arreglo de edades
        int[] edades = {18, 22, 25, 34, 45};
        
        System.out.println("El arreglo tiene " + edades.length + " elementos");
        System.out.println("Primer valor: " + edades[0]);
        System.out.println("Valor en la posición 3: " + edades[3]);
        
        // Recorrido con for
        System.out.println("\nRecorrido con for:");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Posición " + i + ": " + edades[i]);
        }
        
        // Recorrido con for-each
        System.out.println("\nRecorrido con for-each:");
        for (int edad : edades) {
            System.out.println(edad);
        }
        
        // Matriz
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        // Suma de cada fila
        System.out.println("\nSuma de cada fila:");
        for (int fila = 0; fila < matriz.length; fila++) {
            int sumaFila = 0;
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                sumaFila += matriz[fila][columna];
            }
            System.out.println("Suma fila " + fila + ": " + sumaFila);
        }
        
        // Suma de cada columna
        System.out.println("\nSuma de cada columna:");
        for (int columna = 0; columna < matriz[0].length; columna++) {
            int sumaColumna = 0;
            for (int fila = 0; fila < matriz.length; fila++) {
                sumaColumna += matriz[fila][columna];
            }
            System.out.println("Suma columna " + columna + ": " + sumaColumna);
        }
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++ ) {
     sumaDiagonal += matriz[i][i];
 }
 System.out.println("Suma Diagonal principal " + " : " + sumaDiagonal);
    }
}
