package 이차원배열;

public class EX07_실습7 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int cnt = 0;

		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {

				array[k][i] = ++cnt;

			}
		}
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {
				if (k % 2 == 0) {
					System.out.print(array[k][i] + "\t");
				} else {
					System.out.print(array[k][4 - i] + "\t");
				}

			}
			System.out.println();
		}
	}
}
