/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS;

import java.util.*;
import java.io.*;

public class ejercicio_3 implements Serializable{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce un numero por consola: ");
        int num = sc.nextInt();
        
        ObjectOutputStream out = null;
                
        try {
            
            out = new ObjectOutputStream(new FileOutputStream("tabla.dat"));
            double[] tabla = new double[num]; 
            
            for(int i = 0; i < tabla.length; i ++) {
                System.out.println("introduce un numero real: ");
                tabla[i] = sc.nextDouble();
            }
            
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
        
    }
    
}
