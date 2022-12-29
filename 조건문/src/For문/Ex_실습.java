package For문;

public class Ex_실습 {
	public static void main(String[] args) {

		// for문을 이용하여 21부터 57까지 출력
		// for(초기화구문; 조건; 반복후 작업){
		// 조건이 true일 때 실행문;
		// }
		for (int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// for문을 이용하여 96부터 53까지 출력
		for (int i = 96; i > 52; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// for문을 이용하여 21부터 57까지 중 홀수만 출력
		for (int i = 21; i <= 57; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				// for (int i = 21; i <= 57; i = i + 2) {
				// System.out.println(i + " ");

			}
		}
	}
}
