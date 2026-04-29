/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Escriba una palabra");
            String palabra = sc.nextLine();
            
            System.out.println("Escriba un caracter");
            String p2 = sc.nextLine();
            
            int rep = 0;
            
            for (int i = 0; i < palabra.length(); i ++) {
                char c = palabra.charAt(i);
                
                if (c == p2.charAt(0)) { // para poder comparar c con p2 tines q poner charAt para obtener el caracter que quieres comparar
                    rep ++;
                }
            }
            System.out.println("la letra " + p2 + "se repite: " + rep + " veces");
    }
}
