/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.banco.de.dados.parte2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author willm
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco");
        EntityManager em = emf.createEntityManager();
        Livro livro = new Livro();
        livro.setName("testelivro");
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
    }
}
