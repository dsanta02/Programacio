/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioTema4;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, resultado;
        int operacion;
        System.out.println("MENU DE OPERACIONES: ");
        do {
            operacion = menu();
            switch (operacion) {
                case 1,2,3,4,5,6,7 -> {
                    System.out.println("escriba el radio: ");
                    n = sc.nextDouble();
                    resultado = calculadora(n, operacion);
                    System.out.println("el resultado es :" + resultado);
                } 
                case 8 -> {
                    System.out.println("fin de programa");
                }
                default -> {
                    System.out.println("opcion no valida");
                }
            }
        } while (operacion != 8);
             
        
        
    }
    static double longitud(double n) {
        return 2*Math.PI * n;
    }
    static double area(double n) {
        return Math.PI * Math.pow(n, 2);
    }
    static double areaEsfera(double n) {
        return 4 * Math.PI * Math.pow(n, 2);
    }
    static double areaCilindro(double n) {
        double op1;
        return 2*Math.PI*Math.pow(n,2) + 2*Math.PI*n*10;
            
    }
    static double volumenEsfera(double n) {
        return 4.0 / 3.0 * Math.PI * Math.pow(n, 3);
    }
    static double volumenCilindro (double n) {
        return Math.PI * Math.pow(n, 2) * 10;
    }

    
    static int menu() {
        Scanner sc = new Scanner(System.in);
        int operacion;
        System.out.println("1. longitud de la circunferencia.");
        System.out.println("2. Area del circulo");
        System.out.println("3. area de la esfera");
        System.out.println("4. area del cilindro");
        System.out.println("5. volumen esfera");
        System.out.println("6. volumen cilindro");
        System.out.println("7. nuevo");
        System.out.println("8. salir");
        operacion = sc.nextInt();
        
        return (operacion);
    }
    
    static double calculadora(double n, int operacion) {
        double resultado;
        resultado = switch(operacion){
            case 1 ->
                longitud (n);
            case 2 -> 
                area (n);
            case 3 ->
                areaEsfera (n);
            case 4 ->
                areaCilindro (n);
            case 5 ->
                volumenEsfera (n);
            case 6 ->
                volumenCilindro (n);
            default -> 0;    
        };
        return (resultado);
    }
    
}
