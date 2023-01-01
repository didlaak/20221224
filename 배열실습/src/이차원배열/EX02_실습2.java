package 이차원배열;

public class EX02_실습2 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 5, 4 };

		// 학생 3명의 국, 영, 수, 사, 과 점수를 저장하고 출력하기
		int[][] scores = { { 60, 15, 80, 10, 45 }, { 78, 95, 46, 87, 45 }, { 78, 15, 65, 98, 45 } };
		// 점수 -> 변수
		// 여러과목의 점수 -> 일차원배열
		// 여러 학생의 과목점수 -> 이차원배열

		// 학생들의 모든 점수 출력
		// 0번 학생 ~ 2번 학생
		// - 0번학생 -> 0번과목 ~ 4번과목
		// - 1번학생 -> 0번과목 ~ 4번과목
		// - 2번학생 -> 0번과목 ~ 4번과목

		for (int k = 0; k < scores.length; k++) {
			int sum = 0;
			System.out.print(k + "번학생 : ");
			for (int i = 0; i < scores[k].length; i++) {
				System.out.print(scores[k][i] + " ");
				sum += scores[k][i];
			}

			System.out.println(k + "번의 평균 : " + sum / scores[k].length);
//		
//			System.out.print(1+"번학생 : ");
//			for (int i = 0; i < scores[1].length; i++) {
//				System.out.print(scores[1][i] + " ");

		}

	}
}
