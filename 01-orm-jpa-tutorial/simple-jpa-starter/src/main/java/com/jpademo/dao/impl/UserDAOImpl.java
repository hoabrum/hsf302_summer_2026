package com.jpademo.dao.impl;

import com.jpademo.dao.UserDAO;
import com.jpademo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class UserDAOImpl implements UserDAO {

    private EntityManager em;

    public UserDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<User> getUsers() {
        String sql = "FROM User";//hibernate query
        em.getTransaction().begin();
        Query query = em.createQuery(sql);
        return query.getResultList();
    }
}
