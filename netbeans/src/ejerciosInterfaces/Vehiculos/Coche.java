/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciosInterfaces.Vehiculos;

/**
 *
 * @author disacr127
 */
public class Coche implements vehiculo{ //implementa la interfaz vehiculo 
    
    @Override
    public void arrancar() {
        System.out.println("El coche está arrancando...");
    }
}
