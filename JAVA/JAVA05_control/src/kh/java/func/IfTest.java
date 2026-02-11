package kh.java.func;

import java.net.SecureCacheResponse;
import java.util.Scanner;

public class IfTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 10을 입력하세요 : ");
		int num = sc.nextInt();

		/*
		 * if(논리형 데이터 or 조건식) { 논리형 데이터 or 조건식의 결과가 true면 실행 될 코드(false면 실행되지않음) }
		 */
		if (num == 10) {
			System.out.println("참 잘했어요.");

		}
		System.out.println("끝!");

	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========숫자 구별 프로그램===========");
		System.out.print("임의의 정수를 입력 하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("당신이 입력한 수 " + num + "은(는) 양수입니다.");
		}

		if (num == 0) {
			System.out.println("당신이 입력한 수 " + num + "은(는) 0입니다.");
		}

		if (num < 0) {
			System.out.println("당신이 입력한 수 " + num + "은(는) 음수입니다.");

		}

	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========두수 비교 프로그램===========");

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.printf("%d>%d \n첫번쨰 수가 더 큽니다. \n", num1, num2);
		}
		if (num1 == num2) {
			System.out.printf("%d=%d \n두 수가 같습니다. \n", num1, num2);
		}

		if (num1 < num2) {
			System.out.printf("%d<%d \n두번째 수가 더큽니다. \n", num1, num2);
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========계산기 프로그램===========");

		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		String operString = sc.next();
		char ch = operString.charAt(0);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		// int sum = num1 + num2;
		// int miner = num1 - num2;
		// int mul = num1 * num2;
		if (ch == '+') {
			System.out.printf("%d%c%d=%d \n", num1, ch, num2, num1 + num2);
		}
		if (ch == '-') {
			System.out.printf("%d%c%d=%d \n", num1, ch, num2, num1 - num2);
		}
		if (ch == '*') {
			System.out.printf("%d%c%d=%d \n", num1, ch, num2, num1 * num2);
		}
		if (ch == '/') {
			System.out.printf("%d%c%d=%.5f \n", num1, ch, num2, (double) num1 / num2);
		}
	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력한 정수가 홀수/짝수 인자(삼항연산자X -> if를 이용해서 처리)
		// 짝수 판별방법 -> 숫자를 2로 나눴을 떄 나머지가 0이면 짝수 나머지가 1이면 홀수 or 0이 아니면 홀수 -> 0 !=0
		if (num % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		if (num % 2 == 1) {
			System.out.println("홀수 입니다.");

			// else{
			// System.out.println("홀수 입니다."); -> 양자 택일인경우(경우의수가 2개인경우만)
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		int adultprice = 15000;
		int kidsprice = 5000;
		System.out.println("===========놀이공원 프로그램===========");
		System.out.print("입장하실 총 인원은 몇명입니까 : ");
		int num = sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 " + adultprice + "원) : ");
		int num1 = sc.nextInt();
		System.out.print("아이는 몇명입니까?(1인당 " + kidsprice + "5000원) : ");
		int num2 = sc.nextInt();

		int sum = (num1 * adultprice) + (num2 * kidsprice);
		int sub = num1 + num2;
		if (num == sub) {
			System.out.printf("지불하실 총 금액은 %d원 입니다.", sum);
		} else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}

	public void test7() {
		Scanner sc = new Scanner(System.in);
		int count = 0; // 정답갯수를 세기위한 변수

		System.out.println("===========퀴즈 프로그램===========");

		System.out.println("첫번째 퀴즈");
		System.out.print("사과는 영어로 무엇일까요(1.apple, 2.스티브잡스)? : ");
		int ok = sc.nextInt();

		if (ok == 1) {
			System.out.println("정답!!");
			count++;
		} else {
			System.out.println("땡!!");

		}

		System.out.println("두번째 퀴즈");
		System.out.print("바나나는 길어 길으면 기차 기차는(1.비싸, 2.빨라)? : ");
		int ok1 = sc.nextInt();

		if (ok1 == 2) {
			System.out.println("정답!!");
			count++;
		} else {
			System.out.println("땡!!");

		}

		System.out.printf("총 %d 문제를 맞췄습니다.", count);
	}

	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========심리테스트===========");
		System.out.print("당신은 술을 좋아하십니까(1.yes, 2.no)? : ");
		int en1 = sc.nextInt();

		if (en1 == 1) {
			System.out.print("당신은 담배를 피웁니까(1.yes, 2.no)? : ");
			int en2 = sc.nextInt();
			if (en2 == 1) {
				System.out.println("담배는 건강에 좋지 않습니다.");
			} else {
				System.out.println("술은 간에 좋지 않습니다.");
			}
		} else {
			System.out.print("당신은 이성친구가 있습니까(1.yes, 2.no)? : ");
			int en3 = sc.nextInt();
			if (en3 == 1) {
				System.out.println("올..ㅋ");
			} else {
				System.out.println("힘내요 ㅠㅠ");
			}
		}
	}
	
	public void test9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num ==1) {
			System.out.println("1을 입력하셨군요!!");
		} else if(num ==2) {
			System.out.println("2을 입력하셨군요??");
		} else if(num ==3) {
			System.out.println("3을 입력하셨군요??!!");
		} else {
			System.out.println("1~3 사이 정수를 입력하세요.");
		}
	
		
		
	}
	
	public void test10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 1000) {
			System.out.println("10보다 큰 수 입니다.");
		}
		else if(num > 100) {
			System.out.println("100보다 큰 수 입니다.");
		}
		else if(num > 10) {
			System.out.println("1000보다 큰 수 입니다.");
		}
	}
	public void test11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("====결과====");
		
		if (num == 0) {
	        System.out.printf("[%d]은(는) 3의 배수도 4의 배수도 아닙니다.\n",num);
	    } 
	    else if (num % 3 == 0 && num % 4 == 0) {
	        System.out.printf("[%d]은(는) 3의 배수면서 4의 배수입니다.\n",num);
	    } 
	    else if (num % 3 == 0) {
	        System.out.printf("[%d]은(는) 3의 배수입니다.\n",num);
	    } 
	    else if (num % 4 == 0) {
	        System.out.printf("[%d]은(는) 4의 배수입니다.\n",num);
	    } 
	    else {
	        System.out.printf("[%d]은(는) 3의 배수도 4의 배수도 아닙니다.\n",num);
	    }
	
	}
		
	
}