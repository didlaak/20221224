package 반복문;

import java.util.Scanner;

public class Ex05_do_while문2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		// 0을 누를 때까지 계속 숫자입력 가능

		do {
			// 반드시 한 번은 실행되어야 하는 실행문
			System.out.print(">");
			num = sc.nextInt();

			// 그 후 조건식 결과가 true일 때만 실행됨
		} while (num != 0);
		System.out.println("프로그램 종료");
		

	}

}
