/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciosInterfaces.Calculadora;

/**
 *
 * @author disacr127
 */
public class CalculadoraSimple implements Operaciones{

        @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }

    @Override
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return (double) a / b;
    }
}
