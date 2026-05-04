/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio_6 {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        ObjectInputStream in = null;
        
        try {
            in = new ObjectInputStream(new FileInputStream("cancionPirata2.dat"));
            String cancion = (String) in.readObject();
            
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
