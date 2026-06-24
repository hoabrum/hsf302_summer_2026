package com.springboot.controller;

import com.springboot.dto.CustomerDTO;
import com.springboot.entity.Customer;
import com.springboot.entity.Student;
import com.springboot.repository.CustomerRepository;
import com.springboot.repository.StudentRepository;
import com.springboot.service.StudentService;
import com.springboot.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HomeController {

    private StudentService studentService;

    @Autowired
    private CustomerRepository customerRepository;


    @Autowired
    public HomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/home")
    public @ResponseBody String home() {
        System.out.println("Home Page");
        Student student = new Student();
        student.setFullName("Tom Cruise");
        student.setAge(18);
        studentService.saveStudent(student);
        return "Welcome to Spring Boot: " + student;
    }

    @GetMapping("/test")
    public @ResponseBody List<Customer> getStudents() {
        String firstName = "First Name 1";
        String lastName = "Last Name 1";
        return customerRepository.search(firstName, lastName);
    }

    @GetMapping("/update")
    public @ResponseBody String testUpdateStudent() {
        //Customer customer = customerRepository.findById(1L).get();
        //customer.setState("Thach That");
        //customerRepository.save(customer);
        List<CustomerDTO> customers = customerRepository.fetchData();
        System.out.println(customers);
        return "Update student successfully";
    }
}
