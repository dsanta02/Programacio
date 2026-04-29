/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio3_13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;
        
        for (int i = 0; i <6 ; i++) {
        System.out.println("escriba su nota: " + (i+1) + "; ");
        notas = sc.nextInt();
        if (notas >= 5) {
            aprobados++;
        } else if ( notas == 4) {
            condicionados++;
        } else {
            suspensos++;
        }
    }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados ( nota = 4): " + condicionados);
        System.out.println("Suspensdos: " + suspensos);
                
}
}
