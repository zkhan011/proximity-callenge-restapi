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
@Table(name = "webinar")
@EntityListeners(AuditingEntityListener.class)
public class Webinar {
	
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
	private Long subjectid;
	
	
	@NonNull
    private Long mycourseid;
	/**
	 * @return the subjectid
	 */
	public Long getSubjectid() {
		return subjectid;
	}
	/**
	 * @param subjectid the subjectid to set
	 */
	public void setSubjectid(Long subjectid) {
		this.subjectid = subjectid;
	}
	/**
	 * @return the mycourseid
	 */
	public Long getMycourseid() {
		return mycourseid;
	}
	/**
	 * @param mycourseid the mycourseid to set
	 */
	public void setMycourseid(Long mycourseid) {
		this.mycourseid = mycourseid;
	}
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
	

}
