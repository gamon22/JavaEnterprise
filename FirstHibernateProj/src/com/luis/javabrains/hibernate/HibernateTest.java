package com.luis.javabrains.hibernate;

import java.util.Date;

import javax.persistence.Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.javabrains.dto.Address;
import com.luis.javabrains.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		//user.setUserId(1);
		user.setUsername("First User");
//		user.setAddress("first user's address");
//		user.setJoinedDate(new Date());
//		user.setDescription("Description of the user goes here");
		
		
		UserDetails user2=new UserDetails();
		user2.setUsername("second User");
		Address add=new Address();
		add.setCity("Citiname");
		add.setPincode("1222");
		add.setState("California");
		add.setStreet("Street Name");
		
	//	user.setAddress(add);
		
		
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
//		user=null;
//		
//		session=sessionFactory.openSession();
//		session.beginTransaction();
//		user=(UserDetails) session.get(UserDetails.class, 1);
//		System.out.println("User Name retrieved is "+user.getUsername());
		
		
		
		
		
		
	}

}
