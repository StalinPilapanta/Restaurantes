/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Stalin
 */
@Entity
@Table(name = "reservas")
public class Reservas implements Serializable{

    @Id
    private int idR;
    private String horaR;
    private String fechaR;

    public Reservas() {
    }

    public Reservas(int idR, String horaR, String fechaR) {
        this.idR = idR;
        this.horaR = horaR;
        this.fechaR = fechaR;
    }

    
    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public String getHoraR() {
        return horaR;
    }

    public void setHoraR(String horaR) {
        this.horaR = horaR;
    }

    public String getFechaR() {
        return fechaR;
    }

    public void setFechaR(String fechaR) {
        this.fechaR = fechaR;
    }

    @Override
    public String toString() {
        return "Reservas{" + "idR=" + idR + ", horaR=" + horaR + ", fechaR=" + fechaR + '}';
    }
    
    
}
