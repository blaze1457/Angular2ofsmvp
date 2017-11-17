package com.ofs.matrimony.service;

import com.ofs.matrimony.model.User;

public interface UserService {
	
	public User findById(String user_Id);
	public String addUser(User user);
}
