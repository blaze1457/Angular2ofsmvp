package com.ofs.matrimony.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ofs.matrimony.dao.UserDAO;

public class UserControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String user_id = request.getParameter("user_Id");
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("Password");
		String emailid = request.getParameter("emailid");
		String annualincome = request.getParameter("annualincome");
		String caste = request.getParameter("caste");
		String gender = request.getParameter("gender");
		String citizenship = request.getParameter("citizenship");
		String country = request.getParameter("country");
		String education = request.getParameter("education");
		String employement = request.getParameter("employement");
		String motherlang = request.getParameter("motherlang");
		String occupation = request.getParameter("occupation");
		String religion = request.getParameter("religion");
		String residentstatus = request.getParameter("residentstatus");
		String state = request.getParameter("state");
		String status = request.getParameter("status");
		String phoneno = request.getParameter("phoneno");
		String city = request.getParameter("city");

		System.out.println(emailid);
		
		HttpSession session = request.getSession(true);
		try {
			UserDAO userDAO = new UserDAO();
			userDAO.addUserDetails(city, phoneno, status, state, residentstatus, religion, occupation, motherlang, employement, education, country, citizenship, gender, caste, annualincome, emailid, userPassword, userName, user_id, city);
			response.sendRedirect("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
