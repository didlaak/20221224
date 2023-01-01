package 이차원배열;

public class EX05_실습5 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		// 입력부

		int cnt = 1;
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[0].length; i++) {

				array[i][k] = cnt++;
			}
		}
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[0].length; i++) {

				System.out.print(array[k][i] + "\t");
			}
			System.out.println();
		}
	}
}