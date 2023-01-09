package 상속3;

import java.nio.file.spi.FileSystemProvider;

public class Lollipop extends Phone {

	@Override
	public void call() {
		System.out.println("폴더를 열어서 전화를 걸다");
	}

	public void Message() {

		System.out.println("메세지를 보내다");

	}

}
