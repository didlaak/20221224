import java.util.Scanner;

public class Ex04_산술연산자4 {

	public static void main(String[] args) {

		// 두 개의 정수를 입력 받기 -> Scanner 임포트하기

		// 더하기, 빼기, 곱하기, 나누기(몫) 연산된 출력문!

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수 입력 : ");

		int num = sc.nextInt();

		System.out.print("두 번째 정수 입력 : ");

		int num2 = sc.nextInt();

		System.out.println("두 수의 더하기 : " + (num + num2));

		System.out.println("두 수의 빼기 : " + (num - num2));

		System.out.println("두 수의 곱하기 : " + (num * num2));

		System.out.println("두 수의 나누기(몫) : " + (num / num2));

	}

}
