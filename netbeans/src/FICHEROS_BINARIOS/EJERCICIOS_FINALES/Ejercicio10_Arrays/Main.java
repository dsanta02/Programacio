/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FICHEROS_BINARIOS.EJERCICIOS_FINALES.Ejercicio10_Arrays;

import java.util.*;
import java.io.*;
public class Main implements Serializable{
    
    public static void main(String[] args) throws ClassNotFoundException{
        
        Scanner sc = new Scanner (System.in);
        
        Cliente [] caja = new Cliente [0];
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Clientes.dat"))){
            caja = (Cliente[]) in.readObject();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        int opcion;
        
        do{
            System.out.println("1.aádir nuevos clientes: ");
            System.out.println("2.modificar datos: ");
            System.out.println("3.dar de baja cliente: ");
            System.out.println("4.listar clientes: ");
            System.out.println("5.salir: ");
            System.out.println("elige una opcion");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion) {
                case 1: 
                    System.out.println("id: ");
                    String id = sc.nextLine();
                    System.out.println("nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("numero: ");
                    int num = sc.nextInt();
                    Cliente nuevo = new Cliente(id, nombre, num);
                    
                    caja = Arrays.copyOf(caja, caja.length + 1);
                    caja [caja.length - 1] = nuevo;
                    
                    break;
                    
                case 2:
                    System.out.println("que posicion desea cambiar: ");
                    int pos = sc.nextInt();
                    System.out.println("id: ");
                    String id2 = sc.nextLine();
                    System.out.println("nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.println("numero: ");
                    int num2 = sc.nextInt();
                    Cliente nuevo2 = new Cliente(id2, nombre2, num2);
                    
                    if (pos < caja.length && pos >= 0) {
                        caja[pos] = nuevo2;
                    }
                    break;
                 
                case 3:
                    System.out.println("que posicion desea dar de baja: ");
                    int pos2 = sc.nextInt();
                    
                    if (pos2 < caja.length && pos2 >= 0) {
                        for (int i = pos2; i < caja.length - 1; i ++) {
                            caja[i] = caja[i + 1];
                        }
                        caja = Arrays.copyOf(caja, caja.length -1);
                    }
                    break;
                    
                case 4: 
                    System.out.println(Arrays.toString(caja));
                    
            }
            
        }while(opcion != 5);
        

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Clientes.dat"))){
            
            out.writeObject(caja);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
