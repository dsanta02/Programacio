/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package REPASO_FINAL;

import java.util.*;
import java.io.*;

public class ejercicio7_ficherostxt {

    public static void main(String[] args) {
        
        try (
            BufferedReader in = new BufferedReader(new FileReader("numerosReales.txt"));
                ){
            double suma = 0.0; 
            int contador = 0;
            String linea = in.readLine();
            
            while (linea != null) {
                Scanner s = new Scanner(linea).useLocale(Locale.US);
                suma = suma + s.nextDouble();
                contador ++;
                linea = in.readLine();
            }
            
            System.out.println("suma: " + suma);
            Double media = suma / contador;
            System.out.println("media: " + media);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
