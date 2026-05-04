/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio_7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("numeros.dat"));
            System.out.println("introduce un numero: ");
            int num = sc.nextInt();
            while (num >= 0) {
                num = sc.nextInt();
                out.writeInt(num);
                System.out.println("introduce un numero: ");
                num = sc.nextInt();
            }
            
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
        
        ObjectInputStream in = null;
        ObjectOutputStream out2 = null;
        
        try {
            in = new ObjectInputStream(new FileInputStream("numeros.dat"));
            out2 = new ObjectOutputStream(new FileOutputStream("copia.dat"));
            
            while(true) {
                int n = in.readInt();
                out2.writeInt(n);
            }           
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (out2 != null) {
                try {
                    out2.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            
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
