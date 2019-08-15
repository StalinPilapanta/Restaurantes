/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.vistas;

import com.uisrael.restaurante.controlador.IPersonasControlador;
import com.uisrael.restaurante.controlador.impl.PersonaControladorImpl;
import com.uisrael.restaurante.modelo.entidad.Personas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Stalin
 */
@ManagedBean(name = "percore")
@ViewScoped
public class PersonasView implements Serializable {

    private String identificacionP;
    private String nombresP;
    private String apellidosP;
    private String direccionP;
    private String emailP;
    private String telefono;

    private Personas nuevaPersona;
    private IPersonasControlador personaControlador;
    private List<Personas> listaPersona;

    public PersonasView() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Manejador de Personas Listo!!");
        listaPersona = new ArrayList<>();
        personaControlador = new PersonaControladorImpl();
        listarPersonas();
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



    public Personas getNuevaPersona() {
        return nuevaPersona;
    }

    public void setNuevaPersona(Personas nuevaPersona) {
        this.nuevaPersona = nuevaPersona;
    }

    public IPersonasControlador getPersonaControlador() {
        return personaControlador;
    }

    public void setPersonaControlador(IPersonasControlador personaControlador) {
        this.personaControlador = personaControlador;
    }

    public List<Personas> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Personas> listaPersona) {
        this.listaPersona = listaPersona;
    }


        public void insertarPersona() {

        nuevaPersona = new Personas();
        nuevaPersona.setIdentificacionP(identificacionP);
        nuevaPersona.setNombresP(nombresP);
        nuevaPersona.setApellidosP(apellidosP);
        nuevaPersona.setDireccionP(direccionP);
        nuevaPersona.setTelefono(telefono);
        
        
        personaControlador = new PersonaControladorImpl();
        personaControlador.insertarPersonas(nuevaPersona);
        listarPersonas();
    }

    public void listarPersonas() {

        personaControlador = new PersonaControladorImpl();
        listaPersona = personaControlador.listarPersonas();
    }

}
