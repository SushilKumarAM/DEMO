package com.niit.dao;

import com.niit.model.OrderDetail;

public interface OrderDAO 
{
	public boolean paymentProcess(OrderDetail orderDetail);

}
