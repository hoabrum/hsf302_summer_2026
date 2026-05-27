package com.springcore.service.impl;

import com.springcore.dao.StudentDAO;
import com.springcore.service.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void reportInfo(String field) {
        studentDAO.search(field);
    }
}
