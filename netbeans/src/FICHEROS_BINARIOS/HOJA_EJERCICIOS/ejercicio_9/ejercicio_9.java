/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS.ejercicio_9;

import java.io.*;
import java.util.*;


public class ejercicio_9 implements Serializable{
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        Scanner sc = new Scanner (System.in).useLocale(Locale.US);
        
        registros [] reg = new registros[0];
        
        ObjectInputStream in = null;
        
        try {
            in = new ObjectInputStream(new FileInputStream("registros.dat"));
            reg = (registros []) in.readObject();
            
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
        
        int opcion;
        
        do {
            System.out.println("1.añadir registros");
            System.out.println("2.mostrar listado");
            System.out.println("3.salir");
            System.out.println("elige una aopcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    System.out.println("introduce la temperatura: ");
                    double temperatura = sc.nextDouble();
                    registros nuevo = new registros(temperatura,"hoy");
                    reg = Arrays.copyOf(reg, reg.length + 1); //original se le añade 1 huevo al final
                    reg[reg.length -1] = nuevo; // en la posicion final se le da el valor de nuevo
                break;
                
                case 2:                    
                    System.out.println(Arrays.toString(reg));
                break;    
            }
        } while (opcion != 3);
        
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("registros.dat"));
            out.writeObject(reg);
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
