/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema4;

import java.util.Scanner;
public class ejercicio4_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Escriba el primer numero (mayor): ");
            int num1 = sc.nextInt();
            System.out.println("Escriba el segundo numero (menor): ");
            int num2 = sc.nextInt();
            funcion1 (num1, num2);
    }
    static void funcion1 (int a, int b) {
        for (int i = a; i < b; i++) {
            System.out.println(i);
        }
    }
}


