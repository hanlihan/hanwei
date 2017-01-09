package com.ittx.hibate.daoImp;

import org.hibernate.Session;

import com.ittx.hibate.dao.UserDao;
import com.ittx.hibate.model.User;
import com.ittx.hibate.untls.HibernateUtil;

public class UserDaoImp implements UserDao {


	@Override
	public void saveUser(User user) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

}
