/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos;


public class Caja {    //creamos la clase caja con los valores que nos da el enunciado
    private int ancho;
    private int alto;  // los ponemos en privad0
    private int fondo;
    private String etiqueta;
    
    public Caja (int ancho, int alto, int fondo , Unidad unidad) {
        if (unidad == Unidad.cm) {     // se divideentre 100 porque si no nos lo da en metros hay q pasarlo
            this.ancho = ancho / 100;  //creamos los constructores con sus condiciones se crearan
            this.fondo = fondo / 100;  //de una manera o de otra manera
            this.alto  = alto / 100;
        } else {                       //nos lo da en metros asi q no tenemos que hacer nada
            this.ancho = ancho;        
            this.alto = alto;
            this.fondo = fondo;
        }
    }
    
    double getVolume() {
        return alto * ancho * fondo;
    }
    
    void setEtiqueta (String etiqueta) {
        if (etiqueta == null) {         // si es nulo se queda nulo
            this.etiqueta = null;       
        } if (etiqueta.length() > 30) { //como es un String se puede usar .length asi que si es > 30
            this.etiqueta = etiqueta.substring(0, 30); //se corta la cadena posicion inicio, pos final
        } else {
            this.etiqueta = etiqueta;   //sino etiquetra se queda norm, es decir qure no se pasa de 30
        }
    }
    
    @Override
    public String toString() {
        return "Caja [ancho=" + ancho + "m, alto=" + alto + "m, fondo=" + fondo +
                "m, etiqueta=\"" + etiqueta + "\"]";
    }
}
