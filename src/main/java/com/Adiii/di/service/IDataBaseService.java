package com.Adiii.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.di.dao.User_Dao;

@Service
public class IDataBaseService implements DatabaseService{
 @Autowired
 User_Dao userdao;
	@Override
	public void register(String body) {

}
}
