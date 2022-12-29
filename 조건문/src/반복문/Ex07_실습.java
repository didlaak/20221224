package 반복문;

import java.util.Scanner;

public class Ex07_실습 {

	public static void main(String[] args) {

		// 로그인 프로그램
		// 아이디 : Hello
		// 비밀번호 : 1234
		Scanner sc = new Scanner(System.in);

		String id = "Hello";
		String pw = "1234";
		
		
		while (true) {
			// 아이디와 비밀번호 입력받기

			// 조건문

			// 로그인 성공시 "로그인 성공!" 출력

			// 로그인 실패시 "아이디와 비밀번호가 잘못되었습니다!" 출력

			System.out.print("아이디를 입력해주세요 : ");
			String input_id = sc.next();

			System.out.print("비밀번호를 입력해주세요 :");
			String input_pw = sc.next();

			if (input_id.equals(id) && input_pw.equals(pw)) {
				System.out.println("로그인 성공.!");
				break;

			} else {
				System.out.print("아이디와 비밀번호가 잘못되었습니다.");
			}

		}
	}
}
