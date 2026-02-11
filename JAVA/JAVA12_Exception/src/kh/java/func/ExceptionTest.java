package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void test7() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("정수를 입력하세요 : ");
			int num1 = sc.nextInt();
			System.out.print("정수를 입력하세요: ");
			int num2 = sc.nextInt();

			if (num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
				return;
			}
			int result = num1 / num2;
			System.out.println("결과: " + result);

		} catch (InputMismatchException e) {
			System.out.println("잘못입력하셨습니다.");
		} finally {
			System.out.println("자원을 반환하는 코드");
			// 실제 프로젝트에서는 여기서 sc.close()를 호출하여 자원을 닫는 것이 좋습니다.
		}
	}

	public void test8() throws FileNotFoundException {
		// checked exception은 예외처리르 반드시 해야함
		// 예외처리 방식 2가지

		// 1)try ~ catch 문으로 직접 예외처리하는법
		// 2) throws를 이용해서 예외던짐(내가 직접 예외처리)
		FileInputStream fis = new FileInputStream("test.txt");
	}

	public void test9() throws FileNotFoundException {
		// 소스코드
		test8();
	}

	public void test10() {
		try {
			test9();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
