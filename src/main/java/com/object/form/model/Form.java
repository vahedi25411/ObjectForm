/*
 * This Form java class shall contain all the information the form has after converting it
 * 
 * id: a unique identifier
 * title: the title of the form
 * description: a brief description of what the form is
 * createdDate: a date object that tells us the creation date of the form
 * modifiedDate: a date object that tells us the last date in which the form was modified
 * submitDate: a date object that tells us the date that this form has to be submitted by
 * ownedBy: a member object that signifies who the owner is
 * roles: a role object
 * pages: a list of page objects that contains the actual form
 */
package com.object.form.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="form")
public class Form implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name="FORM_ID")
	private Integer id;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="CREATED_DATE")
	private Date createdDate;
	
	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;
	
	@Column(name="SUBMISSION_DATE")
	private Date submitDate;
	
	@Column(name="MEMBER")
	private Member ownedBy;
	
	@Column(name="ROLE")
	private Role roles;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "form")
	@Column(name="PAGES")	
	private List<Page> pages;
	
	
	public List<Page> getPages() {
		return pages;
	}
	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	public Member getOwnedBy() {
		return ownedBy;
	}
	public void setOwnedBy(Member ownedBy) {
		this.ownedBy = ownedBy;
	}
	public Role getRoles() {
		return roles;
	}
	public void setRoles(Role roles) {
		this.roles = roles;
	}
}
