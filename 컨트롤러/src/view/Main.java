package view;

import java.util.Scanner;

import controller.ManagementSystem;
import model.MemberDAO;
import model.MemberDTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberDTO dto = null;
		MemberDAO dao = new MemberDAO();
		ManagementSystem ms = new ManagementSystem();

		// 어떤 화면을 구성할 것인가?
		System.out.println("====인공지능====");

		while (true) {
			System.out.print("[1]로그인 [2]회원가입 [3]정보수정 [4]조회 [5]회원탈퇴 [6]종료 >> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 로그인
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();

				ms.loginCon(id, pw);

			} else if (menu == 2) {
				// 회원가입
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("NICK : ");
				String nick = sc.next();
				System.out.print("AGE : ");
				int age = sc.nextInt();

				ms.insertCon(id, pw, nick, age);

			} else if (menu == 3) {
				// 정보수정
				System.out.print("회원 ID : ");
				String id = sc.next();
				System.out.print("변경할 PW : ");
				String pw = sc.next();

				ms.updateCon(id, pw);

			} else if (menu == 4) {
				// 조회기능
				System.out.print("[1]전체조회 [2]선택조회 >> ");
				int num = sc.nextInt();

				if (num == 1) {
					// 전체조회
					dao.selectAll();

				} else {
					// 선택조회
					System.out.print("조회할 ID : ");
					String id = sc.next();

					dao.select(id);
				}

			} else if (menu == 5) {
				// 회원탈퇴
				System.out.print("삭제할 ID : ");
				String id = sc.next();

				ms.deleteCon(id);

			} else if (menu == 6) {
				// 종료
				System.out.println("프로그램 종료!");
				break;
			} else {
				System.out.println("다시 입력해주세요~");
			}

		}

	}

}