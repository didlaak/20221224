package EX1110;

import java.util.ArrayList;
import java.util.Scanner;

public class EX02_실습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> team = new ArrayList<String>();
		// ArrayList 생성
		// 변수명 = team
		// scnner를 이용해서 0번 인덱스부터 순서대로 값을 넣기
		// Arraylist에 들어있는 메소드를 사용해서 팀원들 출력하기

		for (int i = 0; i < 5; i++) {
			System.out.print("이름을 입력하시오 : ");
			String name = sc.next();
			team.add(name);

		}
		System.out.print("연구개발팀의 팀원은 : ");
		for (int k = 0; k < team.size(); k++) {
			System.out.print(team.get(k) + " ");
		}
		// 팀원 탈퇴 시키기~~
		// 내가 입력한 이름이 있을 경우 해당이름 삭제하고 나머지 팀원 출력
		// 만약에 없다면 전체 팀원 출력
		System.out.println();
		System.out.print("탈퇴 시킬 팀원 : ");
		String pp = sc.next();
		for (int i = 0; i < team.size(); i++) {
			if (pp.equals(team.get(i))) {
				team.remove(pp);
				for (int k = 0; k < team.size(); k++) {
					System.out.print(team.get(k) + " ");
			}
			}
		}

	}
}
