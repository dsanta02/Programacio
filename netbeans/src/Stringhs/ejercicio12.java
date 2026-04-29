/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escriba una frase");
            String frase = sc.nextLine();
            
            String[] palabras = frase.split("\\s+");
            
            System.out.println("la frase tine " + palabras.length + " palabras");
            
            String larga = palabras[0];
            String corta = palabras[0];
            
            for (int i = 0; i < palabras.length; i ++) {
                if (palabras[i].length() > larga.length()) {
                    larga = palabras[i];
                }
                
                if (palabras[i].length() < corta.length()) {
                    corta = palabras[i];
                }
            }
            
            System.out.println("palabra mas larga: " + larga);
            System.out.println("palabra mas corta: " + corta);
               
    }
    
}
