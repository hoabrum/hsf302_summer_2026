package com.springcore.dao.impl;

import com.springcore.dao.StudentDAO;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public void search(String field) {
        System.out.println("Searching for " + field);
    }

}
