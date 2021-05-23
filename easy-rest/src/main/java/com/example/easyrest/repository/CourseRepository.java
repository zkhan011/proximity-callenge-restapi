package com.example.easyrest.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.example.easyrest.model.Course;
import com.example.easyrest.model.Student;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, Long> , JpaSpecificationExecutor<Course>{

}

