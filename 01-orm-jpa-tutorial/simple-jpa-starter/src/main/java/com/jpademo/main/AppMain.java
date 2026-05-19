package com.jpademo.main;

import com.jpademo.entity.Album;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AppMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager em = emf.createEntityManager();
        System.out.println("EntityManager: " + em);

        /*Album album = new Album();
        album.setView(1000);
        album.setDescription("Summer 2026 - HSF302");
        album.setId(1);

        em.getTransaction().begin();
        em.persist(album);
        em.getTransaction().commit();*/

    }
}
