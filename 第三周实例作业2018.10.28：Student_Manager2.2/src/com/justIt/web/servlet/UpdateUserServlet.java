package com.justIt.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.justIt.domain.User;
import com.justIt.service.UserService;

public class UpdateUserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService us = new UserService();

		String id = request.getParameter("id");
		String pwd = request.getParameter("password");
		
		try {
			User u = us.search(id);
			if(u.getPassword().equals(pwd)) {
				request.getSession().setAttribute("id", id);
				request.getRequestDispatcher("updateUserSubpage.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("anyerror.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			request.getRequestDispatcher("anyerror.jsp").forward(request, response);
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
