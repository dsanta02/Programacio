/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio3_11 {
    public static void main (String[] args) { 
        Scanner sc = new Scanner(System.in);
        int num;
        double factorial;
        System.out.println("escriba un numero: ");
        num = sc.nextInt();
        factorial = 1;
        for ( int i = num; i >0; i--) {
            factorial = factorial * i;
        }
       System.out.println("el factorial de " + num + "es" + factorial);
    }
}