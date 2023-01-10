package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select {

	public static void main(String[] args) {

		System.out.println("전체조회");

		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@lacalhost:1521:xe";
		String db_id = "system";
			String db_pw = "0000";
		
		try {
		DriverManager.getConnection(url,db_id,db_pw);
			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);
			
			ResultSet rs= psmt.executeQuery();	
			
			
		System.out.println("ID\tPW\tNAME");
		while (rs.next() == true) {
		
		String id = rs.getString(1);	
		String pw = rs.getString(2);
		String name = rs.getString(3);		
		System.out.printf("%s\t%s\t%s%n",id, pw,name);
		}
		
		
		}
		catch (ClassNotFoundException e) {
			System.out.println("동적로딩?");
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			
		
		
		}
}
