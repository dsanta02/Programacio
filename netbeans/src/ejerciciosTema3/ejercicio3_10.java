/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio3_10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int impar;
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            impar = 2*i -1;
            suma = suma + impar;
        }
        System.out.println ("La suma de los 10 primeros impares es de: " + suma);
        
    }
}