/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao;

import java.util.List;

/**
 *
 * @author master
 */
public interface IGenericDao<T> {

    public T create(T t);

    public T read(Object id);

    public T update(T t);

    public void delete(T t);

    public void beginTransaction();

    public void commit();

    public void rollback();

    public void closeTransaction();

    public void commitAndCloseTransaction();

    public List<T> findAll();
}
