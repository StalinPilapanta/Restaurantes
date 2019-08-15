/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador.impl;

import com.uisrael.restaurante.controlador.IRestaurantesControlador;
import com.uisrael.restaurante.modelo.dao.IRestaurantesDao;
import com.uisrael.restaurante.modelo.dao.impl.RestaurantesDaoImpl;
import com.uisrael.restaurante.modelo.entidad.Restaurantes;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class RestaurantesControladorImpl  implements IRestaurantesControlador{

    @Override
    public boolean insertarPersonas(Restaurantes nuevoPersonas) {
        IRestaurantesDao restauranteDao = new RestaurantesDaoImpl(Restaurantes.class);
        restauranteDao.insertarRestaurante(nuevoPersonas);
        return true;
    }

    @Override
    public List<Restaurantes> listarPersonas() {
        IRestaurantesDao restauranteDao = new RestaurantesDaoImpl(Restaurantes.class);
        return restauranteDao.listarRestaurantes();
    }

    @Override
    public boolean actualizarPersonas(Restaurantes atualizaPersonas) {
        IRestaurantesDao restauranteDao = new RestaurantesDaoImpl(Restaurantes.class);
        return restauranteDao.actualizarRestaurante(atualizaPersonas);
    }
    
}
