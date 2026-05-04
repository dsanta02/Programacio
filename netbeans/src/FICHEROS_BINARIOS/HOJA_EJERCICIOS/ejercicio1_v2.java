/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio1_v2 {

    public static void main(String[] args) {
        
        ObjectOutputStream out = null;
        
        int [] tabla = {1, 34, 45, 5, 23, 23, 34, 23,69,45};
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("datoos.dat"));
            out.writeObject(tabla);
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
