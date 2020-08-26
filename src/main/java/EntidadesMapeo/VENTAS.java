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
public class VENTAS {
    private int idVentas;
    private String nitCliente;
    private double anticipoTotalVentas;
    private String fechaVentas;
    private double totalVentas;
    private double total;
    private int idPedido;
    private String idTienda;

    public VENTAS(int idVentas, String nitCliente, String fechaVentas, double totalVentas, double total, String idTienda) {
        this.idVentas = idVentas;
        this.nitCliente = nitCliente;
        this.fechaVentas = fechaVentas;
        this.totalVentas = totalVentas;
        this.total = total;
        this.idTienda = idTienda;
    }

    public VENTAS(int idVentas, String nitCliente, double anticipoTotalVentas, String fechaVentas, double totalVentas, double total, int idPedido, String idTienda) {
        this.idVentas = idVentas;
        this.nitCliente = nitCliente;
        this.anticipoTotalVentas = anticipoTotalVentas;
        this.fechaVentas = fechaVentas;
        this.totalVentas = totalVentas;
        this.total = total;
        this.idPedido = idPedido;
        this.idTienda = idTienda;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }

    public double getAnticipoTotalVentas() {
        return anticipoTotalVentas;
    }

    public void setAnticipoTotalVentas(double anticipoTotalVentas) {
        this.anticipoTotalVentas = anticipoTotalVentas;
    }

    public String getFechaVentas() {
        return fechaVentas;
    }

    public void setFechaVentas(String fechaVentas) {
        this.fechaVentas = fechaVentas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(String idTienda) {
        this.idTienda = idTienda;
    }
    
    
}
