/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.dao;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import br.com.ifba.vp.infrastructure.dao.GenericDAO;
import java.util.List;

/**
 *
 * @author gusta
 */
public class DaoCaixa extends GenericDAO<Caixa> implements IDaoCaixa{
    @Override
    public List<Caixa> findByIdSenhaCaixa(Caixa caixa) {
        
        String query = "select caixa from Caixa caixa WHERE caixa.id = "+ caixa.getId() +" and senha = "+ caixa.getSenha() +" ";
        return GenericDAO.entityManager.createQuery(query).getResultList();
    }
}
