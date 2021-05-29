package com.example.di.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Adiii.di.model.User;
@Repository
public interface User_Dao extends JpaRepository<User,Integer>{
	@Query(name="INSERT INTO USER(First_Name,Email,Phone_No)VALUES(user.First_Name,user.Email,user.Phone_No)",nativeQuery=true)
	void registerUser(User user);
	

}
