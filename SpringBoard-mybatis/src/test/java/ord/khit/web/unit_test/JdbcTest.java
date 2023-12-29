package ord.khit.web.unit_test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

@Log4j	//�α�(�����) ����ϴ� ���̺귯��
public class JdbcTest {
	
	@Test	//main �޼���ó�� �����
	public void testConnection() {
		String className="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/springdb?serverTime=Asia/Seoul";
        String username="springuser";
        String password="pwspring";
        
        try {
			Class.forName(className);
			Connection con = DriverManager.getConnection(url, username, password);
			//System.out.println("db ���� ��ü ����: " + con);
			log.info("db ���� ��ü ����: " + con);
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}