package com.nimap2.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.nimap2.model.Product;
import com.nimap2.model.ProductInfo;
import com.nimap2.service.ProductService;

@RequestMapping("api")
@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	//====1======
	@GetMapping("getAllProducts")
	public List<Product> getAllProduct()
	{
		return service.getAllProduct();
	}
	
	//====2=======
	@PostMapping("saveProduct")
    public Product saveProduct(@RequestBody Product p)
	{
		return service.saveProduct(p);
	}
	
	//====3=======
	@GetMapping("getProduct/{pid}")
	public Product getProduct(@PathVariable int pid)
	{
		return service.getProduct(pid);
	}
	
	//====4=======
	@PutMapping("updateProduct")
	public Product updateProduct(@RequestBody Product p)
	{
		return service.updateProduct(p);
	}
	
	//====5=======
	@DeleteMapping("deleteProduct/{pid}")
	public Product deleteProduct(@PathVariable int pid)
	{
		return service.deleteProduct(pid);
	}
}
