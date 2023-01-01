package ex1104;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03_실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// split() : 특정 문자를 기준으로 문자열을 잘라주는 함수(기능)
		// 변수.split(특정문자)
		String score = "A,A,B,B,C,D,A,C,D,D,D,F";
		String[] scores = score.split(",");

		System.out.println(Arrays.toString(scores));

		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i].equals("A")) {
				cntA++;

			} else if (scores[i].equals("B")) {
				cntB++;
			} else if (scores[i].equals("c")) {
				cntC++;
			} else if (scores[i].equals("D")) {
				cntD++;
			} else {
				cntF++;

			}
		}
		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");
	}

}