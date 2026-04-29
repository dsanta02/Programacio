/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FicherosTexto;

import java.util.*;
import java.io.*;

public class ejercicio10_7 {

    public static void main(String[] args) {
        BufferedWriter out = null;
        
        try {
            out = new BufferedWriter(new FileWriter("el_quijote.txt"));
            String cad = "En un lugar de la mancha";
            for (int i = 0; i < cad.length(); i ++) {
                out.write(cad.charAt(i));
            }
            cad = "de cuyo nombre no me acuerdo";
            out.newLine();
            out.write(cad);            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }        
    }   
}
