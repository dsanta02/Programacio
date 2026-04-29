/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio3_9 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do { 
            System.out.print("introduzca un numero del 1 al 10: ");
            num = sc.nextInt();
        } while (!(1<= num && num <=10));
        System.out.println("\n\nTabla del " + num);
        for ( int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}
        

