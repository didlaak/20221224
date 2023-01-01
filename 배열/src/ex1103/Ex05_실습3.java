package ex1103;

public class Ex05_실습3 {

	public static void main(String[] args) {

		// 최댓값

		int[] Array = { 1, 3, 9, 4, 8, 5, 15 };
		int max = Array[0];
		System.out.print("가장 큰 수는 ");

		for (int i = 0; i < Array.length; i++) {
			if (max < Array[i]) {
				max = Array[i];
			}

		}
		System.out.print(max + "입니다");

		// 최솟값
		int[] Array2 = { 14, 3, -9, -4, 8, 5, 15 };
		int min = Array2[0];
		System.out.print("가장 작은 수는 ");

		for (int i = 0; i < Array2.length; i++) {
			if (min > Array2[i]) {
				min = Array2[i];
			}

			System.out.print(min + " 입니다");
		}
		int sum = 0;
		for (int i = 0; i < Array.length; i++) {
			sum += Array[i];
		}
		System.out.println("점수 총합 : "+sum);
	}
}
