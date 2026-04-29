/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Interfaces.GestionVehiculos;

/**
 *
 * @author disacr127
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo [5]; 
        
        
        vehiculos [0] = new Auto(2, "seat", "ibiza", 2001);
        vehiculos [1] = new Auto(4, "renault", "megane", 2001);
        vehiculos [2] = new Camion(2, "iveco", "super", 2012);
        vehiculos [3] = new Auto(5, "jaguar", "xyz", 2022);
        vehiculos [4] = new Camion(1, "mercedes", "cla", 2026);
        
        
        Arrays.sort(vehiculos);
        
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        
    }
    }
}
