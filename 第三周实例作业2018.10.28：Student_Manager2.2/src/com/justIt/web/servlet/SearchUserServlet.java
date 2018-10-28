package com.justIt.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.justIt.domain.User;
import com.justIt.service.UserService;
public class SearchUserServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		UserService us = new UserService();
		if(id != null) {
			try {
				User u = us.search(id);
				List infoList = new ArrayList<String>();
				
				infoList.add(u.getId());
				infoList.add(u.getName());
				infoList.add(u.getPassword());
				infoList.add(u.getGender());
				infoList.add(u.getDescri());

				request.setAttribute("List", infoList);
				request.getRequestDispatcher("searchUserSubpage.jsp").forward(request, response);
				
				
			} catch (NumberFormatException | SQLException e) {
				e.printStackTrace();
				request.getRequestDispatcher("anyerror.jsp").forward(request, response);
			}
		}else {
			request.getRequestDispatcher("anyerror.jsp").forward(request, response);
		}
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
