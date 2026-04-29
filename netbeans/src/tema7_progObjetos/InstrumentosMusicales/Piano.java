/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.InstrumentosMusicales;

/**
 *
 * @author disacr127
 */
public class Piano extends Instrumento {

    public Piano(int capacidad) {
        super(capacidad);
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < indice; i++) {
            System.out.print(melodia[i].name().toLowerCase() + " ");
        }
        System.out.println();
    }
}