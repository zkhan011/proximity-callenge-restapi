package com.example.easyrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easyrest.model.Instructor;
import com.example.easyrest.model.Student;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}

