package com.example.easyrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easyrest.model.Student;
import com.example.easyrest.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
	
  @Autowired
  StudentRepository studentrepository;
  
  @GetMapping("/getall")
  public List<Student> getAllStudents(){
	  
	  
	  return studentrepository.findAll();
	  
  }

}
