package EX1109;

import java.util.Scanner;

public class EX01_큰수확인 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int largerNumbers = 0;

		int result = largerNumbers(num1, num2);

		System.out.println("큰 수 확인 : " + result);

	}

	public static int largerNumbers(int a, int b) {

//		if (a == b) {
//			System.out.println(0);
//		} else if (a > b) {
//			System.out.println(a);
//		} else if (a < b) {
//			System.out.println(b);
//		}
		int result = 0;
		if (a > b) {
			return a;
		} else if (b > a) {
			return b;
		} else if (a == b) {

		}
		return result;

	}

}
