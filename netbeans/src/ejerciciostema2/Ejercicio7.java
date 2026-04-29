import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comidaDiaria;
        int numAnimales;
        int kilosPorAnimal;

        System.out.println("Introduce la cantidad total de comida disponible (en kilos):");
        comidaDiaria = sc.nextInt();

        System.out.println("Introduce el número de animales:");
        numAnimales = sc.nextInt();

        System.out.println("Introduce cuántos kilos come cada animal de media:");
        kilosPorAnimal = sc.nextInt();


        int comidaNecesaria = numAnimales * kilosPorAnimal;

        if (comidaDiaria >= comidaNecesaria) {
            System.out.println("Tienes suficiente comida para todos los animales.");
            int sobra = comidaDiaria - comidaNecesaria;
            System.out.println("Te sobran " + sobra + " kilos de comida.");
        } else {
            System.out.println("No tienes suficiente comida para los animales.");
            int falta = comidaNecesaria - comidaDiaria;
            System.out.println("Necesitas " + falta + " kilos más para alimentarlos correctamente.");
        }

        sc.close();
    }
}