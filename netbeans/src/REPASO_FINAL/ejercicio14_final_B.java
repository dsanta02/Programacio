/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPASO_FINAL;

import java.util.*;
import java.io.*;

public class ejercicio14_final_B {
    
    public static void main(String[] args) {
        int[] array ={12,23,33,256,443,568,987,23,22,1,90};
        
        guardar("DtosGenerales2.dat", array);
        
        procesar();
        
        exportar();
        
    }
    
    static void guardar (String fichero, int [] caja) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fichero))){
            
            for (int i : caja) {
                out.writeInt(i);
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void procesar () {
        try (ObjectOutputStream inpares = new ObjectOutputStream(new FileOutputStream("inpares2.dat"));
                ObjectOutputStream pares = new ObjectOutputStream(new FileOutputStream("pares2.dat"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("DtosGenerales2.dat"));){
            
            while (true) {
                try {
                    int n = in.readInt();
                    if (n % 2 == 0){
                        System.out.println(n + " - par");
                        pares.writeInt(n);
                    }else {
                        System.out.println(n + " - inpar");
                        inpares.writeInt(n);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    static void exportar () {
        try (   ObjectInputStream in = new ObjectInputStream(new FileInputStream("DtosGenerales2.dat"));
                BufferedWriter out = new BufferedWriter(new FileWriter("nuevosDatos.txt"));){
            
            while (true) {
                try {
                    int n = in.readInt();
                    if (n % 2 == 0) {
                        out.write(n + " - PAR");
                    } else {
                        out.write(n + " - Inpar");
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
