package com.luis.javabrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luis.javabrains.dto.Address;
import com.luis.javabrains.dto.UserDetailsv10;

public class HibernateTest10 {
			
	public static void main(String[] args) {
			UserDetailsv10 user=new UserDetailsv10();
			user.setUsername("First User");
			
			Address addr1=new Address();
			addr1.setCity("First City");
			addr1.setPincode("10001");
			addr1.setState("First State");
			addr1.setStreet("First Street");
			
			Address addr2 =new Address();
			addr2.setCity("Second City");
			addr2.setPincode("10002");
			addr2.setState("Second State");
			addr2.setStreet("Second Street");
			
			user.getListOfAddresses().add(addr1);
			user.getListOfAddresses().add(addr2);
			
     		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session=sessionFactory.openSession();
			
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			session.close();
		}

}
