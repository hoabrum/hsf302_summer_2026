package com.springboot.repository;

import com.springboot.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
