import java.util.Scanner;
public class Ejercicio3 {
public static void main (String[] args) {
Scanner sc = new Scanner (System.in);
    int salario;
	System.out.println ("introduzca su salario");
	salario = sc.nextInt();
	if (salario <1000) {
		System.out.println ("MUY MALO");
	} else if (salario >=1000 && salario < 1500) {
        System.out.println ("MALO");
	} else if (salario >=1500 && salario < 3000) {
        System.out.println ("BUENO");
	} else if (salario >=3000) {
        System.out.println("MUY BUENO");
	}
}
}	