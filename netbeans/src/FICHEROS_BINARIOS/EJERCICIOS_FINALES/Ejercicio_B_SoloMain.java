/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.EJERCICIOS_FINALES;

import java.util.*;
import java.io.*;

public class Ejercicio_B_SoloMain implements Serializable{

    public static void main(String[] args) {
        
        int [] numeros = {23,4,44,123,56745,21,1,45,56};
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numeros13.dat"))){
            for (int i : numeros) {
                out.writeInt(i);
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        try (ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares3.dat"));
                ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("pares3.dat"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros13.dat"));){
            
            while (true) {
                try {
                    int i = in.readInt();
                    if (i % 2 == 0) {
                        System.out.println(i + "par");
                        pares.writeInt(i);
                    } else {
                        System.out.println(i + "inpar");
                        inpares.writeInt(i);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        try (   ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros13.dat"));
                BufferedWriter out = new BufferedWriter(new FileWriter("todosNum.txt"));){
            while(true) {
                try {
                    int i = in.readInt();
                    if (i % 2 == 0){
                        out.write(i + "-Pares");
                    } else {
                        out.write(i + "-Inpares");
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
