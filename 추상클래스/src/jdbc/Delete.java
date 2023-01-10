package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("탈퇴할 아이디 : ");
		String id = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			// 1 jdbc 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2.DB랑 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String db_id = "system";
			String db_pw = "0000";

			conn = DriverManager.getConnection(url, db_id, db_pw);

			// 3. sql문 작성 및 전송
			String sql = "delete from member where id = ?";
			psmt = conn.prepareCall(sql);
			
			psmt.setString(1, id);
			

			int cnt = psmt.executeUpdate();
			if (cnt >= 0) {
				System.out.println("회원 탈퇴 성공");

			} else {
				System.out.println("회원 탈퇴 실패");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");

		} catch (SQLException e) {
			System.out.println("DB 연결 실패");

		} finally {
			// 4. 통로 닫아주기
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
