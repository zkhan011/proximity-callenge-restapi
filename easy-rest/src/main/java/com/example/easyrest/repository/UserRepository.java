package com.example.easyrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.easyrest.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByUsername(String username);

    User findById(long id);
	

}
