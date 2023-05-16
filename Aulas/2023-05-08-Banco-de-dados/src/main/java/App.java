/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Willian
 */
public class App {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();
        Authors autor = new Authors();
        autor.setFirstName("nome");
        autor.setLastName("sobrenome");
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }
}
