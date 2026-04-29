/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema4;

import java.util.Scanner;
public class ejercicio4_4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escriba el primer numero: ");
            int num1 = sc.nextInt();
            System.out.println("escriba el segundo numero: ");
            int num2 = sc.nextInt();
            System.out.println("El numero mayor es: " + maximo(num1, num2));
    }
    static int maximo (int a, int b) {
        int max;
        if ( a > b) {
             max = a;
        } else {
             max = b;
        }
        return (max);
    }
}