/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculos;


public abstract class Vehiculo { //sia hay metodo ABSTRACTO LA CLASE TIENE QUE SER ABSTRACTA

    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
               ", Modelo: " + modelo +
               ", Año: " + anio;
    }

    // Método abstracto 
    public abstract double calcularImpuesto();
}

