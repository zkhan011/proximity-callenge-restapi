package com.example.easyrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easyrest.model.Note;

/**
 * Created by 
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
