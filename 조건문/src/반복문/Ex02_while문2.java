package 반복문;

import java.util.Scanner;

public class Ex02_while문2 {

	// 숫자입력 : 숫자
	// 누적결과 : 숫자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int sum = 0;
		while (true) {
			System.out.print("숫자입력  : ");
			int num = sc.nextInt();
			
			sum += num;
			if(num == -1) {
				System.out.println("누적결과 : "+ sum);
				System.out.println("종료되었습니다");
				break;
			
			}else {
				sum += num;
				System.out.println("누적결과 : " + sum);
			}
			
			

		}

	}
}
