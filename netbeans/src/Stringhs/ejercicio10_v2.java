/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner; 

public class ejercicio10_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escriba una frase");
            String frase = sc.nextLine().strip();
            
            String[] palabra = frase.split(" ");
            
            String primera = palabra[0];
            String ultima = palabra[palabra.length -1];
            
            primera = primera.substring(0, 1).toUpperCase() + primera.substring(1);
            ultima = ultima.substring(0, 1).toUpperCase() + ultima.substring(1);
            
            System.out.println("primera palabra: " + primera);
            System.out.println("segunda palabra: " + ultima);
    }
    
}
