/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7_progObjetos.ejercicio7_15;

/**
 *
 * @author disacr127
 */
class Calendario {

    int año;
    int mes;
    int dia;

    // Constructor
    public Calendario(int año, int mes, int dia) {

        if (año != 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            this.año = año;
            this.mes = mes;
            this.dia = dia;
        } else {
            System.out.println("Fecha incorrecta");
        }
    }

    // Incrementar día
    public void incrementarDia() {

        dia++;

        if (dia > 31) {
            dia = 1;
            incrementarMes();
        }
    }

    // Incrementar mes
    public void incrementarMes() {

        mes++;

        if (mes > 12) {
            mes = 1;
            incrementarAño(1);
        }
    }

    // Incrementar año
    public void incrementarAño(int cantidad) {

        año += cantidad;

        if (año == 0) {
            año = 1;   // el año 0 no existe
        }
    }

    // Mostrar fecha
    public void mostrar() {
        System.out.println(dia + "/" + mes + "/" + año);
    }

    // Comparar fechas
    public boolean iguales(Calendario otraFecha) {

        if (this.año == otraFecha.año &&
            this.mes == otraFecha.mes &&
            this.dia == otraFecha.dia) {

            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        Calendario fecha1 = new Calendario(2024, 5, 10);

        fecha1.mostrar();        

        fecha1.incrementarDia();
        fecha1.mostrar();        

        fecha1.incrementarMes();
        fecha1.mostrar();        

        fecha1.incrementarAño(2);
     
        fecha1.mostrar();

    }
}



