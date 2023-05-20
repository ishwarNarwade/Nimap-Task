package com.nimap2.controller;


import java.util.List;

import javax.websocket.server.PathParam;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nimap2.model.Category;
import com.nimap2.model.ObjectNotFoundException;
import com.nimap2.service.CategoryService;

@RestController
@RequestMapping("api")
public class CategoryController {

	@Autowired
	CategoryService service;
	
	//=====1=======
	@GetMapping("getAllCategories")
	public List<Category> getAllCategory()
	{
		return service.getAllCategory();
		
	}
	
	//=====2=======
	@PostMapping("saveCategories")
	public Category saveCategory(@RequestBody Category c)
	{
		return service.saveCategory(c);
	}

	//=====3========
	@GetMapping("getCategories/{cid}")
	public Category getCategory(@PathVariable int cid)
	{
		return service.getCategory(cid);
	}
	
	//=====4========
	@PutMapping("updateCategories")
	public Category updateCategory(@RequestBody Category c)
	{
		return service.updateCategory(c);
	}
	
	//====5=========
	@DeleteMapping("deleteCategories/{cid}")
	public Category deleteCategory(@PathVariable int cid)
	{
		return service.deleteCategory(cid);
	}
}
