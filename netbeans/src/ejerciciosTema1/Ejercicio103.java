import java.util.Scanner; 
public class Ejercicio103 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
    System.out.println("introduzca su edad");
 	int edad = sc.nextInt();
	int edadProximoAño = edad + 1;
	System.out.println("El proximo año tendra:" + edadProximoAño + "años");
	}
}	
