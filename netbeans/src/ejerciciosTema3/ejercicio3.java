package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("----------------------------");

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Elige una opción (1-3): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado de la suma: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado de la resta: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                break;

            default:
                System.out.println("Opción no válida. Programa finalizado.");
                break;
        }
    }    
}

