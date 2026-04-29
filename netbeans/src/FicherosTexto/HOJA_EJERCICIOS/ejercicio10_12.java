/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.awt.image.ImagingOpException;
import java.util.*;
import java.io.*;

public class ejercicio10_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el nombre del fichero: ");
        String nombre = sc.nextLine();
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(nombre));
            System.out.println("Escribe texto 'fin' para terminar");
            String linea = sc.nextLine();
            
            while (!linea.equals("fin")) {
                out.write(linea);
                out.newLine();
                linea = sc.nextLine();
            }
            
            out.close();
            
            System.out.println("texto guardado en el fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
