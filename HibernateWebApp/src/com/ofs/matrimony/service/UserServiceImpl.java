package com.ofs.matrimony.service;

import com.ofs.matrimony.dao.UserDAOImpl;
import com.ofs.matrimony.model.User;
import com.ofs.matrimony.service.UserService;

public class UserServiceImpl implements UserService {

	User UserDAO = new UserDAOImpl();
	@Override
	public User findById(String user_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addUser(User user) {
		return null;
	}

}
