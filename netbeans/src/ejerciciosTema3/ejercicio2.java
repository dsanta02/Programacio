package ejerciciosTema3;

import java.util.Scanner;
public class ejercicio2 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    System.out.println("Escriba un numero");
    numero = sc.nextInt();
    if (numero<0) { 
    System.out.println("el numero debe de ser positivo");
    }else {
            while (numero >= 0) {
            System.out.println(numero);
            numero--;
            }
            System.out.println("DESPEGUE!!");
}
}
}
