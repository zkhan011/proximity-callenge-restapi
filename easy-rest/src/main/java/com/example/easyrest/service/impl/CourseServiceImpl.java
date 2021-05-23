package com.example.easyrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.easyrest.model.Course;
import com.example.easyrest.model.CourseDTO;
import com.example.easyrest.model.Subject;
import com.example.easyrest.model.SubjectDTO;
import com.example.easyrest.model.User;
import com.example.easyrest.repository.CourseRepository;
import com.example.easyrest.repository.SubjectRepository;
import com.example.easyrest.service.CourseService;
@Service(value = "courseService")
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courseDao;
	
	@Autowired
	SubjectRepository subjectDao;

	@Override
	public Course save(CourseDTO course) {
		Course newCourse = new Course();
	    newCourse.setCoursename(course.getName());
	    newCourse.setDescription(course.getDescription());
	    newCourse.setInstructor(course.getInstructor());
	    return courseDao.save(newCourse);
	}
	
	
	public void updateCourse(CourseDTO course) {
	    // check if the user with the passed id exists or not
	    Course courseDB = courseDao.findById(course.getId()).orElseThrow();
	    // If user exists then updated
	    
	    courseDB.setCoursename(course.getName());
	    courseDB.setDescription(course.getDescription());
	    courseDB.setInstructor(course.getInstructor());
	    courseDao.save(courseDB);
	  }



	@Override
	public void addSubject(SubjectDTO course) {
		// TODO Auto-generated method stub
		
		Subject newSubject = new Subject();
	    newSubject.setCourseid(course.getCourseid());
	    newSubject.setName(course.getName());
	    subjectDao.save(newSubject);
		
		
		
	}

}
