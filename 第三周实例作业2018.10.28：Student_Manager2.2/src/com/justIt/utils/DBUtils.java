package com.justIt.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

//使用DBUtils策略
public class DBUtils {	
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	
	static {
		//static中写基本四项
		ResourceBundle rb = ResourceBundle.getBundle("dbinfo");
		driverClass = rb.getString("driverClass");
		url = rb.getString("url");
		username = rb.getString("username");
		password = rb.getString("password");	
		
		try {
			Class.forName(driverClass);//返回一个类对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}	
//----------------------------------------------------------
		
	//得到连接的方法
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}
	
	//关闭资源的方法
	public static void closeAll(ResultSet rs, Statement stmt, Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs = null;
		}
		
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt = null;
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
	
}
