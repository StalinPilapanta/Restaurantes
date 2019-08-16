/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.restaurante.modelo.dao;

import com.uisrael.restaurante.modelo.entidad.Mesa;
import java.util.List;

/**
 *
 * @author Stalin
 */
public interface IMesaDao {

    public void insertarMesa(Mesa nuevoMesa);

    public List<Mesa> listarMesa();

    public boolean actualizarMesa(Mesa atualizaMesa);
}
