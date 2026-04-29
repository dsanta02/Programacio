/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_4 {
    public static void main(String[] args) {
      
        FileReader in = null;
        
        try {
            in = new FileReader("D:\\Users\\disacr127\\Downloads\\TEXTO_PARCTICA10_4.txt");
            int t;
            while ((t = in.read()) != -1) {
                System.out.println((char) t);
            }
        } catch (Exception e) {
        } finally {
        }
    }
}
