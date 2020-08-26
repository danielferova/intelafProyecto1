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
public class REGISTRO_VENTAS {
    private int idRegistroVentas;
    private int idVentas;
    private String idProducto;
    private int cantidadExistencia;
    private int cantidadVentas;
    private String fechaVentas;
    private String idTienda;

    public REGISTRO_VENTAS(int idRegistroVentas, int idVentas, String idProducto, int cantidadExistencia, int cantidadVentas, String fechaVentas, String idTienda) {
        this.idRegistroVentas = idRegistroVentas;
        this.idVentas = idVentas;
        this.idProducto = idProducto;
        this.cantidadExistencia = cantidadExistencia;
        this.cantidadVentas = cantidadVentas;
        this.fechaVentas = fechaVentas;
        this.idTienda = idTienda;
    }

    public int getIdRegistroVentas() {
        return idRegistroVentas;
    }

    public void setIdRegistroVentas(int idRegistroVentas) {
        this.idRegistroVentas = idRegistroVentas;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public String getFechaVentas() {
        return fechaVentas;
    }

    public void setFechaVentas(String fechaVentas) {
        this.fechaVentas = fechaVentas;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }
    
}
