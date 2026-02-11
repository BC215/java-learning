package kh.java.test7;

import java.util.Scanner;

public class CalcFront {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + "번째 번호 입력 : ");
			arr[i] = sc.nextInt();
		}
		// CalcTest calc = new CalcTest();
		// CalcImpl calc = new CalcImpl();
		Calc calc = new CalcImpl();

		int result = calc.sum(arr);
		System.out.println("더한결과 : " + result);
	}
}
