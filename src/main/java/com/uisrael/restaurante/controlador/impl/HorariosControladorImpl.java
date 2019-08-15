/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador.impl;

import com.uisrael.restaurante.controlador.IHorariosControlador;
import com.uisrael.restaurante.modelo.dao.IHorariosDao;
import com.uisrael.restaurante.modelo.dao.impl.HorariosDaoImpl;
import com.uisrael.restaurante.modelo.entidad.Horarios;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class HorariosControladorImpl implements IHorariosControlador {

    @Override
    public boolean insertarPersonas(Horarios nuevoPersonas) {
        IHorariosDao horarioDao = new HorariosDaoImpl(Horarios.class);
        horarioDao.insertarPersonas(nuevoPersonas);
        return true;
    }

    @Override
    public List<Horarios> listarPersonas() {
        IHorariosDao horarioDao = new HorariosDaoImpl(Horarios.class);
        return horarioDao.listarHorarios();
    }

    @Override
    public boolean actualizarPersonas(Horarios atualizaPersonas) {
        IHorariosDao horarioDao = new HorariosDaoImpl(Horarios.class);
        return horarioDao.actualizarHorarios(atualizaPersonas);
    }

}
