/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto.HOJA_EJERCICIOS;

import java.util.*;
import java.io.*;

public class ejercicio10_10 {

        //*********LECTURA CARACTER A CARACTER**********
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nombre del ficher: ");
        String fichaOriginal = sc.nextLine();
        
        String copia = "copia_de_" + fichaOriginal;
        
        try {
            BufferedReader in = new BufferedReader(new FileReader(fichaOriginal));
            BufferedWriter out = new BufferedWriter(new FileWriter(copia));
                int c = in.read();
                while (c != -1) {
                    out.write(c);
                    c = in.read();
                }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
