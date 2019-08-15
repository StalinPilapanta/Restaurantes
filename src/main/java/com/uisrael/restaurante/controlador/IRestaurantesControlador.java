/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador;

import com.uisrael.restaurante.modelo.entidad.Restaurantes;
import java.util.List;

/**
 *
 * @author Stalin
 */
public interface IRestaurantesControlador {

    public boolean insertarPersonas(Restaurantes nuevoPersonas);

    public List<Restaurantes> listarPersonas();

    public boolean actualizarPersonas(Restaurantes atualizaPersonas);
}
