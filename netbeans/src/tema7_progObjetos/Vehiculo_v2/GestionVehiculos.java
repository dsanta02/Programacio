/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculo_v2;

import java.util.Scanner;

public class GestionVehiculos {

    static Vehiculo[] vehiculos = new Vehiculo[20];
    static int contVehiculos = 0;

    static Concesionario[] concesionarios = new Concesionario[10];
    static int contConcesionarios = 0;

    static Propietario[] propietarios = new Propietario[20];
    static int contPropietarios = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Vehículos ---");
            System.out.println("1. Agregar un vehículo");
            System.out.println("2. Listar todos los vehículos");
            System.out.println("3. Agregar un propietario");
            System.out.println("4. Crear concesionario");
            System.out.println("5. Listar vehículos en concesionario");
            System.out.println("6. Añadir vehículo a concesionario");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    agregarVehiculo(sc);
                    break;

                case 2:
                    listarVehiculos();
                    break;

                case 3:
                    agregarPropietario(sc);
                    break;

                case 4:
                    crearConcesionario(sc);
                    break;

                case 5:
                    listarVehiculosConcesionario(sc);
                    break;

                case 6:
                    agregarVehiculoAConcesionario(sc);
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        sc.close();
    }


    public static void agregarVehiculo(Scanner sc) {

        if (contVehiculos >= vehiculos.length) {
            System.out.println("No hay espacio para más vehículos.");
            return;
        }

        System.out.println("1. Auto");
        System.out.println("2. Camion");
        System.out.println("3. Motocicleta");
        int tipo = sc.nextInt();

        System.out.print("Marca: ");
        String marca = sc.next();

        System.out.print("Modelo: ");
        String modelo = sc.next();

        System.out.print("Año: ");
        int anio = sc.nextInt();

        if (tipo == 1) {

            System.out.print("Número de puertas: ");
            int puertas = sc.nextInt();

            vehiculos[contVehiculos++] =
                    new Auto(marca, modelo, anio, puertas);

        } else if (tipo == 2) {

            System.out.print("Capacidad de carga: ");
            int carga = sc.nextInt();

            vehiculos[contVehiculos++] =
                    new Camion(marca, modelo, anio, carga);

        } else if (tipo == 3) {

            System.out.print("Cilindrada: ");
            int cilindrada = sc.nextInt();

            vehiculos[contVehiculos++] =
                    new Motocicleta(marca, modelo, anio, cilindrada);
        }

        System.out.println("Vehículo creado correctamente.");
    }

    // ----------------------------
    // LISTAR TODOS LOS VEHÍCULOS
    // ----------------------------
    public static void listarVehiculos() {

        if (contVehiculos == 0) {
            System.out.println("No hay vehículos.");
            return;
        }

        for (int i = 0; i < contVehiculos; i++) {
            System.out.println((i + 1) + ". " + vehiculos[i]);
        }
    }

    // ----------------------------
    // AGREGAR PROPIETARIO
    // ----------------------------
    public static void agregarPropietario(Scanner sc) {

        if (contPropietarios >= propietarios.length) {
            System.out.println("No hay espacio para más propietarios.");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.next();

        System.out.print("Apellidos: ");
        String apellidos = sc.next();

        System.out.print("DNI: ");
        String dni = sc.next();

        System.out.print("Dirección: ");
        String direccion = sc.next();

        propietarios[contPropietarios++] =
                new Propietario(nombre, apellidos, dni, direccion);

        System.out.println("Propietario creado correctamente.");
    }

    // ----------------------------
    // CREAR CONCESIONARIO
    // ----------------------------
    public static void crearConcesionario(Scanner sc) {

        if (contConcesionarios >= concesionarios.length) {
            System.out.println("No hay espacio para más concesionarios.");
            return;
        }

        System.out.print("Nombre del concesionario: ");
        String nombre = sc.next();

        System.out.print("Dirección: ");
        String direccion = sc.next();

        concesionarios[contConcesionarios++] =
                new Concesionario(nombre, direccion);

        System.out.println("Concesionario creado correctamente.");
    }

    // ----------------------------
    // LISTAR VEHÍCULOS EN CONCESIONARIO
    // ----------------------------
    public static void listarVehiculosConcesionario(Scanner sc) {

        if (contConcesionarios == 0) {
            System.out.println("No hay concesionarios.");
            return;
        }

        System.out.println("Seleccione concesionario:");

        for (int i = 0; i < contConcesionarios; i++) {
            System.out.println((i + 1) + ". Concesionario: "
                    + concesionarios[i].nombre +
                    " Dirección: "
                    + concesionarios[i].direccion);
        }

        int indice = sc.nextInt() - 1;

        if (indice >= 0 && indice < contConcesionarios) {
            concesionarios[indice].listarVehiculos();
        } else {
            System.out.println("Índice inválido.");
        }
    }

    // ----------------------------
    // AÑADIR VEHÍCULO A CONCESIONARIO
    // ----------------------------
    public static void agregarVehiculoAConcesionario(Scanner sc) {

        if (contConcesionarios == 0 || contVehiculos == 0) {
            System.out.println("Debe haber vehículos y concesionarios creados.");
            return;
        }

        System.out.println("Seleccione concesionario:");

        for (int i = 0; i < contConcesionarios; i++) {
            System.out.println((i + 1) + ". Concesionario: "
                    + concesionarios[i].nombre +
                    " Dirección: "
                    + concesionarios[i].direccion);
        }

        int indiceConce = sc.nextInt() - 1;

        if (indiceConce < 0 || indiceConce >= contConcesionarios) {
            System.out.println("Índice inválido.");
            return;
        }

        System.out.println("Seleccione vehículo:");

        for (int i = 0; i < contVehiculos; i++) {
            System.out.println((i + 1) + ". " + vehiculos[i]);
        }

        int indiceVehiculo = sc.nextInt() - 1;

        if (indiceVehiculo < 0 || indiceVehiculo >= contVehiculos) {
            System.out.println("Índice inválido.");
            return;
        }

        concesionarios[indiceConce]
                .agregaVehiculo(vehiculos[indiceVehiculo]);

        System.out.println("Se ha agregado el vehículo al concesionario.");
    }
}
