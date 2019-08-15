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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Stalin
 */
@Entity
@Table( name = "restaurantes")
public class Restaurantes implements Serializable{
    
    @SequenceGenerator(name = "RSEQ", sequenceName = "RESTAURANTES_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RSEQ")
    private int idRes;
    private String nombreR;
    private String direccionR;
    private String horarioR;
    private String precioPR;
    private String acercaR;
    private String caracteristicas;

    public Restaurantes() {
    }

    public Restaurantes(int idRes, String nombreR, String direccionR, String horarioR, String precioPR, String acercaR, String caracteristicas) {
        this.idRes = idRes;
        this.nombreR = nombreR;
        this.direccionR = direccionR;
        this.horarioR = horarioR;
        this.precioPR = precioPR;
        this.acercaR = acercaR;
        this.caracteristicas = caracteristicas;
    }

    public int getIdRes() {
        return idRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getDireccionR() {
        return direccionR;
    }

    public void setDireccionR(String direccionR) {
        this.direccionR = direccionR;
    }

    public String getHorarioR() {
        return horarioR;
    }

    public void setHorarioR(String horarioR) {
        this.horarioR = horarioR;
    }

    public String getPrecioPR() {
        return precioPR;
    }

    public void setPrecioPR(String precioPR) {
        this.precioPR = precioPR;
    }

    public String getAcercaR() {
        return acercaR;
    }

    public void setAcercaR(String acercaR) {
        this.acercaR = acercaR;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Restaurantes{" + "idRes=" + idRes + ", nombreR=" + nombreR + ", direccionR=" + direccionR + ", horarioR=" + horarioR + ", precioPR=" + precioPR + ", acercaR=" + acercaR + ", caracteristicas=" + caracteristicas + '}';
    }
    
    
    
    
}
