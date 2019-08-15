/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao;

import com.uisrael.restaurante.modelo.entidad.Restaurantes;
import java.util.List;

/**
 *
 * @author Stalin
 */
public interface IRestaurantesDao {

    public void insertarRestaurante(Restaurantes nuevoRestaurantes);

    public List<Restaurantes> listarRestaurantes();

    public boolean actualizarRestaurante(Restaurantes atualizaRestaurantes);
}
