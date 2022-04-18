package com.example.demo.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.UserMapper;
import com.example.demo.model.Mobile;


@Service
public class UserService {
	
	@Autowired
	   private UserMapper userMapper;

	public List<Mobile> findAll()
	{
		
		return userMapper.findAll();
		
		
	}


	

	   
	   public void insert(Mobile user) {
		   
		   
		     userMapper.insert(user);
	   }
	   
	   public void  delete(int id) {
		   
		   
		  userMapper.delete(id);
	   }
	   public void update(String mobileid1) {
		   
		   userMapper.update(mobileid1);
	   }
	   public Mobile getById(int id) {
		   
		  return userMapper.getById(id);
	   }

public  List<Mobile> getBybrand(String brand1)
{
	
return userMapper.getBybrand(brand1);
}

public  List<Mobile> getByprice()
{
	
return userMapper.getByprice();
}

public List<Mobile> comparebyid(String str)
{

return userMapper.comparebyid(str);
}


public List<Mobile> deleteAll()
{
	
	return userMapper.deleteAll();
}






}
