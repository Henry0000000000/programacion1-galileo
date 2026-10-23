package com.mycompany.programacion1_galileo;
public class Docente {
    private static int contadorDocentes = 0;
    private String dni;
    private String nombreCompleto;
    private String telefono;
    //private List<Asignatura> asignaturaDicta;
    
    public Docente(){
        dni = "Sin DNI";
        nombreCompleto = "Sin nombre";
        telefono = "Sin telefono";
        contadorDocentes++;
    }
    
    public Docente(String dni){
        setDni(dni);
        nombreCompleto = "Sin nombre";
        telefono = "Sin telefono";
        contadorDocentes++;
    }
    
    public Docente(String dni, String nombreCompleto){
        setDni(dni);
        setNombreCompleto(nombreCompleto);
        telefono = "Sin telefono";
        contadorDocentes++;
    }
    
    public Docente(String dni, String nombreCompleto, String telefono){
        setDni(dni);
        setNombreCompleto(nombreCompleto);
        setTelefono(telefono);
        contadorDocentes++;
    }

    public void setDni(String dni) {
        if(dni.length() == 8)
            this.dni = dni;
        else
            throw new IllegalArgumentException("Error. Ingrese los 8 numeros del DNI.");     
    }

    public void setNombreCompleto(String nombreCompleto) {
        if(nombreCompleto != null)
            this.nombreCompleto = nombreCompleto;
        else
            throw new IllegalArgumentException("Error. Ingrese un nombre.");  
    }

    public void setTelefono(String telefono) {
        if(telefono.length() == 9 && telefono.startsWith("9"))
            this.telefono = telefono;
        else
            throw new IllegalArgumentException("Error. El telefon debe tener 9 numeros y empezar con 9."); 
    }

    public String getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre completo del docente: " + getNombreCompleto());
        System.out.println("DNI del docente: " + getDni());
        System.out.println("Telefono del docente: " + getTelefono());
    }
}
