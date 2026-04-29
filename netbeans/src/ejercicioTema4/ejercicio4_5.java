/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;
public class ejercicio4_5 {
    static boolean esVocal (char c) {
        boolean resultado ;
        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
             c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println("La i es una vocal " + esVocal('i'));
        System.out.println("La E es una vocal " + esVocal('E'));
        System.out.println("La f es una vocal " + esVocal('f'));
    }
}