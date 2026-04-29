import java.util.Scanner;
   public class Ejercicio104 {
      public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
	  System.out.print("introduzca el año actual:");
	  int año1 = sc.nextInt();
	  System.out.print("introduzca su fecha de nacimiento");
	  int año2 = sc.nextInt();
	  int edad = año1 - año2;
	  System.out.println("su edad es:" + edad);
	  }
   }	  
	  