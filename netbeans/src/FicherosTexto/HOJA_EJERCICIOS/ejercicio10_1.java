/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.io.*;
import java.util.*;

public class ejercicio10_1 {
    public static void main(String[] args) {
        
        int num = leerEntero();
        System.out.println("Número válido: " + num);
    }
    
    public static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                System.out.println("Introduce un numero entero: ");
                num = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un entero.");
                sc.nextLine(); // limpiar buffer
            }
        }

        return num;
    }
}
