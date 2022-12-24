package 복습;

public class Ex07_논리연산자 {

	public static void main(String[] args) {

		// 논리 연산자
		// 결과 값 : boolean 자료형
		// 부정 연산자 (NOT)
		// 앞선 값에 반대되는 값으로 나타내고 싶을 때 사용!

		boolean check = true;
		System.out.println(check);
		System.out.println(!check);

		// &&(AND 연산자, 곱 연산자)
		// || (OR 연산자, 합 연산자)

		System.out.println((1 < 3) && (4 < 5));
		System.out.println((2 < 1) && (4 < 5));
		System.out.println((1 < 3) || (4 < 2));
		System.out.println((2 < 1) || (4 < 2));

	}

}
