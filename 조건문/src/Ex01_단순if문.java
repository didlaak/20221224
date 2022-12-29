import java.util.Scanner;

public class Ex01_단순if문 {

	public static void main(String[] args) {
		
		
		// num이라는 변수에 값을 입력하기 -> Scanner 사용
		Scanner sc = new Scanner(System.in);
		
		// 조건식 : 만약 num이 10보다 크다면 ~~
		// 실행문 : "10보다 큽니다 " 출력하기
		
		System.out.print("숫자 입력 : ");
		
		int num = sc.nextInt();
		
		if(num > 10) {
		System.out.println("10보다 큽니다.");}
		}
		
	   

	}


