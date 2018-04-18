package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Cart;
import com.niit.model.Category;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addToCart(Cart cart) 
	{
		try
		{
		sessionFactory.getCurrentSession().save(cart);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
		
	}

	@Transactional
	@Override
	public boolean updateItemFromCart(Cart cart)
	{
		try
		{
		sessionFactory.getCurrentSession().update(cart);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
	}

	@Transactional
	@Override
	public boolean deleteItemFromCart(Cart cart) 
	{
		try
		{
		sessionFactory.getCurrentSession().delete(cart);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
	}
	
	@Override
	public Cart getCartItem(int cartItemId) 
	{
		Session session=sessionFactory.openSession();
		Cart cart=(Cart)session.get(Cart.class,cartItemId);
		session.close();
		return cart;
	}

	
	@Override
	public List<Cart> listCartItems(String username) 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Cart where status=:paidstatus and username=:username1");
		query.setParameter("paidstatus","NP");
		query.setParameter("username1",username);
		List<Cart> listCartItems=query.list();
		session.close();
		return null;
	}

}
