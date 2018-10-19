package com.justit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.justit.domain.Student;
import com.justit.sevice.StuService;

public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ������
		Student stu = new Student();
		try {
			BeanUtils.populate(stu, request.getParameterMap());//request.getParameterMap():
			StuService ss = new StuService();
			ss.regist(stu);//dao������new
		} catch (Exception e) {
			System.out.println("ϵͳ�쳣...");
		}
		
		request.getRequestDispatcher("/registersuccess.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
