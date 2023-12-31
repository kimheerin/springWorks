package org.khit.myapp.unittest;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

@Log4j	//로그(기록을) 출력하는 라이브러리
public class JdbcTest {
	
	@Test	//main 메서드처럼 실행됨
	public void testConnection() {
		String className="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/jwebdb?serverTime=Asia/Seoul";
        String username="jweb";
        String password="pwjweb";
        
        try {
			Class.forName(className);
			Connection con = DriverManager.getConnection(url, username, password);
			//System.out.println("db 연결 객체 생성: " + con);
			log.info("db 연결 객체 생성: " + con);
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
