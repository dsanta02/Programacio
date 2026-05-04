/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS;

import java.io.*;
import java.util.*;

public class ejercicio_4 {

    public static void main(String[] args) {
        
        ObjectInputStream in = null;
        
        int [] tabla = new int [10];
        
        try {
            in = new ObjectInputStream(new FileInputStream("datos.dat"));
            for (int i : tabla) {
              tabla[i] = in.readInt();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
}
