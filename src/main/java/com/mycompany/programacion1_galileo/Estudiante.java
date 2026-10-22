package com.mycompany.programacion1_galileo;

public class Estudiante {
    
    private static int contadorEstudiantes = 0;

    private String dni;
    private String nombreCompleto;
    private String carrera;
    private boolean becado;
    
    //Constructorpor defecto
    public Estudiante() {
        contadorEstudiantes++;
    }
    
    //Constructor parametrizado
    public Estudiante(String dni, String nombreCompleto, String carrera, boolean becado) {
        setDni(dni);
        this.nombreCompleto = nombreCompleto;
        this.carrera = carrera;
        this.becado = becado;
        contadorEstudiantes++;
    }
    
    //setters y getters
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        if (dni !=null && dni.length() == 8) {
            this.dni = dni;
        } else {
            this.dni = "";
        }
    }
    
    public String getNombreCompleto() { 
        return nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto != null) {
            this.nombreCompleto = nombreCompleto;
        } else {
            this.nombreCompleto = "Sin nombre";
        }
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public void setCarrera(String carrera) {
        if (carrera != null) {
            this.carrera = carrera;
        } else {
            this.carrera = "No asignado";
        }
    }
    
    public boolean getBecado() {
        return becado;
    }
    
    public void setBecado(boolean becado) {
        this.becado = becado;
    }
    
    public static int getContadorEstudiantes() {
        return contadorEstudiantes;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombres del estudiante: " + getNombreCompleto());
        System.out.println("Dni del estudiante: " + getDni());
        System.out.println("Carrera del estudiante: " + getCarrera());
        System.out.println("El estudiante es becado?: " + getBecado());
    }
}
