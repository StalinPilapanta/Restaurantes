/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao.impl;

import com.uisrael.restaurante.modelo.dao.IHorariosDao;
import com.uisrael.restaurante.modelo.entidad.Horarios;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Stalin
 */
public class HorariosDaoImpl extends GenericDaoImpl<Horarios> implements IHorariosDao{

    public HorariosDaoImpl(Class<Horarios> entityClass) {
        super(entityClass);
    }

    
    @Override
    public void insertarPersonas(Horarios nuevoHorarios) {
        System.out.println("DAO: Insertó Horario" + nuevoHorarios);
        this.beginTransaction();
        this.create(nuevoHorarios);
        this.commit();
    }

    @Override
    public List<Horarios> listarHorarios() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Horarios> p = cb.createQuery(Horarios.class);
        Root<Horarios> horariosList = p.from(Horarios.class);
        p.select(horariosList);
        List<Horarios> lista = this.entityManager.createQuery(p).getResultList();
        return lista;
    }

    @Override
    public boolean actualizarHorarios(Horarios atualizaHorarios) {
        try {
            this.beginTransaction();
            this.update(atualizaHorarios);
            this.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
