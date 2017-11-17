package com.ofs.matrimony.dao;

import com.ofs.matrimony.model.User;

public interface UserDao {
	
	public UserDao findUserById(String user_Id);
	public String addUser(User user);

}
