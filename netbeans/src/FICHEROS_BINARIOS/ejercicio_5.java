/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS;

import java.util.*;
import java.io.*;

public class ejercicio_5 implements Serializable{

    public static void main(String[] args) throws ClassNotFoundException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("datos2.dat"));
            int [] tabla = (int[]) in.readObject();
            System.out.println(Arrays.toString(tabla));
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
