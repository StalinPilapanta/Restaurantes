/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.vistas;

import com.uisrael.restaurante.controlador.IReservaControlador;
import com.uisrael.restaurante.controlador.impl.ReservaControladorImpl;
import com.uisrael.restaurante.modelo.entidad.Reservas;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Stalin
 */
@ManagedBean(name = "resercore")
@ViewScoped
public class ReservasView {

    private String horaR;
    private String fechaR;
    private Reservas nuevoReserva;
    private IReservaControlador reservaControlador;
    private List<Reservas> listareserva;

    public ReservasView() {
    }

    @PostConstruct
    public void init() {
        listarReserva();
    }

    public void insertarReserva() {
        nuevoReserva = new Reservas();
        nuevoReserva.setHoraR(horaR);
        nuevoReserva.setFechaR(fechaR);
        reservaControlador = new ReservaControladorImpl();
        try {
            reservaControlador.insertarReservas(nuevoReserva);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Registro Creado"));
            limpiar();
            listarReserva();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Info", e.getMessage()));
        }
        
    }

    public void listarReserva() {
        reservaControlador = new ReservaControladorImpl();
        listareserva = reservaControlador.listarReservas();
    }
    

    public void limpiar() {
        horaR = "";
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

    public Reservas getNuevoReserva() {
        return nuevoReserva;
    }

    public void setNuevoReserva(Reservas nuevoReserva) {
        this.nuevoReserva = nuevoReserva;
    }

    public IReservaControlador getReservaControlador() {
        return reservaControlador;
    }

    public void setReservaControlador(IReservaControlador reservaControlador) {
        this.reservaControlador = reservaControlador;
    }

    public List<Reservas> getListareserva() {
        return listareserva;
    }

    public void setListareserva(List<Reservas> listareserva) {
        this.listareserva = listareserva;
    }


}
