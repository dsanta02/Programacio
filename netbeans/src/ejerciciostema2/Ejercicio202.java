package ejerciciostema2;
import java.util.Scanner; 
public class Ejercicio202 {
public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
	int num1;
	int num2;
	System.out.println ("Escribe un numero");
	num1 = sc.nextInt();
	System.out.println ("Escribe otro numero");
	num2 = sc.nextInt();
	if (num1 == num2) {
		System.out.println("El numero es igual");
	}else
		System.out.println("El numero no es igual");
}
}
	