/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.util.*;
import java.io.*;

public class ejercicio10_5 {

    public static void main(String[] args) {

        BufferedReader in = null; //damos valor a IN que es una iteracion de Buffer

        try {
            in = new BufferedReader(new FileReader("D:\\Users\\disacr127\\Downloads\\numerosReales2 6.txt"));
            //como en las coleciones lo importamos con su ruta
             //iteramos Scanner en S
            double num;
            double suma = 0;

            String linea = in.readLine(); // le damos el valor a linea de la lectura del Scanner

            while (linea != null) { // mientras la lectura de la linea no sea nulo

                Scanner s = new Scanner(linea); // a s le damos le damos un nuevo escaner de linea 

                while (s.hasNextDouble()) {  //mientras haya un double en la linea 
                    num = s.nextDouble(); //leemos el siguiente num
                    suma += num; // lo añadimos al total accumulado
                }

                linea = in.readLine(); // termina la linea actual leida 
            }

            System.out.println("suma = " + suma);

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

// LECTURA HORIZONTAL 
//s = new Scanner(linea);
//while (s.hasNextDouble()) {
//    num = s.nextDouble();
//    suma += num;
//}