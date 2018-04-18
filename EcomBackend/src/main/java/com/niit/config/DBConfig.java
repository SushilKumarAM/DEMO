package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.dao.CartDAO;
import com.niit.dao.CartDAOImpl;
import com.niit.dao.CategoryDAO;
import com.niit.dao.CategoryDAOImpl;
import com.niit.dao.OrderDAO;
import com.niit.dao.OrderDAOImpl;
import com.niit.dao.ProductDAO;
import com.niit.dao.ProductDAOImpl;
import com.niit.dao.SupplierDAO;
import com.niit.dao.SupplierDAOImpl;
import com.niit.dao.UserDAO;
import com.niit.dao.UserDAOImpl;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.OrderDetail;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.model.User;

@Configuration
@EnableTransactionManagement
public class DBConfig 
{
	
	@Bean(name="dataSource")
	public DataSource getH2DataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/Ecomproject1");
		dataSource.setUsername("sushil");
		dataSource.setPassword("sushil");
		
		System.out.println("---Data Source Object created-----");
		
		return dataSource;
	}
	
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProp=new Properties();
		
		hibernateProp.put("hibernate.hbm2ddl.auto", "update");
		hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
		
		LocalSessionFactoryBuilder factory=new LocalSessionFactoryBuilder(getH2DataSource());
		factory.addProperties(hibernateProp);
		
		factory.addAnnotatedClass(Category.class);
		factory.addAnnotatedClass(Supplier.class);
		factory.addAnnotatedClass(Product.class);
		factory.addAnnotatedClass(User.class);
		factory.addAnnotatedClass(Cart.class);
		factory.addAnnotatedClass(OrderDetail.class);
		
		SessionFactory sessionFactory=factory.buildSessionFactory();
		System.out.println("----SessionFactory Object Created------");	
		return sessionFactory;
		
	}
	
	@Bean(name="categoryDAO")
	public CategoryDAO getCategoryDAO()
	{
		System.out.println("---Category Bean Created---");
		return new CategoryDAOImpl();
	}
	@Bean(name="supplierDAO")
	public SupplierDAO getSupplierDAO()
	{
		System.out.println("---Supplier Bean Created---");
		return new SupplierDAOImpl();
	}
	@Bean(name="productDAO")
	public ProductDAO getProductDAO()
	{
		System.out.println("---Product Bean Created---");
		return new ProductDAOImpl();
	}
	@Bean(name="userDAO")
	public UserDAO getUserDAO()
	{
		System.out.println("---User Bean Created---");
		return new UserDAOImpl();
	}
	@Bean(name="cartDAO")
	public CartDAO getCartDAO()
	{
		System.out.println("---Cart Bean Created---");
		return new CartDAOImpl();
	}
	@Bean(name="orderDAO")
	public OrderDAO getOrderDAO()
	{
		System.out.println("---Order Bean Created---");
		return new OrderDAOImpl();
	}
	
	@Bean(name="txManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("---Hibernate Transaction Bean Created---");
		return new HibernateTransactionManager(sessionFactory);
	}
}