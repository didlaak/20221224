package EX1108;

public class EX00_메소드 {

	public static void main(String[] args) {
			
		
		System.out.println(100 + 2);
		System.out.println(100 - 2);
		System.out.println(100 * 2);
		System.out.println(100 / 2);
		
		System.out.println("-----------------------------------------------------------");
		add(5, 10);
		sub(1, 2);
		mul(7, 4);
		div(20, 3);
	
	
	}
	
	// 메소드 구조
	// 1. 접근제한자 - public (내/외부에서 접근 가능한 제한자)
	// 2. static - 저장 위치
	// 3. 리턴 타입 -> retrun 키워드 사용해서 반환
	// -리턴값이 없는경우 -> 리턴타입 자리에 void
	// 4. 메소드이름(메소드에서 쓰일 매개변수 나열)
	
	//메소드 호출
	// 메소드 이름(매개변수)
	
	
	
	
	
	
	
	
	public static void add(int a, int b) {
		System.out.println(a + b);
		
	}
	
	public static void sub(int a, int b) {
		System.out.println(a + b);
	}
	public static void mul(int a, int b) {
		System.out.println(a + b);
	}
	public static void div(int a, int b) {
		System.out.println(a + b);
	}
	
	
	
	
	
	
}










