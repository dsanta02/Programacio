import java.util.Scanner;
public class Ejercicio108 {
public static void main (String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println ("introduzca su edad");
	int Edad = sc.nextInt();
	boolean mayorEdad = Edad >= 18;
	System.out.println ("Mayoria de edad: "+ mayorEdad);
}
}
