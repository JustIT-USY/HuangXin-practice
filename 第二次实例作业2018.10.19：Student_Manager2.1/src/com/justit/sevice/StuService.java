package com.justit.sevice;

import java.sql.SQLException;

import com.justit.dao.StuDao;
import com.justit.domain.Student;

public class StuService {

	StuDao sd = new StuDao();

	public void regist(Student stu) throws SQLException {
		sd.addStu(stu);// ÓÃ»§×¢²á
	}
}
