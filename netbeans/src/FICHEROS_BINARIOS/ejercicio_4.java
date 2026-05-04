/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS;

import java.util.*;
import java.io.*;

public class ejercicio_4 {

    public static void main(String[] args) {
        
        ObjectInputStream in = null;
        int t [] = new int[10];
        
        try {
            in = new ObjectInputStream(new FileInputStream("dotos2.dat"));
            for (int i : t) {
                t[i] = in.readInt();               
            }
            
            System.out.println(Arrays.toString(t)); 
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
}
