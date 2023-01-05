package EX1109;

public class EX06_완전수 {

	public static void main(String[] args) {

		// 완전수? = 약수를 나열했을 때 자기자신을 빼고의 합이 자기자신인경우
		// 6 -> 1, 2, 3, 6 (자기자신)

		int startValue = 2;
		int endValue = 1000;
		getperfectNumber(startValue, endValue);
	}

	public static void getperfectNumber(int a, int b) {

		System.out.print(a + " ~ " + b + "까지의 완전수 : ");
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int k = 1; k < i; k++) {
				if (i % k == 0) {
					sum += k;
				}
			}
			if (sum == i) {
				System.out.print(i + " ");
			}

		}
	}
}