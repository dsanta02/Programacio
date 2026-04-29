/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio5{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            String contrasenaCorrecta = "java123";
            String contrasenaIngresada;
            
            do {
                System.out.print("Introduce la contraseña: ");
                contrasenaIngresada = sc.nextLine();
                
                if (!contrasenaIngresada.equals(contrasenaCorrecta)) {
                    System.out.println("Contraseña incorrecta. Intenta otra vez.");
                }
            } while (!contrasenaIngresada.equals(contrasenaCorrecta));
            
            System.out.println("¡Contraseña correcta! Acceso concedido.");
        }
    }
}
    


