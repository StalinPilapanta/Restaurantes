/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.controlador.impl;

import com.uisrael.restaurante.controlador.IPersonasControlador;
import com.uisrael.restaurante.modelo.dao.IPersonasDao;
import com.uisrael.restaurante.modelo.dao.impl.PersonaDaoImpl;
import com.uisrael.restaurante.modelo.entidad.Personas;
import java.util.List;

/**
 *
 * @author Stalin
 */
public class PersonaControladorImpl implements IPersonasControlador{

    @Override
    public boolean insertarPersonas(Personas nuevoPersonas) {
        IPersonasDao personasDao = new PersonaDaoImpl(Personas.class);
        personasDao.insertarPersonas(nuevoPersonas);
        return true;
    }

    @Override
    public List<Personas> listarPersonas() {
       IPersonasDao personasDao = new PersonaDaoImpl(Personas.class);
       return personasDao.listarPersonas();
       
    }

    @Override
    public boolean actualizarPersonas(Personas atualizaPersonas) {
        IPersonasDao personasDao = new PersonaDaoImpl(Personas.class);
        return personasDao.actualizarPersonas(atualizaPersonas);
    }
    
}
