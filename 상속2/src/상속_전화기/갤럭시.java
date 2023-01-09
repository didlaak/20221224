package 상속_전화기;

public class 갤럭시 extends 스마트폰 {

	public void samsungpay() {
		System.out.println("삼성페이 굳~~!");
	}

	// 오버라이딩 (재정의)
	@Override
	public void call() {
		System.out.println("특별한 전화걸기");
	}
}
