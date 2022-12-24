import java.util.Scanner;

public class Ex11_삼항연산자2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수를 입력받아서 (num)
		// 홀수인지 짝수인지 판별하기

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		System.out.print(num % 2 == 1 ? "홀수입니다" : "짝수입니다");

	 sc.close();
	}

}
