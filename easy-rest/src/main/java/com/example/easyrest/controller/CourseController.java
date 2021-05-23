package com.example.easyrest.controller;


import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.easyrest.model.Course;
import com.example.easyrest.model.CourseDTO;
import com.example.easyrest.model.Note;
import com.example.easyrest.model.Student;
import com.example.easyrest.model.SubjectDTO;
import com.example.easyrest.model.UserDTO;
import com.example.easyrest.repository.CourseRepository;
import com.example.easyrest.repository.StudentRepository;
import com.example.easyrest.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
  @Autowired
  CourseRepository courserepository;
  
  @Autowired
  CourseService courseDetailsService;
  
  
  
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public ResponseEntity<?> createCourse(@RequestBody CourseDTO course) throws Exception {
		return ResponseEntity.ok(courseDetailsService.save(course));
	}
  
  @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
  public void deleteCourse(@PathVariable(value = "id") Long courseId) throws Exception {
		courserepository.deleteById(courseId);
	}
  
  @RequestMapping(value = "/update", method = RequestMethod.PUT)
  public ResponseEntity<String> updateCourse(@RequestBody CourseDTO course) {  
	    try {
	      courseDetailsService.updateCourse(course);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(NoSuchElementException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
  
  @RequestMapping(value = "/addsubject", method = RequestMethod.POST)
  public ResponseEntity<String> addSubject(@RequestBody SubjectDTO course) {  
	    try {
	      courseDetailsService.addSubject(course);
	      return new ResponseEntity<String>(HttpStatus.OK);
	    }catch(NoSuchElementException ex){
	      // log the error message
	      System.out.println(ex.getMessage());
	      return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	    }
	  }
  
  
  
  
  
  
  @GetMapping("/getall")
  public List<Course> getAllCourses(){
	  
	  
	  return courserepository.findAll();
	  
  }

}
