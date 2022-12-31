import java.util.Scanner;

public class Ex04_구구단4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int k = 1; k <= 9; k++) {
			System.out.println("==" + k + "단==");
			for (int i = 1; i <= 9; i++) {
				System.out.println(k + "*" + i + "=" + k * i);

			}
		
	
			System.out.println();
			// System.out.println("===2단===");

			// for (int i = 1; i <= 9; i++) {
			// System.out.println(2 + "*" + i + "=" + 2 * 1);

		}
	}

}
