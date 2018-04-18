package com.niit.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.model.User;

public class UserDAOTest {
	
	static UserDAO userDAO;
	@BeforeClass
	public static void preExecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	

	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setUsername("Sushil");
		user.setAddress("Coimbatore");
		user.setEmailid("fjfdnfn@gmail.com");
		user.setPassword("cbe");
		user.setEnabled(true);
		user.setRole("Role_Enabled");
		
		assertTrue("Problem in Adding User",userDAO.registerUser(user));
	}
	
	@Ignore
	@Test
	public void updateUserTest()
	{
		User user=userDAO.getUser(4);
		user.setUsername("Kumar");
		user.setAddress("Coimbatore");
		user.setEmailid("fjfdnfn@gmail.com");
		user.setPassword("cbe");
		user.setEnabled(true);
		user.setRole("Role_Enabled");
		assertTrue("Problem in Updating",userDAO.updateUser(user));
	}
	

	@Ignore
	@Test
	public void deleteUserTest()
	{
		User user=userDAO.getUser(2);
		//User user=userDAO.getUser("username");
		assertTrue("Problem in Deleting",userDAO.updateUser(user));
	}
	
	/*
	@Test
	public void listUsersTest()
	{
		List<User> listUsers=userDAO.listUsers();
		
		assertNotNull("Problem in Retriving:"+listUsers);
	}
*/

}
