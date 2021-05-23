package com.example.easyrest.service;

import com.example.easyrest.model.Course;
import com.example.easyrest.model.CourseDTO;
import com.example.easyrest.model.SubjectDTO;


public interface CourseService {
	Course save(CourseDTO course);
	public void updateCourse(CourseDTO course);
	
	void addSubject(SubjectDTO course);
}
