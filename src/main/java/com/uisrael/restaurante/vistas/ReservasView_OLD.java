/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.vistas;

import com.uisrael.restaurante.controlador.IPersonasControlador;
import com.uisrael.restaurante.controlador.IReservasControlador;
import com.uisrael.restaurante.controlador.impl.PersonaControladorImpl;
import com.uisrael.restaurante.controlador.impl.ReservasControladorImpl;
import com.uisrael.restaurante.modelo.entidad.Personas;
import com.uisrael.restaurante.modelo.entidad.Reservas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Stalin
 */
@ManagedBean(name = "resercore")
@ViewScoped
public class ReservasView_OLD implements Serializable {

    private IPersonasControlador personaControlador;
    private IReservasControlador reservaControlador;

    private List<Personas> listaPersona;
    private List<Reservas> listaInsertaReservas;
    private List<Personas> selectListaPersonas;
    private List<Reservas> listExisteDatos;

    private Personas selectPersonas;
    private Reservas selectReservaNew;

    @PostConstruct
    public void init() {

        listaInsertaReservas = new ArrayList<>();
        listaPersona = new ArrayList<>();

        listarPersona();

        listarReserva();
    }

    public void listarPersona() {
        personaControlador = new PersonaControladorImpl();
        listaPersona = personaControlador.listarPersonas();
    }

    public void listarReserva() {
        reservaControlador = new ReservasControladorImpl();
        listExisteDatos = reservaControlador.listarReservas();
    }

    public void valueChanged() {

        System.out.println("listener" + selectPersonas);

    }

    public void asignar() {

        if (selectPersonas.getIdPersona() == 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Asignar Persona", "Seleccione una Persona para continuar"));
        } else {
            if (selectListaPersonas == null) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Asignar Persona", "Seleccione al menos un usuario"));
            } else {
                llenarTabla();
                try {
                    reservaControlador = new ReservasControladorImpl();
                    reservaControlador.insertarReservas(listaInsertaReservas);
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Asignar Persona", "El perfil fue asignado correctamente "));
                } catch (Exception e) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Info", e.getMessage()));
                }

            }
        }
    }

    
    public void onRowSelect(SelectEvent event) {
        Personas selecciontmp = (Personas) event.getObject();
        for (Personas tmp : selectListaPersonas) {
            if (tmp.getIdPersona()== selecciontmp.getIdPersona()) {
                selectListaPersonas.remove(tmp);
            } else {
                selectListaPersonas.add(tmp);
            }
        }
    }
    
    public void llenarTabla(){

     for (Personas tmp : selectListaPersonas) {
            Reservas nuevo = new Reservas();
            nuevo.setFkPersonas(tmp);
            listaInsertaReservas.add(nuevo);
        }
    }

    public IPersonasControlador getPersonaControlador() {
        return personaControlador;
    }

    public void setPersonaControlador(IPersonasControlador personaControlador) {
        this.personaControlador = personaControlador;
    }

    public IReservasControlador getReservaControlador() {
        return reservaControlador;
    }

    public void setReservaControlador(IReservasControlador reservaControlador) {
        this.reservaControlador = reservaControlador;
    }

    public List<Personas> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<Personas> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public List<Reservas> getListaInsertaReservas() {
        return listaInsertaReservas;
    }

    public void setListaInsertaReservas(List<Reservas> listaInsertaReservas) {
        this.listaInsertaReservas = listaInsertaReservas;
    }

    public List<Personas> getSelectListaPersonas() {
        return selectListaPersonas;
    }

    public void setSelectListaPersonas(List<Personas> selectListaPersonas) {
        this.selectListaPersonas = selectListaPersonas;
    }

    public List<Reservas> getListExisteDatos() {
        return listExisteDatos;
    }

    public void setListExisteDatos(List<Reservas> listExisteDatos) {
        this.listExisteDatos = listExisteDatos;
    }

    public Personas getSelectPersonas() {
        return selectPersonas;
    }

    public void setSelectPersonas(Personas selectPersonas) {
        this.selectPersonas = selectPersonas;
    }

    public Reservas getSelectReservaNew() {
        return selectReservaNew;
    }

    public void setSelectReservaNew(Reservas selectReservaNew) {
        this.selectReservaNew = selectReservaNew;
    }

    
}
