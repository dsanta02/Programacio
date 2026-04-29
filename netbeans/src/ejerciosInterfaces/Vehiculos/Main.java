/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciosInterfaces.Vehiculos;

public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche();  //se crea estos objetos para poder llamas a sus metodos
        Lancha lancha = new Lancha();
        VehiculoAnfibio anfibio = new VehiculoAnfibio();

        System.out.println("Probando el coche:");
        coche.arrancar();

        System.out.println("\nProbando la lancha:");
        lancha.flotar();

        System.out.println("\nProbando el vehículo anfibio:");
        anfibio.arrancar();
        anfibio.cambiarModo("aire");
        anfibio.flotar();
    }
}
