/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Stalin
 */
@Entity
@Table(name = "reservas")
public class Reservas implements Serializable{
    
    
    @SequenceGenerator(name = "RSEQ", sequenceName = "RESERVAS_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RSEQ")
    private int idR;
    private String fechaReserva;
    private int estado;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "fkidReservas")
    private Personas fkPersonas;

    public Reservas() {
    }

    public Reservas(int idR, String fechaReserva, int estado, Personas fkPersonas) {
        this.idR = idR;
        this.fechaReserva = fechaReserva;
        this.estado = estado;
        this.fkPersonas = fkPersonas;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Personas getFkPersonas() {
        return fkPersonas;
    }

    public void setFkPersonas(Personas fkPersonas) {
        this.fkPersonas = fkPersonas;
    }

    @Override
    public String toString() {
        return "Reservas{" + "idR=" + idR + ", fechaReserva=" + fechaReserva + ", estado=" + estado + ", fkPersonas=" + fkPersonas + '}';
    }

    
    
    
}
