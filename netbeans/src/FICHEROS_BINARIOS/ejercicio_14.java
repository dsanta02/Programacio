/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS;

import java.util.*;
import java.io.*;

public class ejercicio_14 {

    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException{
        
        int[] nums = {3, 8, 15, 22, 7, 10, 11, 4};
        guardarArray("num_general.dat", nums);
        int [] nuevos = Procesamiento();
        
        ExpTxt(nuevos);
        
    }
    
    static int[] Procesamiento () throws ClassNotFoundException {
        
        int [] array = new int [0];
        
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("num_general.dat"));
            ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
            ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares.dat"));
            
            array = (int []) in.readObject();
            
            for (int i : array) {
                
                if (i % 2 == 0) {
                    System.out.println("par");
                    pares.writeInt(i);
                } else {
                    System.out.println("inpar");
                    inpares.writeInt(i);
                }
                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return array;
    }
    
    static void guardarArray (String fichero, int[] array) throws FileNotFoundException {
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream(fichero));
            out.writeObject(array);
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
    
    static void ExpTxt (int [] array) {
        
        BufferedWriter out = null;
        
        try {
            out = new BufferedWriter(new FileWriter("numeros.txt"));
            for (int i : array) {
                if (i % 2 == 0) {
                    out.write(i + "par");
                } else {
                    out.write(i + "INPAR");
                }
                out.newLine();
            }
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
