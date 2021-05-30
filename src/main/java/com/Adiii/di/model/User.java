package com.Adiii.di.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
@Table(name = "user",schema = "students")
@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;
  
  @Column(name="First_Name")
  String First_Name;
 
  String Email;

  @Column(name="Phone_No")
  String Phone_No;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirst_Name() {
	return First_Name;
}

public void setFirst_Name(String first_Name) {
	First_Name = first_Name;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getPhone_No() {
	return Phone_No;
}

public void setPhone_No(String phone_No) {
	Phone_No = phone_No;
}
   User(){
	   
   }
}
