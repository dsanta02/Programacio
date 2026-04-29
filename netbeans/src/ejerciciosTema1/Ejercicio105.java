public class Ejercicio105 {
    public static void main(String[] args) {
        short max = 32767;   // Valor máximo de short
        short min = -32768;  // Valor mínimo de short

        System.out.println("Valor máximo de short: " + max);
        System.out.println("Valor mínimo de short: " + min);

        // Sumar 1 al máximo
        short siguiente = (short)(max + 1);
        System.out.println("Valor máximo + 1 = " + siguiente);

        if (siguiente == min) {
            System.out.println("✅ Comprobación correcta: después del máximo viene el mínimo.");
        }

        // Restar 1 al mínimo
        short anterior = (short)(min - 1);
        System.out.println("Valor mínimo - 1 = " + anterior);

        if (anterior == max) {
            System.out.println("✅ Comprobación correcta: antes del mínimo viene el máximo.");
        }
    }
}