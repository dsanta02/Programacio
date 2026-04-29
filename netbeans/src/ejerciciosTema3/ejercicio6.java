/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTema3;

import java.util.Random;

public class ejercicio6 {
    public static void main(String[] args) {
        Random random = new Random();

        int numeroProhibido = random.nextInt(6) + 1; // Número entre 1 y 6
        int tirada;
        int totalGanado = 0;
        int contadorTiradas = 0;

        System.out.println("🎲 Bienvenido al juego del dado 🎲");
        System.out.println("El número prohibido (oculto) ya ha sido elegido...\n");

        // Bucle de tiradas
        do {
            tirada = random.nextInt(6) + 1; // Simula lanzar el dado (1–6)
            System.out.println("Tirada: " + tirada);

            if (tirada == numeroProhibido) {
                System.out.println("\n❌ ¡Ha salido el número prohibido! (" + numeroProhibido + ")");
                break; // Termina el juego
            }

            totalGanado += tirada;
            contadorTiradas++;

        } while (true); // Se detiene solo con break

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Número de tiradas válidas: " + contadorTiradas);
        System.out.println("Dinero acumulado: " + totalGanado + " puntos");
        System.out.println("------------------");
    }
}      
    
    
