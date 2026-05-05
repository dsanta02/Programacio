/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.HOJA_EJERCICIOS.Ejercicio_10_conList;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        
        List<Cliente> lista = new ArrayList<>();
        
        ObjectInputStream in = null;
        
        try {
            in = new ObjectInputStream(new FileInputStream("datos3.dat"));
            lista = (List<Cliente>) in.readObject();
            
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
            System.out.println("1.añador cliente: ");
            System.out.println("2.modificar datos: ");
            System.out.println("3.dar de baja a un cliente: ");
            System.out.println("4.listar los clientes: ");
            System.out.println("5.salir: ");
            System.out.println("elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("introduce el id: ");
                    String id = sc.nextLine();
                    System.out.println("introduce el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("introduce num tel: ");
                    int num = sc.nextInt();
                    
                    sc.nextLine();
                    
                    Cliente nuevo= new Cliente(id, nombre, num);
                    lista.add(nuevo);
                    break;
                
                case 2: 
                    System.out.println("introduce que pos quiere modificar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    if (pos >= 0 && pos < lista.size()) {
                        System.out.println("nuevo id: ");
                        String id2 = sc.nextLine();
                        System.out.println("nuevo nombre: ");
                        String nombre2 = sc.nextLine();
                        System.out.println("nuevo num: ");
                        int num2 = sc.nextInt();
                        sc.nextLine();
                        
                        Cliente mod = new Cliente(id2, nombre2, num2);
                        
                        lista.set(pos, mod);
                        
                    } else {
                        System.out.println("numero invalido");
                    }
                    break;
                 
                case 3:
                    System.out.println("que posicion quiere dar de baja: ");
                    int pos2 = sc.nextInt();
                    sc.nextLine();
                    if (pos2 >= 0 && pos2 < lista.size()) {
                        lista.remove(pos2);
                    } else {
                        System.out.println("numero no valido");
                    }
                    break;
                 
                case 4:
                    System.out.println(lista);
                    
            }
        }while (opcion != 5);
        
        ObjectOutputStream out = null;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream("datos3.dat"));
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
