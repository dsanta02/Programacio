/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS;

import java.util.*;
import java.io.*;

public class ejercicio_1_v2 implements Serializable{
    
    public static void main(String[] args) {

       
    int [] tabal = {1, 2, 3, 56, 34, 12, 45, 56, 45, 67};
    
    ObjectOutputStream out = null;
    
        try {
            out = new ObjectOutputStream (new FileOutputStream("tabla.txt"));
            out.writeObject(tabal);
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
