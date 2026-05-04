/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS.Ejercicio9_ConList;

import java.util.*;
import java.io.*;

public class Main implements Serializable{

    public static void main(String[] args) throws ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        
        List<Registros> lista = new ArrayList<>();
        
        ObjectInputStream in = null;
        
        try {
            in = new ObjectInputStream(new FileInputStream("Datos.dat"));
            lista = (List<Registros>) in.readObject();
            
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
        
        do{
            System.out.println("1.añadir datos: ");
            System.out.println("2.mostrar datos: ");
            System.out.println("3.salir: ");
            System.out.println("introduce una opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("introduce la temperatura: ");
                    double temperatura = sc.nextDouble();
                    Registros nuevo = new Registros(temperatura, "hoy");
                    lista.add(nuevo);
                    break;
                    
                case 2:
                    System.out.println(lista);
                    break;
            }
        }while (opcion != 3);
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("datos.dat"));
            out.writeObject(lista);
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
