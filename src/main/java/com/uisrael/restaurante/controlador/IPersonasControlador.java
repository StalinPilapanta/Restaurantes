/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador;

import com.uisrael.restaurante.modelo.entidad.Personas;
import java.util.List;

/**
 *
 * @author Stalin
 */
public interface IPersonasControlador {

    public boolean insertarPersonas(Personas nuevoPersonas);

    public List<Personas> listarPersonas();

    public boolean actualizarPersonas(Personas atualizaPersonas);
}
