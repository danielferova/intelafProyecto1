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
public class DESCRIPCION_PEDIDO {
    private int idPedido;
    private String idProducto;
    private int cantidadTienda;
    private double totalProducto;
    private int cantidadNueva;

    public DESCRIPCION_PEDIDO(int idPedido, String idProducto, int cantidadTienda, double totalProducto) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidadTienda = cantidadTienda;
        this.totalProducto = totalProducto;
    }

    public DESCRIPCION_PEDIDO(int idPedido, String idProducto, int cantidadTienda, double totalProducto, int cantidadNueva) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidadTienda = cantidadTienda;
        this.totalProducto = totalProducto;
        this.cantidadNueva = cantidadNueva;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadTienda() {
        return cantidadTienda;
    }

    public void setCantidadTienda(int cantidadTienda) {
        this.cantidadTienda = cantidadTienda;
    }

    public double getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(double totalProducto) {
        this.totalProducto = totalProducto;
    }

    public int getCantidadNueva() {
        return cantidadNueva;
    }

    public void setCantidadNueva(int cantidadNueva) {
        this.cantidadNueva = cantidadNueva;
    }
    
    
}
