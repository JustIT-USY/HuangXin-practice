package com.justIt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.justIt.domain.User;
import com.justIt.utils.DBUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public void add(User u) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DBUtils.getConnection();
			ps = conn.prepareStatement("INSERT INTO User(id,name,password,gender,descri) VALUES(?,?,?,?,?)");
			ps.setString(1, u.getId());
			ps.setString(2, u.getName());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getGender());
			ps.setString(5, u.getDescri());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeAll(null, ps, conn);
		}
	}

	@Override
	public void dele(String id) throws SQLException {
		Connection conn = null;
		conn = DBUtils.getConnection();
		QueryRunner qr = new QueryRunner();
		qr.update(conn,"delete from user where id=?", id);
	}

	@Override
	public void alter(User u) throws SQLException {
		Connection conn = null;
		conn = DBUtils.getConnection();
		QueryRunner qr = new QueryRunner();
		qr.update(conn,"update user set id=?, name=?, password=?, gender=?, descri=?", u.getId(), u.getName(),
				u.getPassword(), u.getGender(), u.getDescri());
	}

	@Override
	public User search(String id) throws SQLException {
		Connection conn = null;
		conn = DBUtils.getConnection();
		QueryRunner qr = new QueryRunner();
		User u = qr.query(conn,"select * from user where id=?", new BeanHandler<User>(User.class),id);
		conn.close();
		return u;
	}

}
