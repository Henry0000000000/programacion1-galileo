package com.mycompany.programacion1_galileo;
import java.time.LocalTime;
public class Evaluacion {
    private String nombreEvaluacion;
    private String tipoEvaluacion;
    private double calificacion;
    private String fechaEvaluacion;
    private LocalTime horaEvaluacion;
    private double notaMax;
    private int numeroPreguntas;
    private int duracionEvaluacion;
    
    public Evaluacion(String nombreEvaluacion, String tipoEvaluacion, String fechaEvaluacion, double notaMax, int numeroPreguntas) {
        setNombreEvaluacion(nombreEvaluacion);
        setTipoEvaluacion(tipoEvaluacion);
        setFechaEvaluacion(fechaEvaluacion);
        setNumeroPreguntas(numeroPreguntas);
    }

    private void setNombreEvaluacion(String nombreEvaluacion) {
        this.nombreEvaluacion = nombreEvaluacion;
    }

    private void setTipoEvaluacion(String tipoEvaluacion) {
        this.tipoEvaluacion = tipoEvaluacion;
    }

    private void setFechaEvaluacion(String fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public void setCalificacion(double calificacion) {
        if(calificacion < 0) {
            throw new IllegalArgumentException("Error. Nota máxima inválida");
        } else {
            this.calificacion = calificacion;
        }
    }

    private void setNumeroPreguntas(int numeroPreguntas) {
        if(numeroPreguntas < 0) {
            throw new IllegalArgumentException("Error. Nota máxima inválida");
        } else {
            this.notaMax = numeroPreguntas*4;
            this.numeroPreguntas = numeroPreguntas;
        }
    }

    public void setDuracionEvaluacion(int duracionEvaluacion) {
        if(duracionEvaluacion < 0) {
            throw new IllegalArgumentException("Error. Nota máxima inválida");
        } else {
            this.duracionEvaluacion = duracionEvaluacion;
        }
    }

    public String getNombreEvaluacion() {
        return nombreEvaluacion;
    }

    public String getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public String getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public LocalTime getHoraEvaluacion() {
        return horaEvaluacion;
    }

    public double getNotaMax() {
        return notaMax;
    }

    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public int getDuracionEvaluacion() {
        return duracionEvaluacion;
    }
    
    public void calcularPuntaje(double aciertos) {
        if(aciertos*4 < notaMax & aciertos >= 0){
            this.calificacion = aciertos*4;
            setCalificacion(calificacion);
        } else {
            throw new IllegalArgumentException("Error. La calificacion es mayor que la calificacion maxima");
        }
    }
    
    public double notaVigesimal(double calificacion) {
        return (calificacion*20)/notaMax;
    }
    
    public void mostrarEvaluacion() {
    System.out.println("Nombre: " + nombreEvaluacion);
    System.out.println("Tipo: " + tipoEvaluacion);
    System.out.println("Fecha: " + fechaEvaluacion);
    System.out.println("Nota máxima: " + notaMax);
    System.out.println("Numero de preguntas: " + numeroPreguntas);
    }
}
