/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.EJERCICIOS_FINALES;

import java.io.*;
import java.util.*;

public class ejercicio14_A {

    public static void main(String[] args) throws ClassNotFoundException {
        
        int [] array = {444, 587, 266, 46, 61, 33, 21, 234};
        
        GuardarDatos("TodosNumeros.dat", array);
        
        procesaDatos();
        
        Exportar();
        
        
    }
    
    static void GuardarDatos (String fichero, int [] array) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero))){
            out.writeObject(array);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    static void procesaDatos () throws ClassNotFoundException {
        
        try (   ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares.dat"));
                ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("inpares.dat"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("TodosNumeros.dat"));){
            
            int [] caja = new int [0];
            
            caja = (int []) in.readObject();
            
            for (int i : caja) {
                if (i % 2 == 0) {
                    System.out.println( i + "par");
                    pares.write(i);
                } else {
                    System.out.println(i + "impar");
                    inpares.writeInt(i);
                }
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void Exportar () throws ClassNotFoundException {
        try (   ObjectInputStream in = new ObjectInputStream(new FileInputStream("TodosNumeros.dat"));
                BufferedWriter out = new BufferedWriter(new FileWriter("NUM_S.txt"))){
            
            int [] array = (int[]) in.readObject();
            
            for (int i : array) {
                if (i % 2 == 0) {
                    out.write(i + "-par");
                } else {
                    out.write(i + "-inpar");
                }
                
                out.newLine();
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
