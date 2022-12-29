package 반복문;

import java.util.Scanner;

public class Ex09_실습3 {

	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.print("첫 번째 정수를 입력하세요 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 정수를 입력하세요 : ");
			int num2 = sc.nextInt();

			System.out.print("[1]더하기 [2]빼기 >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("더하기 연산 결과는 " + (num1 + num2) + "입니다");
			}
			if (menu == 2) {
				System.out.println("빼기 연산 결과는" + (num1 - num2) + "입니다");

			} else {
				System.out.print("다시 실행하시겠습니까? (Y/N) >> ");
				String as = sc.next();
				if (as.equals("N") || as.equals("n")) {
					System.out.print("종료합니다.");
					break;
				}

			}
		}
	}
}
