/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.gerente.model.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author gusta
 */
public class GerenteTest {
    public static void main(String[] args) {

        Long senha = 1234L;
        
        Gerente g = new Gerente();
        g.setCpf("40038933");
        g.setSenha(senha);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mili");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}