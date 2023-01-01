package 이차원배열;

public class EX04_실습04 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
// 입력부

		int cnt =1;
				
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {

				array[i][k] = cnt++;

			}
		}

//출력부
		for (int k = 0; k < array.length; k++) {
			for (int i = 0; i < array[k].length; i++) {

				array[k][i] = cnt++;

				System.out.print(array[k][i] + "\t");
			}
			System.out.println();
		}
	}
}
//for (int k = 0 ; i< array.length ; k++

// for (int i = 0; i<array[k].length ; i++){
// array [0][i] = cnt++
// system.out.print(array[i][k] + "\t""
