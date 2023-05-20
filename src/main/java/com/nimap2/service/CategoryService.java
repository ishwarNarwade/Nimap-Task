package com.nimap2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nimap2.dao.CategoryDAO;
import com.nimap2.model.Category;


@Service
public class CategoryService {

	@Autowired
	CategoryDAO dao;
	
	//====1=====
	public List<Category> getAllCategory() 
	{
		return dao.getAllCategory();
	}
	
	//====2=====
	public Category saveCategory(Category c)
	{
		return dao.saveCategory(c);
	}
	
	//====3=====
	public Category getCategory(int cid)
	{
		Category c=dao.getCategory(cid);
		return c;
	}
	
	//====4======
	public Category updateCategory(Category c)
	{
		return dao.updateCategory(c);
	}
	
	//====5======
	public Category deleteCategory(int cid)
	{
		return dao.deleteCategory(cid);
	}
	
	
}
