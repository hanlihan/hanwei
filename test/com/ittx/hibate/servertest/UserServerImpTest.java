package com.ittx.hibate.servertest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ittx.hibate.model.User;
import com.ittx.hibate.server.UserServer;
import com.ittx.hibate.server.UserServerImp;


public class UserServerImpTest {
    private  UserServer users = new UserServerImp();
	@Test
	public void testSaveUser() {
		User user = new User(5,"ÞßÈý¶¥Îå",1230);
		users.saveUser(user);
	}

}
