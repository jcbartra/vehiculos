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
public class marca {
    
    String marca_id;
    String tipo_vehiculo_id;
    String marca;
    String estado;

    public marca() {
    }

    public String getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(String marca_id) {
        this.marca_id = marca_id;
    }

    public String getTipo_vehiculo_id() {
        return tipo_vehiculo_id;
    }

    public void setTipo_vehiculo_id(String tipo_vehiculo_id) {
        this.tipo_vehiculo_id = tipo_vehiculo_id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
