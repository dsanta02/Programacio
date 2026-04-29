/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema5;


import java.util.Scanner;

public class ejercicio5_3_corregido {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de valores a ingresar: ");
        int n = sc.nextInt();

        int[] numeros = new int[n]; 
        // numeros -> nombre del array
        // int[] -> tipo de dato del array
        // new int[n] -> crea un array nuevo del tamaño n

        for (int i = 0; i < n; i++) { // repetimos n veces
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt(); 
            // Guardamos cada número en su posición correspondiente del array
        }

        int sumaPositivos = 0, contadorPositivos = 0;
        int sumaNegativos = 0, contadorNegativos = 0; 
        int contadorCeros = 0;

        for (int num : numeros) { 
            // Recorremos el array con un for-each
            if (num > 0) {
                sumaPositivos += num;
                contadorPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        // Mostrar resultados
        if (contadorPositivos > 0) {
            double mediaPos = (double) sumaPositivos / contadorPositivos;
            System.out.println("Media de los números positivos: " + mediaPos);
        } else {
            System.out.println("No se han introducido números positivos");
        }

        if (contadorNegativos > 0) {
            double mediaNeg = (double) sumaNegativos / contadorNegativos;
            System.out.println("Media de los números negativos: " + mediaNeg);
        } else {
            System.out.println("No se han introducido números negativos");
        }

        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);
    }
}

            
            
            
            

