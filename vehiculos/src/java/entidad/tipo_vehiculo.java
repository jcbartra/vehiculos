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
public class tipo_vehiculo {
    
    String tipo_vehiculo_id;
    String tipo;
    String estado;

    public tipo_vehiculo() {
    }

    public String getTipo_vehiculo_id() {
        return tipo_vehiculo_id;
    }

    public void setTipo_vehiculo_id(String tipo_vehiculo_id) {
        this.tipo_vehiculo_id = tipo_vehiculo_id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
