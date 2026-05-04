/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS.Ejercicio9_ConList;

import java.io.*;
public class Registros implements Serializable{
    
    double temperatura;
    String fecha;

    public Registros(double temperatura, String fecha) {
        this.temperatura = temperatura;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Registros{" + "temperatura=" + temperatura + ", fecha=" + fecha + '}';
    }
    

}
