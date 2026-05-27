package com.springcore;

public class StudentDAOImpl implements StudentDAO{

    @Override
    public void search(String field) {
        System.out.println("Searching for " + field);
    }
}
