package com.example.easyrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easyrest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}

