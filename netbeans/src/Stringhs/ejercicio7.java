/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stringhs;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("escriba la contraseña");
            String contrasena = sc.nextLine();
            String intento;
            String fin = "";
            
                    System.out.println("cual es la contraseña?");
                
                    intento = sc.nextLine();
                while (!intento.equals(contrasena)){     
                int x;
                fin = "";
                    System.out.println("no has acertado");
                if (intento.length() <= contrasena.length()) {
                    x = intento.length();
                } else {
                    x = contrasena.length();
                }
                for (int i = 0; i < x; i ++) {
                    char a = intento.charAt(i);
                        char c = contrasena.charAt(i);
                            if (a == c) {
                                fin += contrasena.charAt(i);
                            } else {
                                fin += "*";
                            } 
//                            System.out.println("cadena fin: " + fin);
                        
                    }
                    System.out.println("te doy pista: " + fin);
                    
                    System.out.println("introduce otra cadena");
                    intento = sc.nextLine();
                }
                System.out.println("HAS ACERTADO!!");
        }

    }

