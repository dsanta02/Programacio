/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author disacr127
 */
import java.util.*;
import java.io.*;


public class EJERCICIO14_FINAL_CORREGIDO {

    public static void main(String[] args) throws ClassNotFoundException {
        
        int [] array = {4, 5, 2, 45, 66, 3, 22, 26};
        
        guardarArray("numerosGen.dat", array);
        
        int [] nuevo = procesar();
        
        exportarFichero();
        
        
    }
    
    static int[] procesar () throws ClassNotFoundException {
        int [] array = new int[0];
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("numerosGen.dat"));
            ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
            ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares.dat"))){

            array = (int[]) in.readObject();
            
            for (int i : array) {
                if (i % 2 == 0) {
                    System.out.println( i + " - par");
                    pares.writeInt(i);
                } else {
                    System.out.println(i + " - inpar");
                    inpares.writeInt(i);
                }
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return array;
    }
    
    static void guardarArray (String ficher, int[] array) {
            
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ficher))) {
            out.writeObject(array);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }   
    }
    
    static void exportarFichero () throws ClassNotFoundException {
        
        
        try (BufferedWriter out = new BufferedWriter(new FileWriter("numerosGen.txt"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("numerosGen.dat"))){

            int [] array = (int[]) in.readObject();
            
            for (int i : array) {
                if (i % 2 == 0) {
                    out.write( i + "- PAR");
                }else {
                    out.write( i + "- INPAR");
                }
                
                out.newLine();
            }
                    
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }   
}
