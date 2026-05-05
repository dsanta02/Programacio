/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_5 {

    public static void main(String[] args) {
        BufferedReader in = null;
        double suma = 0;
        int cont = 0;
        
        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\numerosReales.txt"));
            String linea = in.readLine();
            while (linea != null) {
                String[] subcadenas = linea.split(" ");

                for (int i = 0; i < subcadenas.length; i++) {
                    suma = suma + Double.valueOf(subcadenas[i]);
                    cont++;
                }
                linea = in.readLine();
            }
            double media = suma / cont;
            System.out.println("media: " + media);
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
    }
    
}
