package For문;

import java.util.Scanner;

public class Ex02_실습2 {
	public static void main(String[] args) {

		// 두 정수를 입력 받아서
		// 작은 정수부터 큰 정수까지 1씩 증가시키기

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");

		int num1 = sc.nextInt();

		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		for (int i = num1; i <= num2; i++) {

			System.out.print(i + " ");
		}
		while (true) {
			if (num1 > num2) {
				System.out.print((num1 -= 1) + " ");
			}

		}

	}
}
