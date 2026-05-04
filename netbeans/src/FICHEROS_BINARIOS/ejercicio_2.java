/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS;

import java.util.*;
import java.io.*;

public class ejercicio_2 implements Serializable{

    public static void main(String[] args) {
        
        String estrofa = "con diez cañones por banda,"
                        + "viento en popa a toda vela,"
                        + "no corta el mar sino vuela";
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("cancion.dat"));
                out.writeObject(estrofa);
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
