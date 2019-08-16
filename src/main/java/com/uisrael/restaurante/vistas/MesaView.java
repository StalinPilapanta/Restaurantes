/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.vistas;

import com.uisrael.restaurante.controlador.IMesaControlador;
import com.uisrael.restaurante.controlador.impl.MesaControladorImpl;
import com.uisrael.restaurante.modelo.entidad.Mesa;
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
@ManagedBean(name = "mesacore")
@ViewScoped
public class MesaView implements Serializable {

    private int numeroM;
    private String ubicacionM;
    private String detalleM;

    private Mesa nuevaMesa;
    private IMesaControlador mesaControlador;
    private List<Mesa> listaMesa;

    public MesaView() {
    }

    @PostConstruct
    public void init() {
        System.out.println("Manejador de Mesas Listo!!");
        listaMesa = new ArrayList<>();
        mesaControlador = new MesaControladorImpl();
        listarMesas();
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

    public Mesa getNuevaMesa() {
        return nuevaMesa;
    }

    public void setNuevaMesa(Mesa nuevaMesa) {
        this.nuevaMesa = nuevaMesa;
    }

    public IMesaControlador getMesaControlador() {
        return mesaControlador;
    }

    public void setMesaControlador(IMesaControlador mesaControlador) {
        this.mesaControlador = mesaControlador;
    }

    public List<Mesa> getListaMesa() {
        return listaMesa;
    }

    public void setListaMesa(List<Mesa> listaMesa) {
        this.listaMesa = listaMesa;
    }


    public void insertarMesa() {
        nuevaMesa = new Mesa();
        nuevaMesa.setNumeroM(numeroM);
        nuevaMesa.setUbicacionM(ubicacionM);
        nuevaMesa.setDetalleM(detalleM);

        mesaControlador = new MesaControladorImpl();
        mesaControlador.insertarMesa(nuevaMesa);
        listarMesas();
    }

    public void listarMesas() {
        mesaControlador = new MesaControladorImpl();
        listaMesa = mesaControlador.listarMesas();
    }

}
