import java.util.Scanner;
public class Ejercicio211 {
public static void main ( String[] args) {
    Scanner sc = new Scanner(System.in);
	int dia;
	System.out.println("Escriba un numero comprendido entre el 1 y 7");
	dia = sc.nextInt();
	if (dia==1) {
		System.out.println("Lunes");
	} else if (dia==2) {
        System.out.println("martes");
    } else if (dia==3) {
        System.out.println("miercoles");
	} else if (dia==4) {
        System.out.println("jueves");
	} else if (dia==5) {
        System.out.println("viernes");
	} else if (dia==6) {
        System.out.println("sabado");			
	} else if (dia==7) {
        System.out.println("domingo");
	}
}
}
	