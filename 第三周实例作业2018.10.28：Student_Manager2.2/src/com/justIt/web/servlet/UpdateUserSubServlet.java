package com.justIt.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.justIt.domain.User;
import com.justIt.service.UserService;

public class UpdateUserSubServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService us = new UserService();
		User u = new User();//mark
		String i = (String) request.getSession().getAttribute("id");
		u.setId(i);
		u.setName(request.getParameter("name"));
		u.setPassword(request.getParameter("password"));
		u.setGender(request.getParameter("gender"));
		u.setDescri(request.getParameter("descri"));
		try {
			us.alter(u);
			request.getRequestDispatcher("anysuccess.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
