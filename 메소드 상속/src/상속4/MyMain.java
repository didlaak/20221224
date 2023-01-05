package 상속4;

public class MyMain {

	public static void main(String[] args) {
		SunChip sun = new SunChip();
		eat(sun);
		Honey ho = new Honey();
		eat(ho);
		YacheTime ya = new YacheTime();
		eat(ya);
		SwingChip sw = new SwingChip();
		eat(sw);

	}

	public static void eat(Snack snack) {
		snack.eat();
		// 만약 먹는 과자가 야채타임 이라면
		// --> 야채타임으로 부터 업캐스팅된 객체라면!
		// 케찹을 찍어 먹고 싶어요

		if (snack instanceof YacheTime) {
			// 다운캐스팅을 해서
			// 하위클래스명 객체명 = (하위클래스명) 업캐스팅된객체명
			YacheTime ya = (YacheTime) snack;
			// 케찹 찍어먹기
			ya.ketchup();

			
		}

	}
}

