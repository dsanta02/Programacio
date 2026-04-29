/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos;


public class controlTrafico {
    public static void main(String[] args) {
        procesarSemaforo(semaforo.rojo);
        procesarSemaforo(semaforo.verde);
    }
    
     public static void procesarSemaforo (semaforo luz) {
        switch (luz) {
            case rojo:
            System.out.println("⛔ STOP - Detente");
            break;
            case amarillo:
            System.out.println("⚠️ PRECAUCIÓN - Prepárate para frenar");
            break;
            case verde:
            System.out.println("✅ ADELANTE - Puedes pasar");
            break;
        }
}

}
