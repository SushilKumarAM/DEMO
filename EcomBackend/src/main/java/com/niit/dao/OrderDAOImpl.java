package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.OrderDetail;

@Repository("orderDAO")
public class OrderDAOImpl implements OrderDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean paymentProcess(OrderDetail orderDetail)
	{
		try
		{
		sessionFactory.getCurrentSession().save(orderDetail);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
			return false;	
		}
	}

}
