/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciosInterfaces.Vehiculos2;


public class Main {

    public static void main(String[] args) {

        System.out.println("Probando el coche:");
        Vehiculo coche = new Coche();
        coche.arrancar();

        System.out.println("\nProbando la lancha:");
        Navegable lancha = new Lancha();
        lancha.flotar();

        System.out.println("\nProbando el vehículo anfibio:");
        VehiculoAnfibio anfibio = new VehiculoAnfibio();

        anfibio.arrancar();
        anfibio.cambiarModo("agua");
        anfibio.flotar();
    }
}
