package com.example.curd.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class ITTeacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ID;
	
	private String firstName;
	
	private String lastName;
	
	private String position;
	
	private String branch;
	
	private String speciality;
	
	
	public ITTeacher() {
		super();
	}
	
	public ITTeacher(String firstName, String lastName, String position, String branch, String speciality) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.branch = branch;
		this.speciality = speciality;
	}
	

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
