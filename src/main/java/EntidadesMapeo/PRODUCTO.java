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
public class PRODUCTO {
    private String nombreProducto;
    private String fabricanteProducto;
    private String idProducto;
    private int existenciasCantidad;
    private double precioProducto;
    private String idTienda;
    private String descripcionProducto;
    private int garantiaProducto;

    public PRODUCTO(String nombreProducto, String fabricanteProducto, String idProducto, int existenciasCantidad, double precioProducto, String idTienda) {
        this.nombreProducto = nombreProducto;
        this.fabricanteProducto = fabricanteProducto;
        this.idProducto = idProducto;
        this.existenciasCantidad = existenciasCantidad;
        this.precioProducto = precioProducto;
        this.idTienda = idTienda;
    }

    public PRODUCTO(String nombreProducto, String fabricanteProducto, String idProducto, int existenciasCantidad, double precioProducto, String idTienda, String descripcionProducto, int garantiaProducto) {
        this.nombreProducto = nombreProducto;
        this.fabricanteProducto = fabricanteProducto;
        this.idProducto = idProducto;
        this.existenciasCantidad = existenciasCantidad;
        this.precioProducto = precioProducto;
        this.idTienda = idTienda;
        this.descripcionProducto = descripcionProducto;
        this.garantiaProducto = garantiaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFabricanteProducto() {
        return fabricanteProducto;
    }

    public void setFabricanteProducto(String fabricanteProducto) {
        this.fabricanteProducto = fabricanteProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getExistenciasCantidad() {
        return existenciasCantidad;
    }

    public void setExistenciasCantidad(int existenciasCantidad) {
        this.existenciasCantidad = existenciasCantidad;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getGarantiaProducto() {
        return garantiaProducto;
    }

    public void setGarantiaProducto(int garantiaProducto) {
        this.garantiaProducto = garantiaProducto;
    }

}
