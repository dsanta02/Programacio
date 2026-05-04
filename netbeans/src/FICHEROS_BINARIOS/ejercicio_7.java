/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS;


import java.util.*;
import java.io.*;

public class ejercicio_7 implements Serializable{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ObjectOutputStream on = null;
        
        try {
            on = new ObjectOutputStream (new FileOutputStream("numeros.dat"));
            System.out.println("introsuce un numero: ");
            
            int num = sc.nextInt();
            
            while (num >= 0) { 
            num = sc.nextInt();
            on.writeInt(num);
                System.out.println("introduce n numero entero: ");
                num = sc.nextInt();
            }
            
       } catch (IOException e) {
            System.out.println(e.getMessage());
            
        }
        
        ObjectInputStream in = null;
        
        try {
            in = new ObjectInputStream(new FileInputStream("numeros.dat"));
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("copia.dat"));
            System.out.println("[");
            while (true) { //leer hasta que se acaben los datos
                int n = in.readInt();
                System.out.println(n + " ");
                out.writeInt(n);
            }
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
