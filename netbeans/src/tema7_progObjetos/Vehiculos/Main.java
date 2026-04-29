/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehiculo[] vehiculos = new Vehiculo[5];
        int contador = 0;
        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar vehiculo");
            System.out.println("2. Listar vehiculos");
            System.out.println("3. Salir");
            System.out.print("Seleccione opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    if (contador >= 5) {
                        System.out.println("No se pueden agregar mas vehiculos");
                        break;
                    }

                    System.out.println("1. Auto");
                    System.out.println("2. Camion");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Año: ");
                    int anio = sc.nextInt();

                    if (tipo == 1) {
                        System.out.print("Numero de puertas: ");
                        int puertas = sc.nextInt();

                        vehiculos[contador++] =
                                new Auto(marca, modelo, anio, puertas);

                    } else if (tipo == 2) {
                        System.out.print("Capacidad carga (tonelaje): ");
                        int carga = sc.nextInt();

                        vehiculos[contador++] =
                                new Camion(marca, modelo, anio,carga);
                    }

                    break;

                case 2:
                    for (int i = 0; i < contador; i++) {
                        System.out.println(vehiculos[i]);
                    }
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 3);

        sc.close();
    }
}
