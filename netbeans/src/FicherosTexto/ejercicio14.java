/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.io.*;
import java.util.*;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("introduce tu nombre: ");
        String nombre = sc.nextLine();
        
        BufferedWriter out = null;
        
        try {
            out = new BufferedWriter(new FileWriter("Archivo.txt",true));
            out.write(nombre + "" + edad);
            out.newLine();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
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
