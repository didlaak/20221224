package EX1109;

import java.util.Scanner;

public class EX02_더가까운수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int close = 0;
		int result = close(num1, num2);

		System.out.println(" 10에 가까운수 : " + result);
	}

//	public static int close(int num1, int num2) {

//		int result = 0;
//		if (10 - num1 > 10 - num2) {
//			return num2;
//		} else if (10 - num1 < 10 - num2) {
//			return num1;
//
//		} else if (10 - num1 < 0) {
//			return num1 * -1;
//		} else if (10 - num2 < 0) {
//			return num2 * -1;
//		} else if (10 - num1 == 10 - num2) {
//			return result;
//		}
//		return result;

	public static int close(int num1, int num2) {

		
		int a = Math.abs(10- num1);
		int b = Math.abs(10- num2);
		
//		int a = 10 - num1;
//		int b = 10 - num2;
//
//		if (a < 0) {
//			a *= -1;
//		}
//		if (b < 0) {
//			b *= -1;
		
		if (a < b) {
			return num1;
		} else if (b < a) {
			return num2;
		}
		return 0;

	
	
}
}