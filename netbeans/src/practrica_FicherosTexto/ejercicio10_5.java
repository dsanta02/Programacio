/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practrica_FicherosTexto;

import java.io.*;
import java.util.*;

public class ejercicio10_5 {
    public static void main(String[] args) {

        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\numerosReales2 6.txt"));
            String linea = in.readLine();
            double suma = 0;
            while (linea != null) {
                suma = suma + Float.parseFloat(linea);
                linea = in.readLine();
            }
            System.out.println("suma: " + suma);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
         finally {
            try {
                while (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
 
        
