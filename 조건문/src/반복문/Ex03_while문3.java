package 반복문;

import java.util.Scanner;

public class Ex03_while문3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int even = 0; // 짝수를 카운트
		int odd = 0; // 홀수를 카운트

		while (true) {
			System.out.print("숫자입력 : ");
			int num = sc.nextInt();
			
			if (num == -1) {
				System.out.println("종료되었습니다");
				break;

			} else if (num % 2 == 0) {
				//even += 1;
				even++;
				
			} else {
				odd ++;
				
			}
			System.out.println("짝수갯수 : " + even);
			System.out.println("홀수갯수 : " + odd);

		}
	}

}
