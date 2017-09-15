/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author JcBartra
 */
public class tipo_moneda {
    
    String tipo_moneda_id;
    String tipo;
    String simbolo;
    String estado;

    public tipo_moneda() {
    }

    public String getTipo_moneda_id() {
        return tipo_moneda_id;
    }

    public void setTipo_moneda_id(String tipo_moneda_id) {
        this.tipo_moneda_id = tipo_moneda_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
