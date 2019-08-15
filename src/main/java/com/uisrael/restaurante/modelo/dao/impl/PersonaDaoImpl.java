/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao.impl;

import com.uisrael.restaurante.modelo.entidad.Personas;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.uisrael.restaurante.modelo.dao.IPersonasDao;

/**
 *
 * @author Stalin
 */
public class PersonaDaoImpl extends GenericDaoImpl<Personas> implements IPersonasDao {

    public PersonaDaoImpl(Class<Personas> entityClass) {
        super(entityClass);
    }

    @Override
    public void insertarPersonas(Personas nuevoPersonas) {
        System.out.println("DAO: Insertó Persona" + nuevoPersonas);
        this.beginTransaction();
        this.create(nuevoPersonas);
        this.commit();
    }

    @Override
    public List<Personas> listarPersonas() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Personas> p = cb.createQuery(Personas.class);
        Root<Personas> personaList = p.from(Personas.class);
        p.select(personaList);
        //p.where(cb.equal(personaList.get("estado"), 1));
        List<Personas> lista = this.entityManager.createQuery(p).getResultList();
        return lista;
    }

    @Override
    public boolean actualizarPersonas(Personas atualizaPersonas) {
        try {
            this.beginTransaction();
            this.update(atualizaPersonas);
            this.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
