package com.niit.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CartDAO;
import com.niit.model.Cart;

public class CartDAOTest {

	static CartDAO cartDAO;
	@BeforeClass
	public static void preExecution()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		cartDAO=(CartDAO)context.getBean("cartDAO");
	}

	@Test
	public void addTocartTest()
	{
		Cart cart=new Cart();
		cart.setProductId(1);
		cart.setProductName("IPhoneX");
		cart.setQuantity(4);
		cart.setStatus("NP");
		cart.setPrice(89999);
		cart.setUsername("Sushil");
		
		assertTrue("Problem in Adding Cart",cartDAO.addToCart(cart));
	}
	
	
	@Ignore
	@Test
	public void updateItemFromCartTest()
	{
		Cart cart=cartDAO.getCartItem(1);
		cart.setProductName("Samsung-Galaxy");
		assertTrue("Problem in Updating",cartDAO.updateItemFromCart(cart));
	}
	

	@Ignore
	@Test
	public void deleteItemFromCartTest()
	{
		Cart cart=cartDAO.getCartItem(1);
		cart.setProductName("Samsung-Galaxy");
		assertTrue("Problem in Deleting",cartDAO.deleteItemFromCart(cart));
	}
	
	@Ignore
	@Test
	public void listCartItemsTest(String username)
	{
		List<Cart> listCartItems=cartDAO.listCartItems(username);
		
		assertNotNull("Problem in Retriving:"+listCartItems);
	}

	
}
