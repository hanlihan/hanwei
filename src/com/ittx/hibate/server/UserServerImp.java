package com.ittx.hibate.server;

import com.ittx.hibate.dao.UserDao;
import com.ittx.hibate.daoImp.UserDaoImp;
import com.ittx.hibate.model.User;

public class UserServerImp implements UserServer {
     UserDao userdao = new UserDaoImp();
	@Override
	public void saveUser(User user) {
		userdao.saveUser(user);

	}

}
