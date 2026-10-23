package com.mycompany.programacion1_galileo;
public class Aula {
    private final static int CANTIDAD_SALONES = 5;
    private String codigoAula;
    private int asientos;
    private boolean proyector;
    private boolean mantenimientoRealizado;
    private boolean enUso;
    
    public Aula(){
        codigoAula = "Sin codigo.";
        asientos = 0;
        proyector = false;
        mantenimientoRealizado = false;
        enUso = false;
    }
    
    public Aula(String codigoAula, int asientos){
        setCodigoAula(codigoAula);
        setAsientos(asientos);
        proyector = false;
        mantenimientoRealizado = false;
        enUso = false;
    }
    
    public Aula(String codigoAula, int asientos, boolean proyector, boolean mantenimientoRelizado, boolean enUso){
        setCodigoAula(codigoAula);
        setAsientos(asientos);
        this.proyector = proyector;
        this.mantenimientoRealizado = mantenimientoRelizado;
        this.enUso = enUso;
    }

    public void setCodigoAula(String codigoAula) {
        if(codigoAula != null)
            this.codigoAula = codigoAula;
        else
            throw new IllegalArgumentException("Error. Ingrese un codigo valido.");
    }

    public void setAsientos(int asientos) {
        if(asientos > 0)
            this.asientos = asientos;
        else
            throw new IllegalArgumentException("Error. Ingrese un numero de asientos valido.");
    }

    public String getCodigoAula() {
        return codigoAula;
    }

    public int getAsientos() {
        return asientos;
    }

    public boolean getProyector() {
        return proyector;
    }

    public boolean getMantenimientoRealizado() {
        return mantenimientoRealizado;
    }

    public boolean getEnUso() {
        return enUso;
    }
    
    public boolean ocuparAula() {
        if (!enUso && mantenimientoRealizado) {
            enUso = true;
            return true;
        }
        return false;
    }
    
    public void liberarAula() {
        enUso = false;
    }
    
    public void implementacionProyector(){
        proyector = true;
    }
    
    public void aumentarAsientos(int asientosAgregados){
        asientos = asientos + asientosAgregados;
    }
    
    public void mostrarInformacion(){
        System.out.println("Codigo de aula: " + getCodigoAula());
        System.out.println("Asientos disponibles: " + getAsientos());
        System.out.println("¿Tiene proyector?: " + getProyector());
        System.out.println("¿Se ha realizado mantenimiendo?: " + getMantenimientoRealizado());
        System.out.println("¿Esta en uso?: " + getEnUso());
    }
}
