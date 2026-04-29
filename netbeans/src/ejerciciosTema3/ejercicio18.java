/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;
import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;          
        int suma = 0;     

        do {
            System.out.print("Introduce un número par: ");
            num = sc.nextInt();
            if (num % 2 != 0) {
                System.out.println("⚠️ El número no es par. Inténtalo otra vez.");
            }
        } while (num % 2 != 0);  

        for (int i = 0; i <= num; i += 2) {  
            int j = i;
            do {
                suma += j; 
                j++; 
            } while (j == i); 
        }

        System.out.println("La suma de los números pares hasta " + num + " es: " + suma);

        sc.close();
    }
}