package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("회원 아이디 : ");
      String id = sc.next();
      System.out.print("비밀번호 수정 : ");
      String pw = sc.next();

      Connection conn = null;
      PreparedStatement psmt = null;

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String db_id = "system";
         String db_pw = "0000";

         conn = DriverManager.getConnection(url, db_id, db_pw);

         String sql = "update member set pw = ? where id = ?";
         psmt = conn.prepareStatement(sql);

         psmt.setString(1, pw);
         psmt.setString(2, id);

         int cnt = psmt.executeUpdate();

         if (cnt > 0) {
            System.out.println("회원정보 수정완료");
         } else {
            System.out.println("회원정보 수정실패");
         }

      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } finally {

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