import java.util.Scanner;
public class Ejercicio206 {
public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	int num1;
	int num2;
	System.out.println ("Escriba el primer numero");
	num1 = sc.nextInt();
	System.out.println ("Escriba el segundo numero");
	num2 = sc.nextInt();
	if (num1 ==num2) {
		System.out.println("Son iguales");
	} else {
		
	if (num1 > num2) {
		System.out.println ( num1 + "es mayor que" + num2 ); 
	} else {
		System.out.println ( num2 + "es mayor que" + num1 );
	}
	}
}
}
