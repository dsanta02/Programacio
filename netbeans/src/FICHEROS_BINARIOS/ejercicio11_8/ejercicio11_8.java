/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.ejercicio11_8;

import java.io.*;
import java.util.*;

public class ejercicio11_8 implements Serializable{
    
    public static void main(String[] args) throws ClassNotFoundException {
            Socio [] tabla = new Socio[4];
            tabla[0] = new Socio("1" , "pepe");
            tabla[1] = new Socio("2" , "andres");
            tabla[2] = new Socio("6" , "ale");
            tabla[3] = new Socio("9" , "pedro");
            
            ObjectOutputStream out = null;
            
            System.out.println(Arrays.toString(tabla));
            
            try {
            out = new ObjectOutputStream(new FileOutputStream("socios.dat"));
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
            
            ObjectInputStream in = null;
            
            try {
            in = new ObjectInputStream(new FileInputStream("socios.dat"));
            tabla = (Socio []) in.readObject();
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
