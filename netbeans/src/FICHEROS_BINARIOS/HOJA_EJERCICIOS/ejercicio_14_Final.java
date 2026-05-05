/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio_14_Final implements Serializable{
    public static void main(String[] args) throws ClassNotFoundException {
        
        int[] nums = {3, 8, 15, 22, 7, 10, 11, 4};
        guardarArray("numeros1.dat", nums);
        int [] leidos = procesar();
        
        guardarTexto(leidos);
    }
    
    public static void guardarArray (String fichero, int[] nums) {
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream(fichero));
            out.writeObject(nums);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    static int[] procesar () throws ClassNotFoundException {
        int[] nums = new int [0];
        try {
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros1.dat"));
           ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
           ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares.dat"));
           
           nums = (int []) in.readObject();
           
           for (int i : nums) {
               if (i % 2 == 0) {
                   pares.writeInt(i);
                   System.out.println(i + "Pares");
               } else {
                   inpares.writeInt(i);
                   System.out.println(i + "inpares");
               }
           }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return nums;

    }
    
    public static void guardarTexto (int[] nums) {
            
        BufferedWriter out = null;
        
        try {
            out = new BufferedWriter(new FileWriter("numeros.txt"));
            for (int i : nums) {
                if (i % 2 == 0) {
                    out.write(i + "PAR");
                } else {
                    out.write(i + "INPARA");
                }
            }
            out.newLine();
            
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
