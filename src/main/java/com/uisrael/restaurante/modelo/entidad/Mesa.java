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
@Table(name = "mesa")
public class Mesa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idMesa;
    private int numeroM;
    private String ubicacionM;
    private String detalleM;

    public Mesa() {
    }

    public Mesa(int idMesa, int numeroM, String ubicacionM, String detalleM) {
        this.idMesa = idMesa;
        this.numeroM = numeroM;
        this.ubicacionM = ubicacionM;
        this.detalleM = detalleM;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumeroM() {
        return numeroM;
    }

    public void setNumeroM(int numeroM) {
        this.numeroM = numeroM;
    }

    public String getUbicacionM() {
        return ubicacionM;
    }

    public void setUbicacionM(String ubicacionM) {
        this.ubicacionM = ubicacionM;
    }

    public String getDetalleM() {
        return detalleM;
    }

    public void setDetalleM(String detalleM) {
        this.detalleM = detalleM;
    }


    
    


    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", numeroM=" + numeroM + ", ubicacionM=" + ubicacionM + ", detalleM=" + detalleM + '}';
    }
    
    
}
