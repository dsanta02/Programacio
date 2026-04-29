/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("escriba su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("introduzca su edad: ");
        int edad = sc.nextInt();
        
        BufferedWriter out = null;
        
        try {
            out = new BufferedWriter(new FileWriter("datos.txt", true)); //con true escribes al final 
            
            out.write(nombre + " " + edad) ;
            out.newLine();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally{
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
