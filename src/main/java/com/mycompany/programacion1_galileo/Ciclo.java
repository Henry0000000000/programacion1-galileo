package com.mycompany.programacion1_galileo;
public class Ciclo {
    private String nombreCiclo;
    private final static int DURACION_SEMANAS = 12;
    private final static double COSTO_BASICO_1 = 1200;
    private final static double COSTO_BASICO_2 = 1300;
    private final static double COSTO_INTERMEDIO = 1400;
    private final static double COSTO_AVANZADO = 1500;
    private String turno;

    public Ciclo(String nombreCiclo, String turno) {
        setNombreCiclo(nombreCiclo);
        setTurno(turno);
    }

    private void setNombreCiclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
    }

    private void setTurno(String turno) {
        this.turno = turno;
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }

    public int getDuracionSemanas() {
        return DURACION_SEMANAS;
    }

    public static double getCOSTO_BASICO_1() {
        return COSTO_BASICO_1;
    }

    public static double getCOSTO_BASICO_2() {
        return COSTO_BASICO_2;
    }

    public static double getCOSTO_INTERMEDIO() {
        return COSTO_INTERMEDIO;
    }

    public static double getCOSTO_AVANZADO() {
        return COSTO_AVANZADO;
    }

    public String getTurno() {
        return turno;
    }
}
