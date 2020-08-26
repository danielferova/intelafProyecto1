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
public class EMPLEADO {
  
    private String nombreEmpleado;
    private String idEmpleado;
    private String telefonoEmpleado;
    private String dpiEmpleado;
    private String nitEmpleado;
    private String correoEmpleado;
    private String direccionEmpleado;

    public EMPLEADO(String nombreEmpleado, String idEmpleado, String telefonoEmpleado, String dpiEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.idEmpleado = idEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.dpiEmpleado = dpiEmpleado;
    }

    public EMPLEADO(String nombreEmpleado, String idEmpleado, String telefonoEmpleado, String dpiEmpleado, String nitEmpleado, String correoEmpleado, String direccionEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.idEmpleado = idEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.dpiEmpleado = dpiEmpleado;
        this.nitEmpleado = nitEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.direccionEmpleado = direccionEmpleado;
    }

    public EMPLEADO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public String getDpiEmpleado() {
        return dpiEmpleado;
    }

    public void setDpiEmpleado(String dpiEmpleado) {
        this.dpiEmpleado = dpiEmpleado;
    }

    public String getNitEmpleado() {
        return nitEmpleado;
    }

    public void setNitEmpleado(String nitEmpleado) {
        this.nitEmpleado = nitEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }
    
}
