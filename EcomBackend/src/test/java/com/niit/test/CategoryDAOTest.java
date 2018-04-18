package com.niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.model.Category;

public class CategoryDAOTest {
	
	static CategoryDAO categoryDAO;
	@BeforeClass
	public static void preExecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Ignore
	@Test
	public void addCategoryTest()
	{
		Category category=new Category();
		category.setCategoryName("Samsung");
		category.setCategoryDesc("Samsung Mobile");
		
		assertTrue("Problem in Adding Category",categoryDAO.addCategory(category));
	}
	
	@Ignore
	@Test
	public void updateCategoryTest()
	{
		Category category=categoryDAO.getCategory(1);
		category.setCategoryName("Samsung-Galaxy");
		assertTrue("Problem in Updating",categoryDAO.updateCategory(category));
	}
	

	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category=categoryDAO.getCategory(2);
		assertTrue("Problem in Deleting",categoryDAO.deleteCategory(category));
	}
	
	@Test
	public void listCategoriesTest()
	{
		List<Category> listCategories=categoryDAO.listCategories();
		
		assertNotNull("Problem in Retriving:"+listCategories);
	}

}
