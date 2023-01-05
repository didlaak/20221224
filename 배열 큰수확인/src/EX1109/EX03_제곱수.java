package EX1109;

import java.util.Scanner;

public class EX03_제곱수 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int base = 5;
		int n = 6;
		int result = powerN(base, n);
		System.out.print("결과 확인 : " + result);

	}

	public static int powerN(int base, int n) {
		int num = base;
		for (int i = 0; i < n - 1; i++)
			num = base * base;

//		int result = 1;
//		for (int i = 0; i < n; i++) {
//			result *= base;
//		}
//
//		return result;
//	}

		return 0;
	}
}
