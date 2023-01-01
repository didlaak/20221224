package ex1103;

import java.util.Scanner;

public class Ex04_실습2 {

	public static void main(String[] args) {
		// 1. 임의의 값으로 저수형 배열 초기화 - >{정수,정수,정수}
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 2. 홀수인 것만 출력, 홀수의 개수도 출력

		System.out.print("intArray에 들어있는 홀수는 ");

		int cnt = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 == 1) {
				System.out.print(intArray[i] + " ");
				cnt++;
			}

		}

		System.out.println("입니다. 홀수의 총 개수는 " + cnt + "개입니다");
//		for(int i= 0; i < intArray.length  ; i++) 
//	         if  (intArray[i] %2 ==1);
//		System.out.println(intArray[i]+"입니다");
//		
	}

}
