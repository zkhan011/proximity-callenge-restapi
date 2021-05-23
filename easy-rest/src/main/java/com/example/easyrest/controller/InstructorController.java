package com.example.easyrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easyrest.model.Instructor;
import com.example.easyrest.model.Student;
import com.example.easyrest.repository.InstructorRepository;
import com.example.easyrest.repository.StudentRepository;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
	
  @Autowired
  InstructorRepository instructorrepository;
  
  @GetMapping("/getall")
  public List<Instructor> getAllInstructors(){
	  
	  
	  return instructorrepository.findAll();
	  
  }

}
