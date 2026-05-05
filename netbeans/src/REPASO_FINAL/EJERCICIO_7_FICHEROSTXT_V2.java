/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPASO_FINAL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.io.*;

public class EJERCICIO_7_FICHEROSTXT_V2 {
    
    public static void main(String[] args) {
        
        try (BufferedReader in = new BufferedReader(new FileReader("numerosReales.txt"))){
            
            int cont = 0;
            double suma = 0.0;
            String linea;
            
            while ((linea = in.readLine()) != null) {
                linea = linea.trim();
                
                if (!linea.isEmpty()) {
                    String [] partes = linea.split(" ");
                    for (String p : partes) {
                        double num = Double.parseDouble(p);
                        suma = suma + num;
                        cont ++;
                    }
                } else {
                    System.out.println("linea vacia");
                }
            }
            System.out.println("suma: " + suma);
            double media = suma / cont;
            System.out.println("media: " + media);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
