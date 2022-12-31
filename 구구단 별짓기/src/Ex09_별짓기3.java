
public class Ex09_별짓기3 {

	public static void main(String[] args) {

		for (int k = 1; k <= 5; k++) {

			for (int i = 5; i - k > 0; i--) {
				System.out.print(" ");
			}

			for (int i = 1; i <= k; i++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}
}