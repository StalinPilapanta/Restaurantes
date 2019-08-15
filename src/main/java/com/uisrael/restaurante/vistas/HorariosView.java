/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.vistas;

import com.uisrael.restaurante.controlador.impl.HorariosControladorImpl;
import com.uisrael.restaurante.modelo.entidad.Horarios;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Stalin
 */
@ManagedBean(name = "horacore")
@ViewScoped
public class HorariosView implements Serializable {

    private String hora;
    private String detalle;
    private String recargo;

    private Horarios nuevoHorario;
    private HorariosControladorImpl horarioControlador;
    private List<Horarios> listaHorario;

    public HorariosView() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Manejador de Horario Listo!!");
        listaHorario = new ArrayList<>();
        horarioControlador = new HorariosControladorImpl();
        listaHorario();
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

    public Horarios getNuevoHorario() {
        return nuevoHorario;
    }

    public void setNuevoHorario(Horarios nuevoHorario) {
        this.nuevoHorario = nuevoHorario;
    }

    public HorariosControladorImpl getHorarioControlador() {
        return horarioControlador;
    }

    public void setHorarioControlador(HorariosControladorImpl horarioControlador) {
        this.horarioControlador = horarioControlador;
    }

    public List<Horarios> getListaHorario() {
        return listaHorario;
    }

    public void setListaHorario(List<Horarios> listaHorario) {
        this.listaHorario = listaHorario;
    }
    
    
    public void insertarHorario() {

        nuevoHorario = new Horarios();
        nuevoHorario.setHora(hora);
        nuevoHorario.setRecargo(recargo);
        nuevoHorario.setDetalle(detalle);

        horarioControlador = new HorariosControladorImpl();
        horarioControlador.insertarPersonas(nuevoHorario);
        listaHorario();
    }

    public void listaHorario() {
        horarioControlador = new HorariosControladorImpl();
        horarioControlador.listarPersonas();
    }

}
