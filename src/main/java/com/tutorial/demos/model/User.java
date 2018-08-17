package com.tutorial.demos.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Access(AccessType.FIELD)
public class User  extends ParentEntity{

	
	private static final long serialVersionUID = 159613586650476168L;

   @Column(name="first_name",nullable=false,length=255)
	private String  firstname;
   
   @Column(name="second_name",nullable=true,length=255)
	private String  secondname;
   
   @Column(name="first_surname",nullable=false,length=255)
	private String  firstsurname;
   
   @Column(name="second_surname",nullable=true,length=255)
	private String  secondsurname;
   
   @Column(name="phone",nullable=false,length=150)
	private String  phone;
   
   @Column(name="address",nullable=false,length=150)
	private String  address;
	
	
	
	public String getSecondname() {
		return secondname;
	}
	public String getFirstsurname() {
		return firstsurname;
	}
	public String getSecondsurname() {
		return secondsurname;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public void setFirstsurname(String firstsurname) {
		this.firstsurname = firstsurname;
	}
	public void setSecondsurname(String secondsurname) {
		this.secondsurname = secondsurname;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
}
