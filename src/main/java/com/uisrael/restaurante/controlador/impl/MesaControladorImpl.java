/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador.impl;

import com.uisrael.restaurante.controlador.IMesaControlador;
import com.uisrael.restaurante.modelo.dao.IMesaDao;
import com.uisrael.restaurante.modelo.dao.impl.MesaDaoImpl;
import com.uisrael.restaurante.modelo.entidad.Mesa;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class MesaControladorImpl implements IMesaControlador {

    @Override
    public boolean insertarMesa(Mesa nuevoMesa) {
        IMesaDao mesaDao = new MesaDaoImpl(Mesa.class);
        mesaDao.insertarMesa(nuevoMesa);
        return true;

    }

    @Override
    public List<Mesa> listarMesas() {
        IMesaDao mesaDao = new MesaDaoImpl(Mesa.class);
        return mesaDao.listarMesa();
    }

    @Override
    public boolean actualizarMesa(Mesa atualizaMesa) {
        IMesaDao mesaDao = new MesaDaoImpl(Mesa.class);
        return mesaDao.actualizarMesa(atualizaMesa);
    }

}
