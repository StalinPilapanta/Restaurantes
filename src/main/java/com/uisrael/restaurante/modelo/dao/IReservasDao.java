/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao;

import com.uisrael.restaurante.modelo.entidad.Reservas;
import java.util.List;

/**
 *
 * @author Stalin
 */
public interface IReservasDao {

    public void insertarReservas(Reservas personaReserva);

    public List<Reservas> listarReservasAll();

}
