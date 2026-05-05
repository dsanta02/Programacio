/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPASO_FINAL;

import java.util.*;
import java.io.*;

public class ejercicio14_final_A {
 
    public static void main(String[] args) {
        int [] array = {12,2,3,1,546,66,75,78,4345,65,66};
        
        guardar("DtosGenerales.dat", array);
        
        procesar();
        
        exportar();
        
        
    }
    static void guardar (String fichero, int[] array) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero))){
            
            out.writeObject(array);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    static void procesar () {
        try (   ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares.dat"));
                ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("DtosGenerales.dat"));){
            
            int [] caja = (int[]) in.readObject();
            
            for (int i : caja) {
                if (i % 2 == 0) {
                    System.out.println(i + " - par");
                    pares.writeInt(i);
                }else {
                    System.out.println(i + " . inpar");
                    inpares.writeInt(i);
                }
            }
            
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void exportar () {
            
        try (   ObjectInputStream in = new ObjectInputStream(new FileInputStream("DtosGenerales.dat"));
                BufferedWriter ou = new BufferedWriter(new FileWriter("Genrales.txt"));){
            int [] array = (int[]) in.readObject();
            
            for (int i : array) {
                if (i % 2 == 0) {
                    ou.write(i + " - PAR");
                }else {
                    ou.write(i + " - IMPAR");
                }
                ou.newLine();
            }
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
