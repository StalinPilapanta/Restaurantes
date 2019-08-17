/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Stalin
 */
@Entity
@Table( name = "personas")
public class Personas implements Serializable{
    
    @SequenceGenerator(name = "PSEQ", sequenceName = "PERSONAS_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PSEQ")
    private int idPersona;
    private String identificacionP;
    private String nombresP;
    private String apellidosP;
    private String direccionP;
    private String emailP;
    private String telefono;
    



    public Personas() {
    }


    public Personas(int idPersona, String identificacionP, String nombresP, String apellidosP, String direccionP, String emailP, String telefono) {
        this.idPersona = idPersona;
        this.identificacionP = identificacionP;
        this.nombresP = nombresP;
        this.apellidosP = apellidosP;
        this.direccionP = direccionP;
        this.emailP = emailP;
        this.telefono = telefono;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getIdentificacionP() {
        return identificacionP;
    }

    public void setIdentificacionP(String identificacionP) {
        this.identificacionP = identificacionP;
    }

    public String getNombresP() {
        return nombresP;
    }

    public void setNombresP(String nombresP) {
        this.nombresP = nombresP;
    }

    public String getApellidosP() {
        return apellidosP;
    }

    public void setApellidosP(String apellidosP) {
        this.apellidosP = apellidosP;
    }

    public String getDireccionP() {
        return direccionP;
    }

    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    @Override
    public String toString() {
        return "Personas{" + "idPersona=" + idPersona + ", identificacionP=" + identificacionP + ", nombresP=" + nombresP + ", apellidosP=" + apellidosP + ", direccionP=" + direccionP + ", emailP=" + emailP + ", telefono=" + telefono + '}';
    }


    
}
