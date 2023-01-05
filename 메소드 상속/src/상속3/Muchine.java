package 상속3;

public class Muchine {

	// 뽑기 기능 필요!

	// 파이리 인형 뽑기 기능
//	public void pickPokect(Piri Piri) {
//
//		Piri.pick();
//
//	}
//
//	// 꼬부기 인형 뽑기 기능
//	public void pickPokect(Kkobuck Kkobuck) {
//
//		Kkobuck.pick();
//	}
//
//	// 피카츄 인형 뽑기 기능
//	public void pickPokect(Pika Pika) {
//		Pika.pick();
//	}
//
//	public void pickPokect(Lizamong Lizamong) {
//		Lizamong.pick();

	// 메소드 이름을 그대로 유지한채로
	// 다른 매개변수를 받아서 새로운 메소드를 만드는 기능!
	// --> 메소드 오버로딩 : 다형성@
	public void pickPokect(Pokect pokect) {
		pokect.pick();

	}
}