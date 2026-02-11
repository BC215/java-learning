package kj.java.test1;

import java.util.Scanner;

public class MethodTest1 {
	public void test1() {
		System.out.println("test1");

	}

	// 메소드의 접근제어지시자를 생략하면 default
	void test2() {
		System.out.println("test2");
		// 같은 클래스 내부의 메소드를 호출 할 때는 별명없이 바로 메소드이름 호출
		// test2();
		// test3();
	}

	public void sample1() {
		MethodTest1 mTest1 = new MethodTest1();

	}

	private void test3() {
		System.out.println("test3");

	}

	public void test4() {
		System.out.println("메소드 테스트4");
		int data = test5();
		System.out.println(data);
		return;
	}

	// 반환형에 자료형을 입력하면 메소드 수행하고나면 해당 자료형을 되돌려주겠다 라는 명시함.
	public int test5() {
		System.out.println("메소드 테스트 5");
		return 1000;
		// return 데이터; 작성한 데이터를 되돌려주면서 그순간 메소드를 종료

	}

	public int test6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			return num;
		}
		return -1; // void 일때만 생략가능
		/*
		 * if (num % 2 == 0) { return num; } else { return -1;
		 */
	}

	public String test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}

	}

	public void test8() {
		System.out.println("test8");

		Scanner sc = new Scanner(System.in);
		// System.err.print("정수를 입력하세요 : ");
		// int num = sc.nextInt();
		// test9(num);
		test9(100);
		test9(500);
		test10(1000, 2000);
		test10(2000, 1000);
		int num1 = 3333;
		int num2 = 777;
		test10(num1, num2);
		System.out.println("*-----------------------*");
		test10(num2, num1);
		test11(100, "hi");
		// test11("hi", 100);//메소드의 매겨변수는 순서에 맞춰서 줘야함

	}

	public void test9(int num) {
		int data = num * 2;
		System.out.println(data);
	}

	public void test10(int num1, int num2) {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}

	public void test11(int num, String str) {
		System.out.println("num : " + num);
		System.out.println("str : " + str);

	}

	public void test12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int sum1 = num1 + num2;

		System.out.println("결과는 : " + sum1);

		System.out.print("세번쨰 정수 입력 : ");
		int num3 = sc.nextInt();
		System.out.print("네번째 정수 입력 : ");
		int num4 = sc.nextInt();

		// int sum2 = num3 + num4;
		// System.out.println("결과는 : " + sum2);
		sum2(num3, num4);
	}

	public int sum(int su1, int su2) {
		int result = su1 + su2; // 빅데이터, 머신러닝 , ai 분석등 다용도로 사용됨
		return result;
	}

	public void sum2(int su1, int su2) {
		int result = su1 + su2;
		System.out.println("결과는 : " + result);

	}

	public void test13() {
		int num = 100;
		test14(num);
		System.out.println("test13 : " + num);
	}

	public void test14(int num) {
		num += 100;
		System.out.println("test14 : " + num);
	}

	public void test15() {
		int[] arr = { 1, 2, 3 };
		test16(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public void test16(int[] arr) {
		arr[1] = 200;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public void test17() {
		int[] arr = { 1, 2, 3 };
		test18(arr[1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	public void test18(int num) {
		num = 200;
		System.out.println(num);
	}

	public void test19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 입력 : ");
		int num3 = sc.nextInt();
		int data1 = add(num1, num2);
		System.out.println("두 수의 합은 : " + data1);
		// int data2 = add(num1, num2, num3);
		// System.out.println("세 수의 합은 : " + data1);
		add(100, 200);
		add(100, 200, 300);
	}

	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public int add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		return result;
	}

	public void sampletest() {
		sample(10, 30);
		sample();
		sample(10);
		sample("hi");
		sample("10", 10);
		sample(10, "10");
	}

	/*
	 * public void sample(int su1, int su1) { -> 오버로딩 불가 / 아래 num과 구분이 어려움 / 성립불가 }
	 * public int sample(int num1, int num2) -> 동일하게 성립불가로 사용불가함. //오버로딩시 매개변수는
	 * 타입,순서가 달라야함 -> 리턴타입은 오버로딩에 영향을 줄수없음 매개변수의 이름은 구분하는 요소가 될수 없음
	 */
	public void sample(int num1, int num2) {

	}

	public void sample() {

	}

	public void sample(int num) {

	}

	public void sample(String str) {

	}

	public void sample(int nun, String str) {

	}

	public void sample(String str, int num) {

	}
}
