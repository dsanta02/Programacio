/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicioTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escribe el numero: ");
            int n = sc.nextInt();
            if (n <= 0){
                System.out.println("numero no valido");
            } else {
                for (int i = 1; i <= n; i++) {
                 for (int j = 1; j <= i; j++){
                     System.out.print("*");
                 }
                 System.out.println();
                }
            }
        
    }
}