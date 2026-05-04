/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS.ejercicio10;

import java.util.*;
import java.io.*;

public class Main implements Serializable{
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        
        ObjectInputStream in = null;
        
        Cliente [] caja = new Cliente[0];
        
        
        try {
            in = new ObjectInputStream(new FileInputStream("clientes.dat"));
            caja = (Cliente []) in.readObject();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
        if(in != null) {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        }
        
        int opcion;
        
        do{
            System.out.println("1.añadir nuevo cliente: ");
            System.out.println("2.modificsr dastos: ");
            System.out.println("3.dar de baja a un cliente: ");
            System.out.println("4.listar los clientes: ");
            System.out.println("5.salir: ");
            System.out.println("elige una opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {

                case 1: 
                    System.out.println("nuevo id: ");
                    String id = sc.nextLine();
                    System.out.println("nuevo nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("introduce telefono: ");
                    int tel = sc.nextInt();
                    
                    Cliente nuevo = new Cliente(id, nombre, tel);
                    
                    caja = Arrays.copyOf(caja, caja.length + 1);
                    caja [caja.length -1] = nuevo;
                    break;
                
                case 2: 
                    System.out.println("que posicion desea modificar: ");
                    int pos = sc.nextInt();
                    
                    if (pos > 0 && pos < caja.length) {
                        System.out.println("introduce nuevo id: ");
                        String id2 = sc.nextLine();
                        System.out.println("nuevo nombre: ");
                        String nombre2 = sc.nextLine();
                        System.out.println("nuevo telefono: ");
                        int tel2 = sc.nextInt();
                        
                        caja[pos] = new Cliente(id2, nombre2, tel2);
                    } else {
                        System.out.println("pos invalida");
                    }
                    break;
                    
                case 3: 
                    System.out.println("introduce la posicion que quieres eliminar: ");
                    int pos2 = sc.nextInt();
                    
                    if (pos2 > 0 && pos2 < caja.length) {
                        for (int i = pos2; i < caja.length-1; i ++) {
                            caja[i] = caja [i + 1];
                        }
                    } else {
                        System.out.println("numero no valido ");
                    }
                    break;
                    
                case 4:
                    System.out.println(Arrays.toString(caja));
                    break;
                     
                    
            }
            
        }while (opcion != 5);
        
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("clientes.dat"));
            out.writeObject(caja);
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
