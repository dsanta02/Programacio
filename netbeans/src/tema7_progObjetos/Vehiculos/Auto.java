/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.Vehiculos;


public class Auto extends Vehiculo {

    private int numeroPuertas;

    public Auto(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio); //INVOCA DE LA CALSE PADRE
        this.numeroPuertas = numeroPuertas;
    }

    @Override //MODIFICA LOS METODOS DEL PADRE
    public double calcularImpuesto() {
        return anio * 200 * 0.10;
    }

    @Override //MODIFICAS LOS METODOS DEL PADRE
    public String toString() {
        return super.toString() +
               ", Puertas: " + numeroPuertas +
               ", Impuesto: " + calcularImpuesto();
    }
}
