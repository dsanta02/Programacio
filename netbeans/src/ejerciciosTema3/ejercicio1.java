import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un numero entero positivo (negativo para salir): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Programa finalizado.");
                break;
            }

            int suma = 0;
            int i = 1;

            while (i <= numero) {
                if (i % 2 == 0) {
                    suma += i;
                }
                i++;
            }

            System.out.println("La suma de los numeros pares hasta " + numero + " es: " + suma);
        }

        scanner.close();
    }
}