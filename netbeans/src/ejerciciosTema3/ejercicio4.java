/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
        System.out.println("----------------------------");

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();
        
        System.out.print("Introduce el cuarto número: ");
        double num4 = scanner.nextDouble();

        System.out.print("Elige una opción (1-4): ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Resultado de la suma: " + (num1 + num2 + num3 + num4));

            case 2 -> System.out.println("Resultado de la resta: " + (num1 - num2 - num3 - num4));

            case 3 -> System.out.println("Resultado de la multiplicación: " + (num1 * num2 * num3 * num4));
            
            case 4 -> System.out.println("fin del programa");
                    
            default -> System.out.println("Opción no válida. Programa finalizado.");
        }
        } while (opcion !=4);
    }    
}
