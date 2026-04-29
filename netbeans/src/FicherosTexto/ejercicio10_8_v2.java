/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.util.*;
import java.io.*;

public class ejercicio10_8_v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce el nombre del fichero: ");
        String original = sc.nextLine();
        String copia = "copia_de_" + original;
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(original));
            BufferedWriter out = new BufferedWriter(new FileWriter(copia));
            
            int c = in.read(); //read lee caracter a caracter
            
            while (c != -1) { // -1 es hasta que termine la cadena
                out.write(c); // escribimos en out c
                c = in.read(); // cerramos la lectura de c
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
