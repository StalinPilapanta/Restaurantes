/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.vistas;

import com.uisrael.restaurante.controlador.IRestaurantesControlador;
import com.uisrael.restaurante.controlador.impl.RestaurantesControladorImpl;
import com.uisrael.restaurante.modelo.entidad.Restaurantes;
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
@ManagedBean(name = "rescore")
@ViewScoped
public class RestaurantesView implements Serializable {

    private String nombreR;
    private String direccionR;
    private String horarioR;
    private String precioPR;
    private String acercaR;
    private String caracteristicas;
    
    
    private Restaurantes nuevoRestaurante;
    private IRestaurantesControlador restauranteControlador;
    private List<Restaurantes> listaRestaurante;

    public RestaurantesView() {
    }

    @PostConstruct
    public void init() {

        System.out.println("Manejador de Restaurantes Listo!!");
        listaRestaurante = new ArrayList<>();
        restauranteControlador = new RestaurantesControladorImpl();
        listarRestaurante();
        
    }

    
    public void listarRestaurante() {

        restauranteControlador = new RestaurantesControladorImpl();
        listaRestaurante = restauranteControlador.listarPersonas();
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

    public Restaurantes getNuevoRestaurante() {
        return nuevoRestaurante;
    }

    public void setNuevoRestaurante(Restaurantes nuevoRestaurante) {
        this.nuevoRestaurante = nuevoRestaurante;
    }

    public IRestaurantesControlador getRestauranteControlador() {
        return restauranteControlador;
    }

    public void setRestauranteControlador(IRestaurantesControlador restauranteControlador) {
        this.restauranteControlador = restauranteControlador;
    }

    public List<Restaurantes> getListaRestaurante() {
        return listaRestaurante;
    }

    public void setListaRestaurante(List<Restaurantes> listaRestaurante) {
        this.listaRestaurante = listaRestaurante;
    }
    
     
    public void insertarRestaurante(){
    
        nuevoRestaurante = new Restaurantes();
        nuevoRestaurante.setNombreR(nombreR);
        nuevoRestaurante.setDireccionR(direccionR);
        nuevoRestaurante.setHorarioR(horarioR);
        nuevoRestaurante.setPrecioPR(precioPR);
        nuevoRestaurante.setAcercaR(acercaR);
        nuevoRestaurante.setCaracteristicas(caracteristicas);
        
        restauranteControlador = new RestaurantesControladorImpl();
        restauranteControlador.insertarPersonas(nuevoRestaurante);
        listarRestaurante();
    }
    
    
}
