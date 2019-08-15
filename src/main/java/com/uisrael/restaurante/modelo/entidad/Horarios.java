/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Stalin
 */

@Entity
@Table( name = "horarios")
public class Horarios  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idH;
    private String hora;
    private String detalle;
    private String recargo;

    public Horarios() {
    }

    public Horarios(int idH, String hora, String detalle, String recargo) {
        this.idH = idH;
        this.hora = hora;
        this.detalle = detalle;
        this.recargo = recargo;
    }

    public int getIdH() {
        return idH;
    }

    public void setIdH(int idH) {
        this.idH = idH;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getRecargo() {
        return recargo;
    }

    public void setRecargo(String recargo) {
        this.recargo = recargo;
    }

    @Override
    public String toString() {
        return "Horarios{" + "idH=" + idH + ", hora=" + hora + ", detalle=" + detalle + ", recargo=" + recargo + '}';
    }
   
    


}
