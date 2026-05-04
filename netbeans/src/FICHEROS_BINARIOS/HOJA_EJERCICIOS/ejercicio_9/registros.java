/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS.ejercicio_9;

import java.io.*;


public class registros implements Serializable{
    
    double temperatura;
    String fecha;

    public registros(double temperatura, String fecha) {
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "registros{" + "temperatura=" + temperatura + ", fecha=" + fecha + '}';
    }
    
    
    
}
