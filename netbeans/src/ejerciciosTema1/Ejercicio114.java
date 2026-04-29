import java.util.Scanner;
public class Ejercicio114 {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	double n; 
	int redondeo; 
	System.out.println ("Escriba un numero: ");
	n = sc.nextDouble();
	redondeo = (int) (n + 0.5);
	System.out.println(n+ "redondeado es:" +  redondeo);
}
}

 
 
 
 
 