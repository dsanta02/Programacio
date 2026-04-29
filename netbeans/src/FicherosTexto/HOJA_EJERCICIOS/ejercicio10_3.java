/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_3 {

    public static void main(String[] args) {
        
        String texto = "";
        BufferedReader in = null;
        
        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\texto.txt"));
            String linea = in.readLine();
            while (linea != null) {
                texto = texto + linea + '\n';
                linea = in.readLine();                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        finally {
            if (in != null) {
                try {
                    in.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(texto);
       
    }
    
}
