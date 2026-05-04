/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero entero: ");
        int n = sc.nextInt();
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("archivo.dat"));
            int [] tabla = new int[n];
            for (int i = 0; i < tabla.length; i ++) {
                System.out.println("introduce un numero: ");
                tabla[i] = sc.nextInt();
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
