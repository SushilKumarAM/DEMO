package com.niit.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.model.Product;

public class ProductDAOTest {

	static ProductDAO productDAO;
	@BeforeClass
	public static void preExecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	
	/*@Ignore*/
	@Test
	public void addProductTest()
	{
		Product product=new Product();
		product.setProductName("Samsung");
		product.setProductDesc("Samsung Mobile");
		
		assertTrue("Problem in Adding Product",productDAO.addProduct(product));
	}
	
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product product=productDAO.getProduct(1);
		product.setProductName("Samsung-Galaxy");
		assertTrue("Problem in Updating",productDAO.updateProduct(product));
	}
	

	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product product=productDAO.getProduct(2);
		assertTrue("Problem in Deleting",productDAO.updateProduct(product));
	}
	
	@Ignore
	@Test
	public void getProductsTest()
	{
		List<Product> listProducts=productDAO.getProducts();
		
		assertNotNull("Problem in Retriving:"+listProducts);
	}
	
}
