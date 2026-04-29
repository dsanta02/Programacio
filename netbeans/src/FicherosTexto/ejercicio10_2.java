/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.io.FileReader;  // importar siempre que se usa ficheros de texto en java
import java.io.IOException; //importar porque java OBLIGA  a controlar los errores


public class ejercicio10_2 {
    
    public static void main(String[] args) {
        
        String ruta1 = "";
        String texto = "";
        FileReader in = null; // se crea una variable con la clase FILEREADER y se la da valor null    
        
        //HAY QUE PONER LA RUTA DEL ACCESO CON LA BARRA INVERTIDA O CON DOBLE 
            try {
                in = new FileReader("D:\\Users\\disacr127\\Downloads\\texto.txt"); // con esto intenta abrir el archivo
                int c = in.read(); // con esto se lee el primer caracter
                // si devuelve un numero int q presenta cada caracter 
                //cuando no queda nada por devolver devuelve -1
                while (c != -1) { // mientras no sea fin de archivo
                    texto = texto + (char) c; //guarda el caracter en texto que es un String
                    c = in.read(); // lee el siguiente
                }

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                
            } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }    
        System.out.println(texto);
    } 
}

