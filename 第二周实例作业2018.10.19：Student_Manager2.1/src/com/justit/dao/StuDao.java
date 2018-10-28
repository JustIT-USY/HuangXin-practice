package com.justit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.justit.domain.Student;
import com.justit.utils.DBUtils;

public class StuDao {
	public void addStu(Student stu) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("INSERT INTO student(id,name,password,gender,descri) VALUES(?,?,?,?,?)");
			ps.setInt(1, stu.getId());
			ps.setString(2, stu.getName());
			ps.setString(3, stu.getPassword());
			ps.setString(4, stu.getGender());
			ps.setString(5, stu.getDescri());

			int i = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("ÃÌº” ß∞‹£°");
		} finally {
			DBUtils.closeAll(null, ps, conn);
		}
	}

}
