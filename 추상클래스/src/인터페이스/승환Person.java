package 인터페이스;

public class 승환Person implements Person, Person2 {

	// 인터페이스를 상속 받을때는 implements 라는 키워드를 사용한다
	// 인터페이스 상속은 다중 상속이 가능하다!!

	public void sleep() {
		System.out.println("엎드려서 잠을잔다");
	}

	public void eat() {
		System.out.println("승환쌤이 짜장면을 먹다");
	}
}
