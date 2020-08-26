/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesMapeo;

/**
 *
 * @author danielferova
 */
public class CLIENTE {
    private String nombreCliente;
    private String nitCliente;
    private String telefonoCliente;
    private double creditoCompra;
    private String dpiCliente;
    private String correoCliente;
    private String direccionCliente;

    public CLIENTE(String nombreCliente, String nitCliente, String telefonoCliente, double creditoCompra) {
        this.nombreCliente = nombreCliente;
        this.nitCliente = nitCliente;
        this.telefonoCliente = telefonoCliente;
        this.creditoCompra = creditoCompra;
    }

    public CLIENTE(String nombreCliente, String nitCliente, String telefonoCliente, double creditoCompra, String dpiCliente, String correoCliente, String direccionCliente) {
        this.nombreCliente = nombreCliente;
        this.nitCliente = nitCliente;
        this.telefonoCliente = telefonoCliente;
        this.creditoCompra = creditoCompra;
        this.dpiCliente = dpiCliente;
        this.correoCliente = correoCliente;
        this.direccionCliente = direccionCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public double getCreditoCompra() {
        return creditoCompra;
    }

    public void setCreditoCompra(double creditoCompra) {
        this.creditoCompra = creditoCompra;
    }

    public String getDpiCliente() {
        return dpiCliente;
    }

    public void setDpiCliente(String dpiCliente) {
        this.dpiCliente = dpiCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    
}
