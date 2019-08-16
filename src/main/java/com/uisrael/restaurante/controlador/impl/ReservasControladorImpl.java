/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador.impl;

import com.uisrael.restaurante.controlador.IReservasControlador;
import com.uisrael.restaurante.modelo.dao.IReservasDao;
import com.uisrael.restaurante.modelo.dao.impl.ReservasDaoImpl;
import com.uisrael.restaurante.modelo.entidad.Reservas;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class ReservasControladorImpl implements IReservasControlador {

    @Override
    public void insertarReservas(List<Reservas> personasR) {
        IReservasDao reservaDao = new ReservasDaoImpl();
        for (Reservas tmp : personasR) {
            reservaDao.insertarReservas(tmp);
        }
    }

    @Override
    public List<Reservas> listarReservas() {
        IReservasDao reservaDao= new ReservasDaoImpl();
        return reservaDao.listarReservasAll();
    }

}
