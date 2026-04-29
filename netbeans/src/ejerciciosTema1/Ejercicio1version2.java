import java.util.Scanner;
public class Ejercicio1version2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print ("escriba un numero num1");
		int num1 = sc.nextInt();
		System.out.print ("escriba un numero num2");
		int num2 = sc.nextInt();
	    System.out.println("num1 = " + num1 + " num2 = " + num2);
		System.out.println("suma: "+(num1 + num2)); 
		System.out.println("resta: "+(num1 - num2)); 
		System.out.println("multiplicacion: "+( num1 * num2));
		System.out.println("cociente: "+(num1 / num2)); 
		System.out.println("resto: "+(num1 % num2));
	}
}