package com.mycompany.programacion1_galileo;
import java.time.LocalTime;
public class Programacion1_Galileo {

    public static void main(String[] args) {
        Ciclo c1 = new Ciclo("Intensivo", "Tarde");
        System.out.println("Nombre del Ciclo: " + c1.getNombreCiclo());
        System.out.println("Turno: " + c1.getTurno());
    }
}
