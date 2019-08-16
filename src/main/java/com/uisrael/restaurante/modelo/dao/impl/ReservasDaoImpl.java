/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao.impl;

import com.uisrael.restaurante.modelo.dao.IReservasDao;
import com.uisrael.restaurante.modelo.entidad.Reservas;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Stalin
 */
public class ReservasDaoImpl extends GenericDaoImpl<Reservas> implements IReservasDao {


    @Override
    public void insertarReservas(Reservas personaReserva) {
        this.beginTransaction();
        this.create(personaReserva);
        this.commit();
    }


 @Override
    public List<Reservas> listarReservasAll() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Reservas> p = cb.createQuery(Reservas.class);
        Root<Reservas> reservasList = p.from(Reservas.class);
        p.select(reservasList);
        return this.entityManager.createQuery(p).getResultList();
    }


}
