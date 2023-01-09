package 상속_전화기;

public class Main {

	public static void main(String[] args) {
		전화 sph = new 전화();
		스마트폰 smart = new 스마트폰();
		아이폰 iph = new 아이폰();
		갤럭시 gal = new 갤럭시();
		
		
		
		sph.call();
		sph.callback();

		smart.call();
		smart.callback();
		smart.music();
		smart.internet();
		
		gal.callback();
		gal.call();
		iph.call();
	
	
	}

}
