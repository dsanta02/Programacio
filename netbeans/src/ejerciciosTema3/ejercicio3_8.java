/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio3_8 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
            int suma = 0;
            double media;
            for ( int i = 1; i <= 10; i++) {
                System.out.println("Escriba un numero: ");
                num = sc.nextInt();
                suma = suma + num;
            }
            media = suma / 10.0;
            System.out.println("La media es de : " + media);
        }
}

        

