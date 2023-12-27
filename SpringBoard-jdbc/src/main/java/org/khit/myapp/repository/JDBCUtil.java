package org.khit.myapp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	static String className = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/springdb?serverTime=Asia/Seoul";
	static String username = "springuser";
	static String password = "pwspring";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// ���� �޼���
	public static Connection getConnection() {
		try {
			Class.forName(className);
			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// ���� �޼���
	public static void close(Connection conn, PreparedStatement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// ���� �޼���(�˻�)
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		if (pstmt != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}