package EX1110;

import java.lang.reflect.Array;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;

public class EX01_ArrayList {

	public static void main(String[] args) {

		// 1. 선언 및 생성
		// 배열
		int[] array = new int[5];

		// ArrayList(가변 리스트)
		// 제네릭기법
		// ArrayList 는 import해야 함(클래스 형티이기 때문)
		// AraayList <데이터 타입> 변수명 = new ArrayList<데이터 타입>();
		// () : 메소드를 사용해서 생성
		// 데이터 타입 -> 객체타입으로 존재 . int형태 -> integer
		// 생성할 때 크기지정 x
		ArrayList<Integer> arrlist = new ArrayList<Integer>();

		// 2. 값 추가
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		// ArrayList - 메소드를 이용해서 값 추가
		// 변수명 .add (값)
		// 변수명.add(인덱스 ,값)
		// 크기 : 변수명.size()
		System.out.println("값 추가 전 ArrayList 크기 : " + arrlist.size());
		
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		
	
		System.out.println("값 추가 전 ArrayList 크기 : " + arrlist.size());
	
		// 3. 값 조회
		// 배열 get(인덱스)
		System.out.println("배열의 0번 인덱스 : "+ array[0]);
		
		//ArrayList
		System.out.println("ArrayList의 0번 인덱스 : " + arrlist.get(0));
		
		//전체 조회(for문 사용)
		System.out.print("ArrayList 전체조회 : ");	
		for (int i=0; i<arrlist.size(); i++ ) {
				System.out.print(arrlist.get(i)+ " ");
			}
		
		// 4. 값 삭제
		// ArrayList
		// 선택 삭제 : 변수명.remove(인덱스)
		// 전체 삭제 : 변수명.clear(), 변수명.removeAll()
		
		System.out.println();
		arrlist.remove(0);
		System.out.println(arrlist.get(0));
		System.out.println(arrlist.size());
		arrlist.clear();
		System.out.println(arrlist.size());
		
		
		
		
		
	}

}
