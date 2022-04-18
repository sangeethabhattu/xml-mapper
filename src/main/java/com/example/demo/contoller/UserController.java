package com.example.demo.contoller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Mobile;

import com.example.demo.service.UserService;
@RestController
public class UserController {
	
	
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET,value ="/mobile")
    public List<Mobile> getPosts()
	{
    	return service.findAll();
    }
	
	@RequestMapping(method = RequestMethod.GET,value ="/price")
    public List<Mobile> getprice()
	{
    	return service.getByprice();
    }
	
	

	
           
	@RequestMapping("/mobilebrand/{brand}")
	
	  public List<Mobile> trigger3(@PathVariable("brand") String brand1) 
	{
	        
           
          return service.getBybrand(brand1);
            
            
        }
           
	
	 
	
	@RequestMapping("/mobile/{id}")
	public Mobile getPost(@PathVariable int id) 
	{
		return service.getById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/mobile")
	
	@ResponseStatus(HttpStatus.CREATED)
	public void addPost( @RequestBody  Mobile listElement)
	{
		
		service.insert(listElement);
		
	}
	
	
  
   
   
	@GetMapping( value = "/{mobileId}/")
	  public List<Mobile> trigger(@PathVariable("mobileId") String mobiid) 
	{
   
         
             
              return service.comparebyid(mobiid);
              
              
          
              
	     
	}
	
	
	@DeleteMapping( value = "/{ID}/")
	  public List<Mobile> trigger1(@PathVariable String ID) 
	{
	        List<String> ids = Arrays.asList(ID.split(","));
	        List<Mobile> myList = new ArrayList<Mobile>();   
	        for(String id:ids)
         {
             int getid = Integer.parseInt(id);
           deletePost(getid);
              
              
          }
			return myList;
              
	      
	}
    	
  	          	    
@PutMapping(value ="/{mobileid}/")
	public void updatePost(@PathVariable("mobileid") String mobileid1)
	{
		
		 
		 service.update(mobileid1);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/mobile/{id}")
	
	public void deletePost(@PathVariable int id)
	{
		service.delete(id);
		
	}
	

	
	
}






