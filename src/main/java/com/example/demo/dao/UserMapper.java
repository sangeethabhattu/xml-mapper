package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Mobile;

@Mapper
public interface UserMapper {
	
	public List<Mobile> findAll();
	
	public void insert(Mobile user);
	
	public void delete (int id);
	
	public void update(String mobileid1);
	
	public Mobile getById(int id);
	
	public List<Mobile> getBybrand(String brand1);
	
	public List<Mobile> getByprice();
	
	public List<Mobile> comparebyid(String str);
	
	public List<Mobile> deleteAll();
	
}

