package com.example.easyrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.easyrest.model.User;
import com.example.easyrest.model.UserDTO;
import com.example.easyrest.service.UserService;



@RestController
public class UserController {
	@Autowired
    private UserService userService;

    @Secured({"ROLE_ADMIN"})
   // @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.findAll();
    }
    
    // method to delete user
    @Secured({"ROLE_ADMIN"})
    // @PreAuthorize("hasRole('ROLE_ADMIN')")
     @RequestMapping(value="/users/delete/{id}", method = RequestMethod.POST)
     public void deleteOne(@PathVariable(value = "id") Integer id){
         userService.delete(5);
     }

    
    
    

    @Secured({"ROLE_USER","ROLE_ADMIN"})
   // @PreAuthorize("is")
    ////@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }


    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public User saveUser(@RequestBody UserDTO user){
        return userService.save(user);
    }

}