/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba una frase en su dialecto");
        String frase = sc.nextLine();
        
        String[] cadena = frase.split("\\s+");
        
        String f1 = "javalin, javalon";
        String f2 = "javalen, len, len";
        
        if (frase.startsWith(f1)) {
            frase = frase.substring(f1.length());
            System.out.println("traduccion = " + frase);
        }
        
        if (frase.endsWith(f2)) {
            frase = frase.substring(0,frase.length() - f2.length());
            System.out.println("traduccion = " + frase);
        }
    }
}
