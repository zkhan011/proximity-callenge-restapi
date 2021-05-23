package com.example.easyrest.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name = "instructor")
@EntityListeners(AuditingEntityListener.class)
public class Instructor {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	
	 
	 
	@NotNull
	private String name;
	
	@NotNull
	private String email;
	
	
	@NotNull
    private long instructorid;
	
	

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	

	/**
	 * @return the instructorid
	 */
	public long getInstructorid() {
		return instructorid;
	}

	/**
	 * @param instructorid the instructorid to set
	 */
	public void setInstructorid(long instructorid) {
		this.instructorid = instructorid;
	}

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
