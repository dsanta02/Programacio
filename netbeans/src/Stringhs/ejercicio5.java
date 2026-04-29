/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("ecriba una frase");
            String frase1 = sc.nextLine();
            
            System.out.println("escriba otra frase");
            String frase2 = sc.nextLine();
            
            int tamaño1 = frase1.length();
            int tamaño2 = frase2.length();
            
            if (tamaño1> tamaño2) {
                System.out.println("la frase mas larga es: " + frase1);
            } else {
                System.out.println("las frase mas larga es: " + frase2);
            }
    }
   
}
