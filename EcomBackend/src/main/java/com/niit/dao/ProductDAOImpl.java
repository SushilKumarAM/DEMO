package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.Product;

public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addProduct(Product product) 
	{
		try
		{
		//sessionFactory.getCurrentSession().saveOrUpdate(product);
		sessionFactory.getCurrentSession().save(product);
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
	public boolean updateProduct(Product product)
	{
		try
		{
		sessionFactory.getCurrentSession().update(product);
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
	public boolean deleteProduct(Product product) 
	{
		try
		{
		sessionFactory.getCurrentSession().delete(product);
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
	public Product getProduct(int productId) 
	{
		Session session=sessionFactory.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.close();
		return product;
	}

	@Transactional
	@Override
	public List<Product> getProducts() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> listProducts=query.list();
		session.close();
		return listProducts;
	}


}
