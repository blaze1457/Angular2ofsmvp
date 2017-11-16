package com.ofs.matrimony.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ofs.matrimony.model.User;

public class UserDAO {

	public void addUserDetails(String city, String phoneno, String status, String state, String residentstatus,
			String religion, String occupation, String motherlang, String employement, String education, String country,
			String citizenship, String gender, String caste, String annualincome, String emailid, String userPassword,
			String userName, String user_id, String userDob) {
		// TODO Auto-generated method stub
		try {
			// 1. configuring hibernate
			Configuration configuration = new Configuration().configure();

			// 2. create sessionfactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			// 3. Get Session object
			Session session = sessionFactory.openSession();

			// 4. Starting Transaction
			Transaction transaction = session.beginTransaction();
			User user = new User();
			user.setUserName(userName);
			user.setUserPassword(userPassword);
			user.setEmailid(emailid);
			user.setUserDob(userDob);
			user.setAnnualincome(annualincome);
			user.setCaste(caste);
			user.setgender(gender);
			user.setCitizenship(citizenship);
			user.setCountry(country);
			user.setEducation(education);
			user.setEmployement(employement);
			user.setMotherlang(motherlang);
			user.setId(user_id);
			user.setOccupation(occupation);
			user.setPhoneno(phoneno);
			user.setReligion(religion);
			user.setResidentstatus(residentstatus);
			user.setState(state);
			user.setStatus(status);
			user.setCity(city);
			session.save(user);
			transaction.commit();
			System.out.println("\n\n Details Added \n");

		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			System.out.println("error");
		}

	}

}
