/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS.Ejercicio_10_conList;

import java.io.*;


public class Cliente implements Serializable{
    
    String id;
    String nombre;
    int numerloTel;

    public Cliente(String id, String nombre, int numerloTel) {
        this.id = id;
        this.nombre = nombre;
        this.numerloTel = numerloTel;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", numerloTel=" + numerloTel + '}';
    }
    
     
}
