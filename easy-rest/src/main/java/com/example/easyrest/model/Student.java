package com.example.easyrest.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name = "student")
@EntityListeners(AuditingEntityListener.class)
public class Student {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	
	 
	 
	@NotNull
	private String name;
	
	@NotNull
	private String email;
	
	
	@NotNull
	private long userid;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
