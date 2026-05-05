/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.EJERCICIOS_FINALES.Ejercicio10_Arrays;

import java.io.*;


public class Cliente implements Serializable{
    
    String id;
    String nombre;
    int numero;

    public Cliente(String id, String nombre, int numero) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", numero=" + numero + '}';
    }
    
    
    
}
