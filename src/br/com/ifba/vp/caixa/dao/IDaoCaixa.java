/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.caixa.dao;

import br.com.ifba.vp.caixa.model.bean.Caixa;
import java.util.List;

/**
 *
 * @author gusta
 */
public interface IDaoCaixa {
    public abstract List<Caixa> findByIdSenhaCaixa(Caixa caixa);
}
