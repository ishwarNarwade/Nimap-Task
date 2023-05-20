package com.nimap2.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nimap2.dao.ProductDAO;
import com.nimap2.model.Product;
import com.nimap2.model.ProductInfo;

@Service
public class ProductService {

       @Autowired
       ProductDAO dao;
       
    	
	//===1=====
	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}
	
	//===2=====
	public Product saveProduct(Product p) {
		
		return dao.saveProduct(p);
	}

	//====3=====
	public Product getProduct(int pid) {
		return dao.getProduct(pid);
		
	}
	
	//====4=======
	public Product updateProduct(Product p)
	{
		return  dao.updateProduct(p);
	}
		
	//====4=======
	public Product deleteProduct(int pid)
	{
		return dao.deleteProduct(pid);
	}
}
