package kh.java.func;

import java.util.Scanner;

public class ForTest {
	public void test1() {

		/*
		 * for문 사용방법 for(초기값 설정 ; 조건식 ; 조건변화를 위한 증감수식) { 실행코드; } 초기값설정 : 반복 횟수를 조절하기위한
		 * 변수 선언 및 초기화 작업 조건식 : 반복문의 수행여부를 결정하는 조건식 (최종적으로 boolean형 데이터로 연산이 끝나야함 / true
		 * ->코드실행 false-> for문 종료 조건변화를 위한 증감수식 : 초기값에서 사용하는 변수를 조작해서 조건식을 이용해 횟수를 조절하기
		 * 위한 증가/감소구문
		 */
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hi");
		}
		for (int i = 3; i >= 1; i--) {
			System.out.println("Hiiii");
		}
		int data = 0;
		System.out.println("data : " + data);
		for (data = 1; data <= 3; data++) {
			System.out.println("[for문 내부] data : " + data);
		}
		System.out.println("data : " + data);

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			System.out.println("test");
		}
		// System.out.println(i); -> for문 밖으로 나오면 데이터 사라짐
	}

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("안녕하세요");
		}
	}


		
		public void exam2() {
			Scanner sc = new Scanner(System.in);
			System.out.print("몇번 출력하시겠습니까? : ");
			int hi = sc.nextInt();
			for (int i = 0; i < hi; i++) {
				System.out.println("안녕하세요");
		}
	}

	public void exam3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("2단입니다.");
		for (int i = 1; i <= 9; i++) {
			int i1 = 2 * i;
			System.out.printf("2 * %d = %d\n", i, i1);
		}
	}

	public void exam4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇단을 출력하시겠습니까? : ");
		int num = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			int i1 = num * i;
			System.out.printf("%d * %d = %d\n",num, i, i1);
		}
	}
	public void exam5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;                                                                                                                                                                                                                                                                     
		for(int i = 0; i <5; i++) {
			System.out.print("정수값을 입력하시오 : ");
			int num = sc.nextInt();
			sum += num;
			
		}
		System.out.printf("입력한 5개의 정수의합 : %d ",+sum);
	}
	
	public void exam6() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		 for (int i = num1; i <= num2; i++) {
		        sum += i;
		    }

		 System.out.printf("%d ~ %d의 정수의 합 : %d", num1, num2, sum);
	}
	
	public void exam7() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자입력 : ");
		int num1 = sc.nextInt();
		for(int i= 0; i<=num1; i++) {
			if(i%2 ==0) {
				sum += i;
			}
		} 
		System.out.printf("짝수들의 합은 : %d",sum);
	}
	

}
