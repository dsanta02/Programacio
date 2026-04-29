/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escriba palabras separadas por espacios");
            String frase1 = sc.nextLine().strip(); 
            
            int primerEspacio = frase1.indexOf(' ');
            int ultimoEspacio = frase1.lastIndexOf(' ');
            
            String primera = frase1.substring(0, primerEspacio);
            String ultima = frase1.substring(ultimoEspacio + 1);
            
            primera = primera.substring(0, 1).toUpperCase() + primera.substring(1);
            ultima = ultima.substring(0, 1).toUpperCase() + ultima.substring(1);
            
            System.out.println("primera palabra: " + primera);
            System.out.println("segunda palabra: " + ultima);
    }
    
}
