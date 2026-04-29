package ejercicioTema4;

import java.util.Scanner;

public class ejercicio4_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            for (int operacion = 1; operacion <= 4; operacion++){
                double resultado = calculadora(5.0, 5.0, operacion);
                System.out.println(resultado);
            }
            
    }
    static double calculadora(double num1, double num2, int operacion){
            double resultado;
            resultado = switch (operacion) {
                case 1->
                    num1 + num2;
                case 2->
                    num1 - num2;
                case 3->
                    num1 * num2;
                case 4->
                    num1 / num2;
                default ->{
                    System.out.println("numero no valido; ");
                    yield 0;
                }    
            };
          return(resultado);  
        } 
}



