/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntidadesMapeo;

/**
 * campos
 * @author danielferova
 */
public class PEDIDO {
    //campos de PEDIDO
   private int idPedido;
   private String tiendaOrigen;
   private String tiendaDestino;
   private String Fecha;
   private String nitCliente;
   private double Total;
   private double anticipoTotal;
   private double totalApagar;
   private String fechaEntrega;
   private int tiempoEndias;
   private String estadoPedido;
   //para mandar a DESCRIPCION PRODUCTO
   private String IdProducto;
   private int cantidadTienda;
   private int cantidadNueva;
   private double totalProducto;

    public PEDIDO(int idPedido, String tiendaOrigen, String tiendaDestino, String Fecha, String nitCliente, String IdProducto, int cantidadTienda, double totalProducto,double anticipoTotal) {
        this.idPedido = idPedido;
        this.tiendaOrigen = tiendaOrigen;
        this.tiendaDestino = tiendaDestino;
        this.Fecha = Fecha;
        this.nitCliente = nitCliente;
        this.anticipoTotal = anticipoTotal;
        this.IdProducto = IdProducto;
        this.cantidadTienda = cantidadTienda;
        this.totalProducto = totalProducto;
    }

   

    public PEDIDO(int idPedido, String tiendaOrigen, String tiendaDestino, String Fecha, String nitCliente, double Total, double anticipoTotal, double totalApagar, String fechaEntrega, int tiempoEndias, String estadoPedido) {
        this.idPedido = idPedido;
        this.tiendaOrigen = tiendaOrigen;
        this.tiendaDestino = tiendaDestino;
        this.Fecha = Fecha;
        this.nitCliente = nitCliente;
        this.Total = Total;
        this.anticipoTotal = anticipoTotal;
        this.totalApagar = totalApagar;
        this.fechaEntrega = fechaEntrega;
        this.tiempoEndias = tiempoEndias;
        this.estadoPedido = estadoPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getTiendaOrigen() {
        return tiendaOrigen;
    }

    public void setTiendaOrigen(String tiendaOrigen) {
        this.tiendaOrigen = tiendaOrigen;
    }

    public String getTiendaDestino() {
        return tiendaDestino;
    }

    public void setTiendaDestino(String tiendaDestino) {
        this.tiendaDestino = tiendaDestino;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitClientes) {
        this.nitCliente = nitClientes;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getAnticipoTotal() {
        return anticipoTotal;
    }

    public void setAnticipoTotal(double anticipoTotal) {
        this.anticipoTotal = anticipoTotal;
    }

    public double getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(double totalApagar) {
        this.totalApagar = totalApagar;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getTiempoEndias() {
        return tiempoEndias;
    }

    public void setTiempoEndias(int tiempoEndias) {
        this.tiempoEndias = tiempoEndias;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(String IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getCantidadTienda() {
        return cantidadTienda;
    }

    public void setCantidadTienda(int cantidadTienda) {
        this.cantidadTienda = cantidadTienda;
    }

    public int getCantidadNueva() {
        return cantidadNueva;
    }

    public void setCantidadNueva(int cantidadNueva) {
        this.cantidadNueva = cantidadNueva;
    }

    public double getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(double totalProducto) {
        this.totalProducto = totalProducto;
    }
    
   
}

