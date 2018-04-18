package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.Category;

public class CategoryDAOImpl implements CategoryDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean addCategory(Category category) 
	{
		try
		{
		sessionFactory.getCurrentSession().save(category);
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
	public boolean updateCategory(Category category)
	{
		try
		{
		sessionFactory.getCurrentSession().update(category);
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
	public boolean deleteCategory(Category category) 
	{
		try
		{
		sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
	}

	@Override
	public Category getCategory(int categoryId) 
	{
		Session session=sessionFactory.openSession();
		Category category=(Category)session.get(Category.class,categoryId);
		session.close();
		return category;
	}

	@Override
	public List<Category> listCategories() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Category");
		List<Category> listCategories=query.list();
		session.close();
		return listCategories;
	}
	
}