package com.example.easyrest.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.NonNull;
@Entity
@Table(name = "video")
@EntityListeners(AuditingEntityListener.class)
public class Video {
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}


	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @return the totalviews
	 */
	public Long getTotalviews() {
		return totalviews;
	}


	/**
	 * @param totalviews the totalviews to set
	 */
	public void setTotalviews(Long totalviews) {
		this.totalviews = totalviews;
	}


	


	/**
	 * @return the videocourseid
	 */
	public Long getVideocourseid() {
		return videocourseid;
	}


	/**
	 * @param videocourseid the videocourseid to set
	 */
	public void setVideocourseid(Long videocourseid) {
		this.videocourseid = videocourseid;
	}



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NonNull
	private String title;
	@NonNull
	private String url;
	@NonNull
	private Long totalviews;
	
	@NonNull
	private Long videosubjectid;
	
	
	@NonNull
    private Long videocourseid;

}
