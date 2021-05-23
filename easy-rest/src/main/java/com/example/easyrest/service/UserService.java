package com.example.easyrest.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.example.easyrest.model.User;
import com.example.easyrest.model.UserDTO;

public interface UserService {
	
	User save(UserDTO user);
    List<User> findAll();
 
    User findOne(String username);

    User findById(Long id);
	UserDetails loadUserByUsername(String username);
	void delete(int id);
	
	

}
