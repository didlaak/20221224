package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO : Data Access Object
// membership 테이블과 데이터를 주고받는 기능들을 모아둔 클래스
public class MemberDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	boolean result;

	public boolean login(String id, String pw) {

		connect();

		try {
			String sql = "select * from membership where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next() == true) {
				result = true;
			} else {
				result = false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close();
		return result;
	}

	public int insert(MemberDTO dto) {
		connect();
		try {
			// 3. sql문 작성 및 전송
			String id = dto.getId();
			String pw = dto.getPw();
			String nick = dto.getNick();
			int age = dto.getAge();

			String sql = "insert into membership values(?, ?, ?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setInt(4, age);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4. 종료
		close();

		return cnt;
	}

	public int update(MemberDTO dto) {

		connect();

		try {
			String id = dto.getId();
			String pw = dto.getPw();

			String sql = "update membership set pw = ? where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, pw);
			psmt.setString(2, id);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return cnt;
	}

	public void select(String id) {

		connect();

		try {

			String sql = "select * from membership where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			rs = psmt.executeQuery();

			if (rs.next()) {

				System.out.println("ID\tPW\tNICK\tAGE");

				String id2 = rs.getString(1);
				String pw = rs.getString("pw");
				String nick = rs.getString(3);
				int age = rs.getInt(4);

				System.out.printf("%s\t%s\t%s\t%d%n", id2, pw, nick, age);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close();

	}

	public void selectAll() {

		connect();

		try {

			String sql = "select * from membership";
			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			System.out.println("ID\tPW\tNICK\tAGE");
			while (rs.next()) {

				String id2 = rs.getString(1);
				String pw = rs.getString("pw");
				String nick = rs.getString(3);
				int age = rs.getInt(4);

				System.out.printf("%s\t%s\t%s\t%d%n", id2, pw, nick, age);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close();
	}

	public int delete(String id) {

		connect();

		try {

			String sql = "delete from membership where id = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close();

		return cnt;
	}

	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
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

	private void connect() {
		try {
			// 1. JDBC 동적로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. DB연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "system";
			String db_pw = "0000";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			System.out.println("sql문제~");
		}
	}

}