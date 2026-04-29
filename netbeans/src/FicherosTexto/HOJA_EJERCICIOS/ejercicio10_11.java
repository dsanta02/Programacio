/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_11 {

    public static void main(String[] args) {
        
        BufferedWriter bw = null;
        
        try {
            bw = new BufferedWriter(new FileWriter("quijote.txt"));
            String cad = "En un lugar de la mancha,";
            for (int i = 0; i < cad.length(); i++) {
                bw.write(cad.charAt(i)); //ESCRIBIR LA LINEA CARACTER A CARACTER
            }
            cad = "de cuyo nombre no quiero acordarme"; 
            bw.newLine(); //CAMBIAMOS DE LINEA EN EL ARCHIVO
            bw.write(cad); //SE ESCRIBE UNA UNICA SENTENCIA
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
    }
    
}
