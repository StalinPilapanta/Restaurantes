/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao.impl;

import com.uisrael.restaurante.modelo.dao.IMesaDao;
import com.uisrael.restaurante.modelo.entidad.Mesa;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Stalin
 */
public class MesaDaoImpl extends GenericDaoImpl<Mesa> implements IMesaDao {

    public MesaDaoImpl(Class<Mesa> entityClass) {
        super(entityClass);
    }

    @Override
    public void insertarMesa(Mesa nuevoMesa) {
        System.out.println("DAO: Insertó Mesa" + nuevoMesa);
        this.beginTransaction();
        this.create(nuevoMesa);
        this.commit();

    }

    @Override
    public List<Mesa> listarMesa() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Mesa> p = cb.createQuery(Mesa.class);
        Root<Mesa> mesaList = p.from(Mesa.class);
        p.select(mesaList);
        List<Mesa> lista = this.entityManager.createQuery(p).getResultList();
        return lista;
    }

    @Override
    public boolean actualizarMesa(Mesa atualizaMesa) {
       try {
            this.beginTransaction();
            this.update(atualizaMesa);
            this.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
