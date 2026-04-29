/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculos;


public class Camion extends Vehiculo{
    
    private int capacidadCarga;
    
    public Camion (String marca, String modelo, int anio, int capacidadCarga) {
        super(marca, modelo, anio); //inicializa los atributos heredados sini no funcionan 
     this.capacidadCarga = capacidadCarga;   
    }
    
    @Override //MODIFICAS LOS METODOS DEL PADRRE
    public double calcularImpuesto() {
        return anio * 20;
    }
    
        @Override //con esto las hijas pueden modificar metodos de los padres
    public String toString() {
        return super.toString() +
               ", Capacidad de carga: " + capacidadCarga + " toneladas" +
               ", Impuesto: " + calcularImpuesto();
    }
    
}
