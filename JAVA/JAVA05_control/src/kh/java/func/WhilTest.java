package kh.java.func;

import java.util.Scanner;

public class WhilTest {
	public void test1() {
		// 안녕하세요 5번 출력
		/*
		 * While(조건식){ 조건식이 true 실행되는 코드 }
		 */
		int i = 0; // while문은 값을 사전 지정해줘야함
		while (i < 5) {
			System.out.println("안녕하세요");
			i++; // 이거없으면 무한히 반복됨33
		}

		/*
		 * for(int i =0; i<5; i++) { System.out.println("안녕하세요"); }
		 */
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까? : ");
		int count = sc.nextInt();
		int i = 0;
		while (i < count) {
			System.out.println("안녕하세요");
			i++;
		}

		int j = 0;
		do {
			System.out.println("안녕");
			j++;
		} while (j < count);

	}

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2단입니다.");
		int i = 1;

		while (i <= 9) {
			System.out.println("2 x " + i + " = " + (2 * i));
			i++;
		}
	}

	public void exam2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까? : ");
		int dan = sc.nextInt();
		System.out.printf("%d단 입니다.\n", dan);
		int i = 1;
		while (i <= 9) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
			i++;
			// -> printf("%d * %d = %d\n",num,i,num*i);
			// -> i++;
		}
	}

	public void exam3() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int sum = 0;

		while (i <= 5) {
			System.out.print("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			sum += num;
			i++;
		}

		System.out.println("입력한 5개의 정수의 합 : " + sum);
	}

	// 정수 2개 입력 받고 그사이 모든 수의 합 구하기
	public void exam4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();

		int sum = 0;
		int i = num1;

		while (i <= num2) {
			sum += i;
			i++;
		}
		System.out.printf("%d ~ %d의 정수의 합 : %d", num1, num2, sum);
	}

	public void exam5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까? : ");
		int count = sc.nextInt();
		int i = 0;
		while (i < count) {
			System.out.println("안녕하세요");
			i++;
		}
	}

	public void exam6() {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (i < 5) {
			System.out.println("안녕하세요");
			i++;
		}
	}

	public void exam7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		while(i <= num) {
			if(i%2 ==0) {
				sum += i;
				i++;
			}
		}
		System.out.println("짝수들의 합은 : "+sum);
	}
}
