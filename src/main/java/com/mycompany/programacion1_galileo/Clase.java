package com.mycompany.programacion1_galileo;
import java.time.LocalTime;
public class Clase {
    private String codigoClase;
    private LocalTime horaInicio = LocalTime.of(14, 30, 15);
    private int duracion;
    private String dia;
    private String Asignatura;
    
    public Clase(){
        codigoClase = "Sin codigo.";
        duracion = 0;
        dia = "Sin dia.";
        Asignatura = "Sin asignatura.";
    }
    
    public Clase(String codigoClase){
        setCodigoClase(codigoClase);
        duracion = 0;
        dia = "Sin dia.";
        Asignatura = "Sin asignatura.";
    }
    
    public Clase(String codigoClase, LocalTime horaInicio, int duración, String dia){
        setCodigoClase(codigoClase);
        setHoraInicio(horaInicio);
        setDuracion(duracion);
        setDia(dia);
        Asignatura = "Sin asignatura.";
        
    }
    
    public Clase(String codigoClase, LocalTime horaInicio, String horaFinal, String asignatura){
        setCodigoClase(codigoClase);
        setHoraInicio(horaInicio);
        setDuracion(duracion);
        setDia(dia);
        setAsignatura(asignatura);
    }

    public void setCodigoClase(String codigoClase) {
        if(codigoClase != null)
            this.codigoClase = codigoClase;
        else
            throw new IllegalArgumentException("Error. Ingrese un codigo.");
    }

    public void setHoraInicio(LocalTime horaInicio) {
        if(horaInicio != null)
            this.horaInicio = horaInicio;
        else
            throw new IllegalArgumentException("Error. Ingrese un hora correcta.");
    }

    public void setDuracion(int duracion) {
        if(duracion != 0)
            this.duracion = duracion;
        else
            throw new IllegalArgumentException("Error. Ingrese un duracion correcta.");
    }
    
    public void setDia(String dia){
        if(dia != null)
            this.dia = dia;
        else
            throw new IllegalArgumentException("Error. Ingrese un dia correcto.");
    }

    public void setAsignatura(String Asignatura) {
        if(Asignatura != null)
            this.Asignatura = Asignatura;
        else
            throw new IllegalArgumentException("Error. Ingrese una asignatura.");
    }

    public String getCodigoClase() {
        return codigoClase;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public String getDia(){
        return dia;
    }

    public String getAsignatura() {
        return Asignatura;
    }
    
    public void Recuperacion(String dia){
        setDia(dia);
        System.out.println("DATOS DE LA RECUPERACION DE CLASE:");
        mostrarInfo();
    }
    
    public void Recuperacion(LocalTime horaInicio){
        setHoraInicio(horaInicio);
        System.out.println("DATOS DE LA RECUPERACION DE CLASE:");
        mostrarInfo();
    }
    
    public void Recuperacion(String dia, LocalTime horaInicio){
        setDia(dia);
        setHoraInicio(horaInicio);
        System.out.println("DATOS DE LA RECUPERACION DE CLASE:");
        mostrarInfo();
    }
    
    public void mostrarInfo() {
        System.out.println("Codigo de la clase: " + getCodigoClase());
        System.out.println("Hora de inicio: " + getHoraInicio());
        System.out.println("Duracion: " + getDuracion());
        System.out.println("Dia de la clase: " + getDia());
        System.out.println("Asignatura: " + getAsignatura());
    }
}
