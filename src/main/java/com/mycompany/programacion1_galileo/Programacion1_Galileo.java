package com.mycompany.programacion1_galileo;
import java.time.LocalTime;
public class Programacion1_Galileo {

    public static void main(String[] args) {
        
        Estudiante a1 = new Estudiante("62514895", "Sebastian Burnes", "Ingenieria", false);
        Docente d1 = new Docente("35418564", "Johan Max", "906405135");
        Aula s1 = new Aula("S-001", 50, false, true, true);
        
        Pago p1 = new Pago(101, 900.0, "16/12/2026", 900.0, "Targeta", a1);
        p1.generarComprobante();
        
        Clase cl1 = new Clase("PROG-01", LocalTime.of(15, 0), 2, "Lunes", "Programacion I");
        cl1.asignarDocente(d1);
        cl1.asignarAula(s1);
        cl1.mostrarInfo();
        
        Ciclo c1 = new Ciclo("Intensivo", "Tarde");
        System.out.println("Nombre del Ciclo: " + c1.getNombreCiclo());
        System.out.println("Turno: " + c1.getTurno());
    }
}
