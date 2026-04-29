/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema5;

import java.util.Scanner;

public class ejercicio5_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escribe un numero para que te pida los numeros: ");
            int n = sc.nextInt();
            int numeros[] = new int [n];
            for (int i = 0; i < n; i++) { //i enpieza en 0 y se repite hasta que i seas mayor q n una vez sea ,mayor q n se termmina el bucle
                System.out.println("escriba un numero: ");
                numeros[i] = sc.nextInt();
            }
            int sumaPositivos = 0, contadorPositivos = 0;
            int sumaNegativos = 0, contadorNegativos = 0;
            int contadorCeros = 0;
            
            for (int num : numeros) {
                if (num < 0) {
                    sumaPositivos += num;
                    contadorPositivos ++;
                } else if (num > 0) {
                    sumaNegativos += num;
                    contadorNegativos ++;
                } else {
                    contadorCeros ++;
                }
            }
            
            
            
    }
}
