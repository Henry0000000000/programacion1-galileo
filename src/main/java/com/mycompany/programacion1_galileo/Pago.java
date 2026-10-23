//Parte de Sukedi
package com.mycompany.programacion1_galileo;
public class Pago {
    private int codigoPago;
    private double pagoTotal;
    private String fechaPago;
    private double monto;
    private String metodoPago;
    private String estado;
    
    public Pago(int codigoPago, double pagoTotal, String fechaPago, double monto, String metodoPago) {
        setCodigoPago(codigoPago);
        setMonto(monto);
        setPagoTotal(pagoTotal);
        setFechaPago(fechaPago);
        setMetodoPago(metodoPago);
        this.estado = "Pendiente";
    }

    public void setCodigoPago(int codigoPago) {
        this.codigoPago = codigoPago;
    }

    public void setPagoTotal(double pagoTotal) {
        if(pagoTotal < 0){
            throw new IllegalArgumentException("Error. Monto inválido");
        } else {
            this.pagoTotal = pagoTotal;
        }
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setMonto(double monto) {
        if(monto < 0){
            throw new IllegalArgumentException("Error. Monto inválido");
        }
        this.monto = monto;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getCodigoPago() {
        return codigoPago;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getEstado() {
        return estado;
    }

    public void registrarPago() {
        System.out.println("Pago registrado correctamente.");
    }
    
    public double calcularSaldoPendiente() {
        return pagoTotal - monto;
    }
    
    public void generarComprobante() {
        System.out.println("=== COMPROBANTE DE PAGO ===");
        System.out.println("Codigo: " + codigoPago);
        System.out.println("Fecha: " + fechaPago);
        System.out.println("Monto: S/ " + monto);
        System.out.println("Método: " + metodoPago);
        System.out.println("Estado: " + estado);
    }
    
    public void confirmarPago() {
        estado = "Pagado";
        System.out.println("Pago confirmado.");
    }
}
