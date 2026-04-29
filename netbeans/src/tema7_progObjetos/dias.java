/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos;

/**
 *
 * @author disacr127
 */
public class dias {
    public static void main(String[] args) {
        diaSemana hoy = diaSemana.lunes;
        System.out.println("hoy es " + hoy);
        
        if (hoy == diaSemana.lunes){
            System.out.println("EMPIEZA LA SEMANA!!!");
        }
    }
}
