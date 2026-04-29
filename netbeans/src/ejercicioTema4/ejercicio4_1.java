/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema4;

import java.util.Scanner;
public class ejercicio4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Escriba un numero: ");
            int n = sc.nextInt();
            eco (n);
    }
    static void eco (int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("eco..");
        }
    }
}