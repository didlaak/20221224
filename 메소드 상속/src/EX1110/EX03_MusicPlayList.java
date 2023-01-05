package EX1110;

import java.util.ArrayList;
import java.util.Scanner;

public class EX03_MusicPlayList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> ml = new ArrayList<String>();

		System.out.print("=============Music play List==========");
		System.out.println();

		while (true) {
			System.out.print("[1] 노래추가 [2] 노래조회 [3]노래 삭제 [4]종료 >> ");

			int num = sc.nextInt();
			System.out.println();

			if (num == 4) {
				System.out.print("프로그램을 종료합니다 ");
				break;
			} else if (num == 1) {
				System.out.println("=======================================");
				System.out.print("[1] 원하는 위치에 추가 [2] 마지막 위치에 추가 >>");
				int menu = sc.nextInt();

				if (menu == 1) {
					System.out.print("원하는 위치 입력 : ");
					int index = sc.nextInt();
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();

					ml.add(index - 1, title);
				} else if (menu == 2) {
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					ml.add(title);
					System.out.println("추가 되었습니다 ");

				} else {
					System.out.println("잘못 입력하셨습니다!");
				}
			} else if (num == 2) {
				System.out.println("===========현재 재생목록=========");
				if (ml.size() == 0) {
					System.out.println("재생목록이 없습니다");
				} else {
					for (int i = 0; i < ml.size(); i++) {
						System.out.println(i + 1 + "." + ml.get(i));
					}
				}
			} else if (num == 3) {
				System.out.println("============================");
				System.out.print("[1]선택 삭제 [2] 전체삭제 >> ");
				int menu = sc.nextInt();
				if (menu == 1) {
					System.out.print("삭제할 번호입력 : ");
					int index = sc.nextInt();
					ml.remove(index - 1);

				} else if (num == 2) {
					ml.clear();
					System.out.println("전체 삭제되었습니다");
				} else {
					System.out.println("잘못 입력하셨습니다");
				}
			} else {
				System.out.println("잘못된 입력입니다");
			}

		}

	}

}
