package com.ittx.hibate.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ittx.hibate.model.Student;

public class StudentTest {

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
	public void testSaveStudent() {
		Student student = new Student("水", 1005, 18, "男");
		session.save(student);

		// Student student = new Student("米从早", 1001, 18, "女");
		// session.update(student);
	}
	@Test 
	public void testStudent() {
		String sql = "select * from student where age=18";
		SQLQuery sqlQuery = session.createSQLQuery(sql).addEntity(Student.class);
        List<Student> list = sqlQuery.list();
        for(Student student :list){
        	
        	System.out.println(student);
        }
	}

}
