package com.example.demo.controller;

import com.example.demo.entities.Student;
import com.example.demo.repo.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    private final StudentRepository repository;


    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/students")
    List<Student> findAll() {
        return repository.findAll();
    }

}