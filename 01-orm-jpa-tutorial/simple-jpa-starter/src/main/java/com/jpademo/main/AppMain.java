package com.jpademo.main;

import com.jpademo.dao.UserDAO;
import com.jpademo.dao.impl.UserDAOImpl;
import com.jpademo.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager em = emf.createEntityManager();
        System.out.println("EntityManager: " + em);

        UserDAO userDAO = new UserDAOImpl(em);
        List<User> users = userDAO.getUsers();
        users.forEach(System.out::println);



        /*User user = new User();
        user.setFullName("Robert Carter");
        user.setGender(Gender.FEMALE);

        Phone phone1 = new Phone();
        phone1.setNumber("123456789");
        phone1.setPhoneType(PhoneType.HOME);
        phone1.setUser(user);

        Phone phone2 = new Phone();
        phone2.setNumber("123456789");
        phone2.setPhoneType(PhoneType.MOBILE);
        phone2.setUser(user);

        Set<Phone> phones = new HashSet<Phone>();
        phones.add(phone1);
        phones.add(phone2);
        user.setPhones(phones);

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

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
