/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.EJERCICIOS_FINALES;

import java.util.*;
import java.io.*;

public class ejercicio14_B {
 
    public static void main(String[] args) throws ClassNotFoundException {
        
        int [] array = {1, 22,35,68,23,12,55,14,17,46,33};
        
        guardarArchivo("numGen3.dat", array);
        
        procesarDatos();
                
        ExportacioFichero();
        
        
        
    }
    
    static void guardarArchivo (String archivo, int[] array) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))){
            for (int i : array) {
                out.writeInt(i);
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void procesarDatos () {
        
        try (   ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares.dat"));
                ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("numGen3.dat"))){
                       
                while (true) {
                    
                    try {
                        int num = in.readInt();
                        if (num % 2 == 0) {
                            System.out.println(num + "par");
                            pares.writeInt(num);
                        } else {
                            System.out.println(num + "inpar");
                            inpares.writeInt(num);
                        }
                    } catch (EOFException e) {
                        return;
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }   
        
        }
    
    static void ExportacioFichero () {
        
        try (   ObjectInputStream in = new ObjectInputStream(new FileInputStream("numGen3.dat"));
                BufferedWriter out = new BufferedWriter(new FileWriter("datos3.txt"))){
            
            
            while (true) {
                
                try {
                    int num = in.readInt();
                    if (num % 2 == 0) {
                        out.write(num + " par");
                    }else {
                        out.write(num + " inpar");
                    }
                    out.newLine();
                } catch (EOFException e) {
                    break;
                }
            }
                   
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
