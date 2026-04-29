/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ejercicio10_3 {

    public static void main(String[] args) {
        
        String texto = "";
        BufferedReader in = null;
        
        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\texto.txt"));
            //la unica diferencia con el otro es que usamos un new BufferReader
            //y leemos la cadena con los numeros dandole a String linea el valor de in.read
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
