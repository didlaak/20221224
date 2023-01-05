package EX1109;

public class EX05_약수2 {

	public static void main(String[] args) {

		int num = 10;
		int result = getsum(num);

		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(10);

	}

	public static int getsum(int num) {
		int result = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				result += i;
			}
		}
		return result;

	}

	public static void getDivisor(int num) {
		System.out.print(num+"의 약수 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}

		}

	}
}
