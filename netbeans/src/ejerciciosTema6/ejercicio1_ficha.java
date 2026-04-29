/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema6;

import java.util.Random;
import java.util.Scanner;

public class ejercicio1_ficha {
    public static void main(String[] args) {
        char[] letras = new char[10];

        // Llenar el array con letras aleatorias (A–Z o a–z)
        for (int i = 0; i < 10; i++) {

            // Elegir al azar si será mayúscula o minúscula
            if (Math.random() < 0.5) {
                letras[i] = (char) ('A' + (int)(Math.random() * 26));
            } else {
                letras[i] = (char) ('a' + (int)(Math.random() * 26));
            }
        }

        // Mostrar en mayúsculas
        System.out.println("En mayúsculas:");
        for (int i = 0; i < 10; i++) {
            System.out.print(Character.toUpperCase(letras[i]) + " ");
        }

        // Mostrar en minúsculas
        System.out.println("\nEn minúsculas:");
        for (int i = 0; i < 10; i++) {
            System.out.print(Character.toLowerCase(letras[i]) + " ");
        }        
    }   
}