/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador;

import com.uisrael.restaurante.modelo.entidad.Horarios;
import java.util.List;

/**
 *
 * @author Stalin
 */
public interface IHorariosControlador {

    public boolean insertarPersonas(Horarios nuevoPersonas);

    public List<Horarios> listarPersonas();

    public boolean actualizarPersonas(Horarios atualizaPersonas);
}
