package com.nimap2.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nimap2.model.Category;
import com.nimap2.model.Product;
import com.nimap2.model.ProductInfo;


@Repository
public class ProductDAO {

	@Autowired
	SessionFactory factory;
	
	
	
	

	//===1=====
	public List<Product> getAllProduct() {

		Session session=factory.openSession();
		Criteria c=session.createCriteria(Product.class);
		List<Product>lp=c.list();
		
		return lp;
	}

	//====2=====
	public Product saveProduct(Product p) {
		Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		s.save(p);
		tr.commit();
		return p;
	}

	//====3======
	public Product getProduct(int pid) {
		Session s=factory.openSession();
		Product p=s.get(Product.class,pid);
		return p;
	}
	
	
	//====4=======
	public Product updateProduct(Product p)
	{
		Session s=factory.openSession();
		Transaction tr=s.beginTransaction();
		
		s.update(p);
	
		tr.commit();
		
		return p;
	}


	
	//===5========
	public Product deleteProduct(int pid) {
		
		Session s=factory.openSession();
		Product ps=s.get(Product.class,pid);
		Transaction tr=s.beginTransaction();
		
		
		s.delete(ps);
		tr.commit();
		return ps;
	}

}
