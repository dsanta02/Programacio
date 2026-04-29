/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
         char[] letras = {'a', 'B', 'c', 'D', 'e', 'F', 'g', 'H', 'i', 'J'};
         
         for (char c : letras) {
             System.out.print( Character.toUpperCase(c) + " ");
         }
         
         System.out.println("");
        
         for (char c : letras) {
             System.out.print(Character.toLowerCase(c) + " ");
         }
    }
}
