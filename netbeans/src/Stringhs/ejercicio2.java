/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Introduce una palabra: ");
            String palabra = sc.nextLine().toLowerCase();
            
            int vocales = 0;
            int consonantes = 0;
            
            for (int i = 0; i < palabra.length(); i ++){
                char c = palabra.charAt(i);
                
                if (c >= 'a' && c <= 'z') {
                    
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                        vocales ++;
                    } else  {
                        consonantes ++;
                    }
                }
            }
            System.out.println("la palabra contiene " + vocales + " vocales " + 
                    consonantes + " consonantes ");
        }
    }