import java.util.Scanner;
public class Ejercicio4 {
public static void main (String[] args) {
Scanner sc = new Scanner (System.in);
    int temp;
	System.out.println ("introduzca la temperatura");
	temp = sc.nextInt();
	if (temp <12) {
		System.out.println ("MUCHO FRIO");
	} else if (temp >12 && temp <=22) {
		System.out.println ("FRIO");
	} else if (temp >22 && temp <=32) {
		System.out.println ("CALOR");
	} else if (temp >=32) {
		System.out.println ("MUCHO CALOR");
	}
}
}	