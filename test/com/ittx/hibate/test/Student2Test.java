package com.ittx.hibate.test;

import static org.junit.Assert.*;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ittx.hibate.model.Student2;

public class Student2Test {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Before
	public void setUp() throws Exception {
		Configuration config = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties())
				.build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}

	@After
	public void tearDown() throws Exception {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

	@Test
	public void testStudent2() {
		Student2 student = new Student2("ÕÅÊÇ", 1002, 15, "ÄÐ",new Date() );
		session.save(student);
		
		
	}


}
