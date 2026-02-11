package kh.java.function;

import java.util.Scanner;

public class Example {
	
	public void exam1() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번 째 정수 입력 : ");
		int num1 = sc.nextInt();	

		System.out.print("두번 째 정수 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("=============결과============");

		int sum = num1 + num2;
		int minus = num1 - num2;
		int avg = num1 * num2;
		int div = num1 / num2;
		int div2 = num1 % num2; 

		System.out.printf("더하기 결과 : %d \n", sum);
		System.out.printf("빼기 결과 : %d \n", minus);
		System.out.printf("곱하기 결과 : %d \n", avg);
		System.out.printf("나누기 몫 : %d \n", div);
		System.out.printf("나누기 나머지 : %d \n", div2);
	}
	
	public void exam2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 길이 입력 : ");
		double num1 = sc.nextDouble();	

		System.out.print("세로 길이 입력 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("=============결과============");
		
		double hap = num1 * num2;
		double rou = 2*(num1 + num2);
		
		System.out.printf("면적 : %.2f \n", hap);
		System.out.printf("둘레 : %.1f \n", rou);
	}
	
	public void exam3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영어단어 입력 : ");
		String text1 = sc.next();
		
		char data1 = text1.charAt(0);
		char data2 = text1.charAt(1);
		char data3 = text1.charAt(2);
		
		System.out.println("첫번째 문자 : " +data1);
		System.out.println("두번째 문자 : " +data2);
		System.out.println("세번째 문자 : " +data3);
	}

}
