/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos;

/**
 *
 * @author disacr127
 */
public class PrincipalMain {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("445A" , "pepe", 0.0);
        
        
        cuenta1.Ingresar(100.00);
        
        cuenta1.sacarDinero(20.11);
        
        cuenta1.mostrarCuenta();
        
        CuentaCorriente cuenta2 = new CuentaCorriente ("123A", 1000.00);
        
        cuenta2.mostrarCuenta();
        
        CuentaCorriente cuenta3 = new CuentaCorriente("124A", "PEDRO", 120.258);
        
        cuenta3.mostrarCuenta();
        
        CuentaCorriente.setBanco("Banco central");
        
        cuenta1.mostrarCuenta();
        
        CuentaCorriente.setBanco("Caja de ahorros DO-WHILE");
        
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
              
    }
    
}
