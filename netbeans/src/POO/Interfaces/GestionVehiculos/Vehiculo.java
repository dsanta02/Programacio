/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Interfaces.GestionVehiculos;


public abstract class Vehiculo implements Impuestos, Comparable<Vehiculo>{
    private String marca;
    private String modelo;
    int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + '}';
    }

    @Override
    public int compareTo(Vehiculo o) {
        if (this.anio > o.anio) {
            return -1;
        } else if (this.anio < o.anio) {
            return 1;
        } else {
            if (this.marca.compareTo(o.marca) < 0) {
                return -1;
            } else if (this.marca.compareTo(o.marca) > 0) {
                return 1;
            }else {
                return 0;
            }
        }
    }
    
    
}


//Debe devolver un int siguiendo la convención de Comparable:

//< 0 → este objeto va antes que v.
//
//0 → son iguales en orden.
//
//> 0 → este objeto va después que v.