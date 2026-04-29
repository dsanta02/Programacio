/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Interfaces.GestionVehiculos;

import ejerciosInterfaces.Calculadora.CalculadoraSimple;


public class Auto extends Vehiculo{
    
    int numeroPuertas;

    public Auto(int numeroPuertas, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public double calcularImpuestos() {
        return 0.5 * anio * 100;
    }

    @Override
    public String toString() {
        return "Auto{" + "numeroPuertas=" + numeroPuertas + '}';
    }
    
    
    
}
