package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.model.Supplier;

public class SupplierDAOTest {
	
	static SupplierDAO supplierDAO;
	@BeforeClass
	public static void preExecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	}
	
	@Ignore
	@Test
	public void addSupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierName("Samsung");
		supplier.setSupplierAddress("Samsung Mobile");
		
		assertTrue("Problem in Adding Supplier",supplierDAO.addSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void updateSupplierTest()
	{
		Supplier supplier=supplierDAO.getSupplier(1);
		supplier.setSupplierName("Samsung-Galaxy");
		assertTrue("Problem in Updating",supplierDAO.updateSupplier(supplier));
	}
	

	@Ignore
	@Test
	public void deleteSupplierTest()
	{
		Supplier supplier=supplierDAO.getSupplier(2);
		assertTrue("Problem in Deleting",supplierDAO.updateSupplier(supplier));
	}
	
	@Ignore
	@Test
	public void listSuppliersTest()
	{
		List<Supplier> listSuppliers=supplierDAO.listSuppliers();
		
		assertNotNull("Problem in Retriving:"+listSuppliers);
	}

}
