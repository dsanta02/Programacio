import java.util.Scanner;
public class Ejercicio204 {
public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	double num1; 
	System.out.println ("Escriba un numero");
	num1 = sc.nextDouble();
	if (-1< num1 && num1 >1 && num1 !=0) {
		System.out.println ("El numero NO es un casi cero");
	} else {
		System.out.println ("El numero es casi cero");
	}
}
}

