/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.EJERCICIOS_FINALES;

import java.io.*;
import java.util.*;
public class ejercicio14_A_soloMain implements Serializable{
    
    public static void main(String[] args) throws ClassNotFoundException  {
        
        int [] numeros = {23,4,44,123,56745,21,1,45,56};
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numeros12.dat"))){
            out.writeObject(numeros);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        try (   ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares.dat"));
                ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("pares.dat"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros12.dat"));){
            
            int [] array = (int[]) in.readObject();
            
            for (int i : array) {
                if (i % 2 == 0) {
                    System.out.println(i + "par");
                    pares.writeInt(i);
                } else {
                    System.out.println(i + "inpar");
                    inpares.writeInt(i);
                }
                
            }
            
        } catch (IOException  | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try (   ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros12.dat"));
                BufferedWriter out = new BufferedWriter(new FileWriter("nuevosDatos.txt"));){
            
            int [] array = (int[]) in.readObject();
            
            for (int i : array) {
                if (i % 2 == 0) {
                    out.write(i + "pares");
                } else {
                    out.write(i + "inpares");
                }
                out.newLine();
            }
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
