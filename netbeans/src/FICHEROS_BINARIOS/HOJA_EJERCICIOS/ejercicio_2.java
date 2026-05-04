/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio_2 {

    public static void main(String[] args) {
        
        String cadena = "con diez, cañones por banda, +"
                + "con viento en popa a toda vela"
                + "no corta el mar sino vuela"
                + "un velero bergantin";
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("cacnionPirata2.dat"));
            out.writeObject(cadena);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
}
