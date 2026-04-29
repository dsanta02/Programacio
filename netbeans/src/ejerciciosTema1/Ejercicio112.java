import java.util.Scanner;
public class Ejercicio112 {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Escriba un numero (Positivo/Negativo); ");
double n = sc.nextInt();
double valorAbsoluto = Math.abs(n);
System.out.println ("el valor de ; " + n + "es" + valorAbsoluto);
}
}

