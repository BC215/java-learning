package kh.java.func;

import java.util.Scanner;

public class LoopTest {
	public void test1() {
		// for를 이용한 무한반복 -> 초기,조건,증감을 모두 비워두면 무한반복
		for (;;) {
			System.out.println("무한히 반복 될 실행코드");
		}
	}

	public void test2() {
		// while을 이용한 무한반복 -> while의 조건식이 항상 true가 나올수 있게 처리
		while (true) {
			System.out.println("반복");
		}
		// system.out.println("반복"); 아래에 입력시 오류 발생(문법에는 문제가 없음) , 무한 반복문 이후에 코드를 작성하면 해당
		// 코드에 도달할수 없다는 에러가 발생.

	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 번호 입력 : ");
			int num = sc.nextInt();
			if (num == 1) {
				break;
				// 여기에 출력구문 넣으면 오류남(코드 도달 불가와 동일문구)
			} else if (num == 2) {
				continue;
			} else {
				System.out.println("입력한 숫자는 : " + num);
			}
			System.out.println("반복문이 종료되면 출력되는 구문");
		}
		System.out.println("반복문이 종료되면 출력되는 구문");
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------카카오톡------------");
			System.out.println("1.친구목록");
			System.out.println("2.채팅목록");
			System.out.println("3.오픈채팅");
			System.out.println("4.쇼핑");
			System.out.println("5.종료");
			System.out.print("선택>>");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("내가 먼 미래에는 여기에 친구목록을 띄울 수 있겠지?");
			} else if (select == 2) {
				System.out.println("사용자 대화 목록이 출력될 예정");
			} else if (select == 3) {
				System.out.println("내가 참여하고 있는 오픈채팅 목록이 나올 예정");
			} else if (select == 4) {
				System.out.println("쇼핑페이지가 나올 예정");
			} else if (select == 5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		boolean power = true;
		while (power) {
			System.out.println("-------------카카오톡v2------------");
			System.out.println("1.친구목록");
			System.out.println("2.채팅목록");
			System.out.println("3.오픈채팅");
			System.out.println("4.쇼핑");
			System.out.println("5.종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("친구목록!!");
				break;
			case 2:
				System.out.println("채팅목록!!");
				break;
			case 3:
				System.out.println("오픈채팅!!");
				break;
			case 4:
				System.out.println("쇼핑목록!!");
				break;
			case 5:
				System.out.println("시스템을 종료합니다");
				power = false;
				break;

			}// switch 종료지점
		} // while 종료지점
	}// method 종료지점

	public void test6() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i + "_반복문 1-1");
			for (int j = 0; j < 3; j++) {
				System.out.println(j + "_반복문 2");
			}
			System.out.println(i + "_반복문 1-2");
		}
	}

	public void test7() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++) {
				System.out.println("i : " + i + " / j : " + j);
			}
	}

	public void test8() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i * j);
			}
			System.out.println();

		}
		/*
		 * for (int i = 1; i < 9; i++) { System.out.printf("%d * %d = %d\t", 2, i, 2i);
		 * } System.out.println();
		 * 
		 * for (int i = 1; i < 9; i++) { System.out.printf("%d * %d = %d\t", 3, i, 3 *
		 * i); } System.out.println();
		 * 
		 * for(int i = 1; i < 9; i++) { System.out.printf("%d * %d = %d\t", 4, i, 4*i);
		 * }
		 */
	}

	public void exam1() {
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%d*%d=%d\t", i, j, i * j);
			}
			System.out.println();
		}
	}

	public void star1() {
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
	}

	public void star2() {
		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
	}

	public void star3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void star4() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	public void star5() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(12345);
			System.out.println();
		}
	}

	public void star6() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}
	}

	public void star7() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}

	}

	public void star8() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star9() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star10() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public void star11() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 1 + i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star12() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void star13() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void star16() {
		int star = 1;
		int space = 4;
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			System.out.println();
			star += 2;
			space--;
		}
	}

	public void star17() {
		int star = 9;
		int space = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			System.out.println();
			space++;
			star -= 2;
		}

	}

	public void star18() {
		int star = 1;
		int space = 4;
		int starr = 9;
		int spacee = 0;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			System.out.println();
			star += 2;
			space--;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < spacee; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < starr; j++) {
				System.out.print("*");
			}

			System.out.println();
			spacee++;
			starr -= 2;
		}
	}
	
	public void star19() {
		int star = 1;
		int space = 4;
		int starr = 9;
		int spacee = 0;

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			System.out.println();
			star += 2;
			space--;
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < spacee; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < starr; j++) {
				System.out.print("*");
			}

			System.out.println();
			spacee++;
			starr -= 2;
		}
	}
	
}