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
public class TIEMPO_ENVIO {
    private String tiendaOrigen;
    private String tiendaDestino;
    private int tiempoenDias;

    public TIEMPO_ENVIO(String tiendaOrigen, String tiendaDestino, int tiempoenDias) {
        this.tiendaOrigen = tiendaOrigen;
        this.tiendaDestino = tiendaDestino;
        this.tiempoenDias = tiempoenDias;
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

    public int getTiempoenDias() {
        return tiempoenDias;
    }

    public void setTiempoenDias(int tiempoenDias) {
        this.tiempoenDias = tiempoenDias;
    }

    
}
