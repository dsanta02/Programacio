/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.InstrumentosMusicales;


public abstract class Instrumento {
    protected Nota[] melodia;
    protected int indice;

    public Instrumento(int capacidad) {
        melodia = new Nota[capacidad];
        indice = 0;
    }
    
        public void add(Nota n) {
        if (indice < melodia.length) {
            melodia[indice] = n;
            indice++;
        } else {
            System.out.println("Melodía llena, no se pueden agregar más notas.");
        }
    
        }
    public abstract void interpretar();
}
