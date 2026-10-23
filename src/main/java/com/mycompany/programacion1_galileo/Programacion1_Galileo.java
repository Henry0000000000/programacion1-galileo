package com.mycompany.programacion1_galileo;
import java.time.LocalTime;
public class Programacion1_Galileo {

    public static void main(String[] args) {
        Clase c1 = new Clase("C-09", LocalTime.of(8, 0, 0), 4, "Jueves", "Aritmetica");
        c1.mostrarInfo();
    }
}
