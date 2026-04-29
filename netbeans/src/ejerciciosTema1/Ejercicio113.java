import java.util.Scanner ;
public class Ejercicio113 {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int nota1;
	int nota2;
	int nota3;
	System.out.println ("nota del primer trimestre");
	nota1 = sc.nextInt();
	System.out.println ("nota del segundo trimestre");
	nota2 = sc.nextInt();
	System.out.println ("nota del tercer trimestre");
	nota3 = sc.nextInt();
	int MediaBoletin = (nota1 + nota2 + nota3) / 3;
	double NotaExpediente = (nota1 + nota2 + nota3) / 3;
	System.out.println ("nota media boletin:" + MediaBoletin);
	System.out.println ("nota media Expediente:" + NotaExpediente);
	
}
}
