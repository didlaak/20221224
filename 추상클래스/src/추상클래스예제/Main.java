package 추상클래스예제;

public class Main {

	public static void main(String[] args) {

		// PartTimeEmployee 객체를 만들어주세요!1
		PartTimeEmployee partTime = new PartTimeEmployee("001", "승환쌤", 100, 25);

		// 사번, 이름, 일당
		partTime.print();

		// 월 급여
		partTime.getMoneyPay();
		System.out.println(partTime.getMoneyPay());

		TemPlemployee temp = new TemPlemployee("002", "주희", 20);
		temp.print();
		System.out.println(temp.getMoneyPay());

	}

}
