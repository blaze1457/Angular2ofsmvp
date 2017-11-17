package com.ofs.matrimony.dao;

import com.ofs.matrimony.model.User;

import com.ofs.matrimony.util.HibernateUtil;

public class UserDAOImpl extends User {

	HibernateUtil hibernateUtil = new HibernateUtil();

	
	public User findUserById(String user_Id) {
		hibernateUtil.openCurrentSession();
		
		User user =(User)hibernateUtil.getCurrentSession().createQuery("from User where email='"+user_Id+"' and isActive=1").uniqueResult();
		
		hibernateUtil.closeCurrentSession();
		
		return user;
	}
	
	public String addUser(User user) {
		hibernateUtil.openCurrentSessionwithTransaction();
		Integer id = (Integer)hibernateUtil.getCurrentSession().save(user);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "User record saved successfully with id:"+id;
	}
}
