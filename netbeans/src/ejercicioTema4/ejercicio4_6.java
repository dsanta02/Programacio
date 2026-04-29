/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema4;

import java.util.Scanner;
public class ejercicio4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escriba un numero: ");
            int num = sc.nextInt();
            
            if (esPrimo(num)) {
            System.out.println(num + " es primo");
            } else {
                System.out.println(num + " no es primo");
        }
    }
    
    static boolean esPrimo(int num) {
        if (num < 2) {
        return false;
    } 
    for (int i = 2; i < num; i++) {
        if (num % i == 0 ) {
            return false;
        }
    }
    return true;
}

}
    
