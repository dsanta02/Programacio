/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_v2 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("introduce el nombre del fichero: ");
        String original = sc.nextLine();
        
        String copia = "copia_de_" + original;
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(original));
            BufferedWriter ou = new BufferedWriter(new FileWriter(copia));
            String linea = in.readLine();
            
            while (linea != null) {
                ou.write(linea);
                ou.newLine();;
                linea = in.readLine();
                
            }
            
            System.out.println("copia creada: " + copia);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
