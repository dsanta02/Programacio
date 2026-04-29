/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba la primera frase");
        String frase1 = sc.nextLine();
        
        System.out.println("escriba la segunda frase");
        String frase2 = sc.nextLine();
        
        if (frase1.compareToIgnoreCase(frase2) != 0) {
            String frase3 = frase1 + frase2;
            System.out.println("combinacion de las frases: " + frase3.toUpperCase());
        } else {
            System.out.println("las frases son iguales");
        }
    }
    
}
