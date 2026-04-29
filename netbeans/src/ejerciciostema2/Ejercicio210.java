import java.util.Scanner;
public class Ejercicio210 {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int nota; 
	System.out.println("Escriba su nota");
	nota = sc.nextInt();
	if (nota >=0 && nota<=4) {
		System.out.println("insuficiente");
	} else if ( nota ==5 ) {
        System.out.println("suficiente");
	} else if ( nota ==6 ) {
        System.out.println("bien");
	} else if ( nota >=7 && nota <=8 ) {
		System.out.println("notable");
	} else if ( nota >=9 && nota <=10 ) {
        System.out.println("sobresaliente");
	}
}
}	