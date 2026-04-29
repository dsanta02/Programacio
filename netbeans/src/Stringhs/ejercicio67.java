/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("introduzca la contraseña");
            String contrasena = sc.nextLine();
            String palabra;
            
            do {
                System.out.println("intruzca la palabra");
                palabra = sc.nextLine();
                
                int comp = contrasena.compareTo(palabra); //creamos una variable para cmparar contraseña y palabra
                
                if (comp == 0) { // si devuelve 0 es ¡que ha acertado
                    System.out.println("ha acertado");
                } else if (comp < 0) { // si devuelve negativo es menor alfabetia
                    System.out.println("la contraseña es menor alfabeticamente");
                } else { // si devuelve positivo es mayor alfabeticamente 
                    System.out.println("la contraseña es mayor alfabeticamente");
                }
            } while (!contrasena.equals(palabra));
    }
    
}
