/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio3_12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean suspensos = false;
        for (int i = 0; i < 5; i++); {
        System.out.println("Escribba su nota: ");
        int notas = sc.nextInt();
        if (notas < 5) {
            suspensos = true;
            }    
        }
    }
}
