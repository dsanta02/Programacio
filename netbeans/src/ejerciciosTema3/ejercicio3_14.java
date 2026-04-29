/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio3_14 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        for (int tabla = 1; tabla<=10; tabla++) {
            System.out.println("\n\nTabla del: " + tabla);
            for (int i = 1; i <=10; i++) {
                System.out.println(tabla + "x" + i + "=" + tabla * i);
            }
        }
    }
}