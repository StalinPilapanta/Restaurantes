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

    public ReservasDaoImpl(Class<Reservas> entityClass) {
        super(entityClass);
    }

    @Override
    public void insertarReserva(Reservas nuevoReserva) {
        this.beginTransaction();
        this.create(nuevoReserva);
        this.commit();
    }

    @Override
    public List<Reservas> listarReservas() {
        CriteriaBuilder cb= this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Reservas> p= cb.createQuery(Reservas.class);
        Root<Reservas> reservalList= p.from(Reservas.class);
        p.select(reservalList);
        //p.where(cb.equal(reservalList.get("estado"), 1));
        return this.entityManager.createQuery(p).getResultList();
    }

}
