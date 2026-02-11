package kh.java.func;

import java.util.Scanner;

public class SwitchTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("1111");
			break;
		case 2:
			System.out.println("2222");
			break;
		case 3:
			System.out.println("3333");
			break;
		default:
			System.out.println("1~3사이 숫자를 입력하세요");
			break;
		}

		/*
		 * switch(비교할 변수 or 식) { case 리터럴값 : 실행코드 break; case 리터럴값 : 실행코드 break; case
		 * 리터럴값 : 실행코드 break; }
		 */

		/*
		 * if(num ==1) { System.out.println("1111111"); }else if(num ==2) {
		 * System.out.println("222222"); }else if(num ==3) {
		 * System.out.println("3333333"); }else { System.out.println("1~3사이 숫자 입력하세요.");
		 * }
		 * 
		 * }
		 */
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("a/b/c중 1개를 입력하세요: ");
		String str = sc.next();
		char ch = str.charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("aa");
			break;
		case 'b':
			System.out.println("bb");
			break;
		case 'c':
			System.out.println("cc");
			break;
		default:
			System.out.println("a/b/c중 1개를 입력하세요");
			break;
		}

	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("a/b/c중 1개를 입력하세요: ");
		String str = sc.next();
		// switch에 문자열을 쓸수있는것은 자바 1.7버전 이상인 경우에만 가능
		switch (str) {
		case "a":
			System.out.println("aaa");
			break;
		case "b":
			System.out.println("bbb");
			break;
		case "c":
			System.out.println("ccc");
			break;

		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("11");
			break;
		case 2:
			System.out.println("22"); // break가 없어 조건이 부합해도 다음 합당 조건, break, 종료될때까지 출력이됨

		case 3:
			System.out.println("333");
			break;
		default:
			System.out.println("1~3사이 숫자를 입력하세요");
			break;
		}
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("장학금 지불시스템입니다");
		System.out.print("학점을 입력하세요(A,B,C,D,F) : ");
		String str = sc.next();
		char ch = str.charAt(0);

		switch (ch) {
		case 'A':
			int num1 = 100;

			System.out.printf("수고하셨습니다. 장학금 %d%%지급해드리겠습니다. ", num1);
			break;
		case 'B':
			int num2 = 50;
			System.out.printf("수고하셨습니다. 장학금 %d%%지급해드리겠습니다. ", num2);
			break;
		case 'C':
			System.out.println("장학금을 바라시면 좀더 열심히 해주세요.");
			break;
		case 'D':
			System.out.println("크흠........");
			break;
		case 'F':
			System.out.println("학사경고입니다.");
			break;
		default:
			System.out.println("A,B,C,D,F 중 입력하세요.");
			break;

		}

	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 달을 입력하세요 : ");
		int month = sc.nextInt();
		/*
		28일: 2월(윤년 제외)
		29일: 2월(윤년)
		30일: 4, 6, 9, 11월
		31일: 1, 3, 5, 7, 8, 10, 12월
		*/
		
		switch (month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println(month + "월달은 31일까지 있습니다.");
            break;

        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println(month + "월달은 30일까지 있습니다.");
            break;

        case 2:
            System.out.println("2월달은 28일까지 있습니다.");
            break;

        default:
            System.out.println("1월부터 12월 사이로 입력해주세요.");
			
		}
		
	}

}
