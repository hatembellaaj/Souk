package com.csf.souk.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.csf.souk.model.Fruit;
import com.csf.souk.service.FruitService;



//mark class as Controller  
@RestController  
@CrossOrigin(origins = "http://localhost:4200")
public class FruitController  
{  
	//autowire the BooksService class  
	@Autowired  
	FruitService fS;  
	//creating a get mapping that retrieves all the fruits detail from the database   
	@GetMapping("/Fruit")  
	private List<Fruit> getAllFruit()   
	{  
		return fS.getAllFruit();  
	}  
	//creating a get mapping that retrieves the detail of a specific fruit  
	@GetMapping("/Fruit/{id}")  
	private Fruit getFruitById(@PathVariable("id") int id)   
	{  
		return fS.getFruitById(id);  
	}  
	//creating a delete mapping that deletes a specified fruit  
	@DeleteMapping("/Fruit/{id}")  
	private void deleteFruit(@PathVariable("id") int id)   
	{  
		System.out.println("Suppression Fruit ID : " + id);
		fS.delete(id);  
	}  
	//creating post mapping that post the fruit detail in the database  
	@PostMapping("/Fruit")  
	private int saveFruit(@RequestBody Fruit f)   
	{  
		fS.saveOrUpdate(f);  
		return f.getId();  
	}  
	//creating put mapping that updates the fruit detail   
	@PutMapping("/Fruit")  
	private Fruit update(@RequestBody Fruit f)   
	{  
		fS.saveOrUpdate(f);  
		return f;  
	}  
} 

