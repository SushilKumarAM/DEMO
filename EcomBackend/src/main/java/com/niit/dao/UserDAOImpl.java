package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.model.User;

public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public boolean registerUser(User user) 
	{
		try
		{
		sessionFactory.getCurrentSession().save(user);
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
	public boolean updateUser(User user)
	{
		try
		{
		sessionFactory.getCurrentSession().update(user);
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
	public User getUser(int userId) 
	{
		Session session=sessionFactory.openSession();
		User userName=(User)session.get(User.class,userId);
		session.close();
		return userName;
	}
	
	
	@Transactional
	@Override
	public boolean approveUser(User user) 
	{
		try
		{
		sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}

}
	


}
