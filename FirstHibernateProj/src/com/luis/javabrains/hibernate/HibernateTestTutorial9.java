package com.luis.javabrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.javabrains.dto.Address;
import com.luis.javabrains.dto.UserDetails;

public class HibernateTestTutorial9 {
	
	public static void main(String[] args) {
		UserDetails user=new UserDetails();

		user.setUsername("First User");

		Address addr=new Address();
		addr.setStreet("Street Name");
		addr.setCity("City Name");
		
		user.setHomeAddress(addr);
		
		Address addr2=new Address();
		
		addr2.setStreet("Second Street Name");
		addr2.setCity("Second City Name");
		
		user.setOfficeAddress(addr2);
		
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
	//	session.save(user2);
		session.getTransaction().commit();
		session.close();
	
		
		
		
		
	}

}
