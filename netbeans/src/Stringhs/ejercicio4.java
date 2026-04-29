/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escriba una frase");
            String frase = sc.nextLine();
            
            int pos1, pos2, pos3;
            
            do {
                System.out.println("escriba una posicion");
                    pos1 = sc.nextInt();
                    
                    if (pos1 < 0 || pos1 > frase.length()) {
                        System.out.println("Error. fuera de rango");
                    }
            } while (pos1 < 0 || pos1 > frase.length());
            
            System.out.println(frase.substring(pos1));
            
            do {
                System.out.println("escriba la posicion desde donde quiere empezar a copir");
                pos2 = sc.nextInt();
                
                if (pos2 < 0|| pos2 > frase.length()) {
                    System.out.println("Error fuera de ranngo");
                }
                
                System.out.println("escriba la posicion hasto donde quiera copiar");
                pos3 = sc.nextInt();
                
                if (pos2 < 0 || pos2 > frase.length()) {
                    System.out.println("Error fuera de rango");
                }
            } while (pos2 < 0 || pos2 > frase.length() || pos3 < 0 || pos3 > frase.length() || pos2 > pos3);
            
            System.out.println(frase.substring(pos2, pos3));
    }
}

