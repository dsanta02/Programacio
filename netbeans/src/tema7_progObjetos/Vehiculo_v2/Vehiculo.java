/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculo_v2;


public abstract class Vehiculo implements Comparable<Vehiculo> {
    String marca;
    String modelo;
    int anio;
    
    public Vehiculo (String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public int getAnio() {
        return anio;
    }
    
    
    @Override
    public String toString () {
        return "marca: " + marca + "modelo: "
                + modelo + "anio: " + anio;
    } 
    
    public abstract double calcularImpuesto();
    
    @Override
    public int compareTo(Vehiculo v) {
        int resultado = Integer.compare(v.getAnio(), this.getAnio());
        
        if (resultado == 0) {
            return this.getMarca().compareToIgnoreCase(v.getMarca());
        }
        return resultado;
    }
}
