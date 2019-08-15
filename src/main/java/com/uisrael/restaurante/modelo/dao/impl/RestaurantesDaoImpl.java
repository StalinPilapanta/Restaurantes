/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao.impl;

import com.uisrael.restaurante.modelo.dao.IRestaurantesDao;
import com.uisrael.restaurante.modelo.entidad.Restaurantes;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Stalin
 */
public class RestaurantesDaoImpl extends GenericDaoImpl<Restaurantes> implements IRestaurantesDao{

    public RestaurantesDaoImpl(Class<Restaurantes> entityClass) {
        super(entityClass);
    }

    
    
    @Override
    public void insertarRestaurante(Restaurantes nuevoRestaurantes) {
        System.out.println("DAO: Insertó Persona" + nuevoRestaurantes);
        this.beginTransaction();
        this.create(nuevoRestaurantes);
        this.commit();
    }

    @Override
    public List<Restaurantes> listarRestaurantes() {
        CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<Restaurantes> p = cb.createQuery(Restaurantes.class);
        Root<Restaurantes> restauranteList = p.from(Restaurantes.class);
        p.select(restauranteList);
        //p.where(cb.equal(restauranteList.get("estado"), 1));
        List<Restaurantes> lista = this.entityManager.createQuery(p).getResultList();
        return lista;
    }

    @Override
    public boolean actualizarRestaurante(Restaurantes atualizaRestaurantes) {
        try {
            this.beginTransaction();
            this.update(atualizaRestaurantes);
            this.commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
