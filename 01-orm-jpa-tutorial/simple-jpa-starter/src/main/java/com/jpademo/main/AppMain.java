package com.jpademo.main;

import com.jpademo.entity.Album;
import com.jpademo.entity.Photo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Arrays;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager em = emf.createEntityManager();
        System.out.println("EntityManager: " + em);

        //parent
        /*Album album = new Album();
        album.setView(1000000);
        album.setDescription("FU Summer 2026 - HSF302");
        album.setId(1);

        //children
        Photo photo1 = new Photo(1, "Photo 01", "FU Summer 2026 - HSF302");
        Photo photo2 = new Photo(2, "Photo 02", "FU Summer 2026 - HSF302");
        Photo photo3 = new Photo(3, "Photo 03", "FU Summer 2026 - HSF302");
        photo1.setAlbum(album);
        photo2.setAlbum(album);
        photo3.setAlbum(album);

        List<Photo> photos = Arrays.asList(photo1, photo2, photo3);
        album.setPhotos(photos);

        em.getTransaction().begin();
        em.persist(album);
        em.getTransaction().commit();*/

        //removeAlbum(1, em);
        //Album album = em.find(Album.class, 1);
        //System.out.println("Album: " + album);


    }

    private static void removeAlbum(int id, EntityManager em) {
        em.getTransaction().begin();
        Album album = em.find(Album.class, id);
        em.remove(album);
        em.getTransaction().commit();
    }
}
