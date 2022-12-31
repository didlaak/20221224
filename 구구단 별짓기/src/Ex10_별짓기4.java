import java.util.Scanner;

public class Ex10_별짓기4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 별짓기 개수 입력 : ");
		
		int num = sc.nextInt();

		for (int k = 1; k <= num; k++) {
			for (int i = 1; i <= k; i++) {
				System.out.print("*");

			}
			System.out.println();

		}

//		for (int i = 1; i <=1; i++) {
//			System.out.println("*");
//						
//		}
//		System.out.println();
//		
//		for (int i = 1; i <=2; i++) {
//			System.out.println("*");
//						
//		}
//		System.out.println();

	}
}