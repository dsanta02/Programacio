/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escriba una frase");
            String frase = sc.nextLine();
            
            System.out.println("escriba una palabra");
            String palabra = sc.nextLine();
            
            String[] palabra2 = frase.split("\\s+");
            
            int cont = 0;
            
            for (int i = 0; i < palabra2.length; i ++) {
                if (palabra2[i].equals(palabra)) {
                    cont ++;
                }
            }
            
            System.out.println("la palabra " + palabra + "se ha repetido " + cont + " veces");
    }
    
}
