/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Interfaces.GestionVehiculos;

/**
 *
 * @author disacr127
 */
public class Camion extends Vehiculo{
    
    int capacidadCarga;

    public Camion(int capacidadCarga, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public double calcularImpuestos() {
        return 10 *anio *200;
    }

    @Override
    public String toString() {
        return "Camion{" + "capacidadCarga=" + capacidadCarga + '}';
    }
    
    
    
}
