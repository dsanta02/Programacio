/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculo_v2;


public class Camion extends Vehiculo {
    
   private int capacidadCarga;
   
public Camion(String marca, String modelo, int anio, int capacidadCarga) {
    super(marca, modelo, anio);
    this.capacidadCarga = capacidadCarga;
}
   
   @Override
   public double calcularImpuesto() {
       return anio * 20;
   }
   
   @Override
   public String toString() {
       return super.toString() +
               "capacidad de carga" + 
               capacidadCarga +
               "impuestos: " + calcularImpuesto();
   }
   
}
