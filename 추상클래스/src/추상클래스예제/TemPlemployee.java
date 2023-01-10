package 추상클래스예제;

public class TemPlemployee extends Employee {

	// empno
	// name
	// pay

	public TemPlemployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	// 연봉 / 12 --> 월급여

	// 월 급여를 반환해 주는 역할!
	@Override
	public int getMoneyPay() {
		return pay / 12;
	}
	// print 정보를 출력시켜주는 역할 --> employee에서 물려받음
}