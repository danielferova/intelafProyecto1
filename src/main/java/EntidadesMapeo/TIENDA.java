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
public class TIENDA {
    private String nombreTienda;
    private String direccionTienda;
    private String idTienda;
    private String telefono1;
    private String telefono2;
    private String correoTienda;
    private String horarioTienda;

    public TIENDA(String nombreTienda, String direccionTienda, String idTienda, String telefono1) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.idTienda = idTienda;
        this.telefono1 = telefono1;
    }

    public TIENDA(String nombreTienda, String direccionTienda, String idTienda, String telefono1, String telefono2, String correoTienda, String horarioTienda) {
        this.nombreTienda = nombreTienda;
        this.direccionTienda = direccionTienda;
        this.idTienda = idTienda;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.correoTienda = correoTienda;
        this.horarioTienda = horarioTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreoTienda() {
        return correoTienda;
    }

    public void setCorreoTienda(String correoTienda) {
        this.correoTienda = correoTienda;
    }

    public String getHorarioTienda() {
        return horarioTienda;
    }

    public void setHorarioTienda(String horarioTienda) {
        this.horarioTienda = horarioTienda;
    }
    
}
