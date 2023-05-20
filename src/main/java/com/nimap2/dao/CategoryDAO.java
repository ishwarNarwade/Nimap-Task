package com.nimap2.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nimap2.model.Category;


@Repository
public class CategoryDAO {
	
	@Autowired
	SessionFactory factory;
	
	//====1=====
	public List<Category> getAllCategory() 
	{
		Session s=factory.openSession();
		Criteria c=s.createCriteria(Category.class);
		List<Category>lc=c.list();
		return lc;
	}
	
	//=====2=====
	public Category saveCategory(Category c)
	{
		Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		s.save(c);
		tr.commit();
		return c;
		
	}
	
	//=====3======
	public Category getCategory(int cid)
	{
		Session s=factory.openSession();
		Category c=s.get(Category.class,cid);
		return c;
	}
	

	//=====4=======
	public Category updateCategory(Category c)
	{
		Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		s.update(c);
		tr.commit();
		return c;
	}
	
	
	//=====5========
	public Category deleteCategory(int cid)
	{
		Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		Category c=s.get(Category.class,cid);
		s.delete(c);
		tr.commit();
		return c;
	}

}
