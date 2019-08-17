/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador.impl;

import com.uisrael.restaurante.controlador.IReservaControlador;
import com.uisrael.restaurante.modelo.dao.IReservasDao;
import com.uisrael.restaurante.modelo.dao.impl.ReservasDaoImpl;
import com.uisrael.restaurante.modelo.entidad.Reservas;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class ReservaControladorImpl implements IReservaControlador{

    @Override
    public void insertarReservas(Reservas nuevoReservas) {
        IReservasDao reservaDao = new ReservasDaoImpl(Reservas.class);
        reservaDao.insertarReserva(nuevoReservas);
    }

    @Override
    public List<Reservas> listarReservas() {
        IReservasDao reservaDao = new ReservasDaoImpl(Reservas.class);
        return reservaDao.listarReservas();
    }
    
}
