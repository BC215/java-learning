package kh.java.func;

import java.util.Scanner;

public class ArrayTest {
	public void test1() {
		int num1 = 100;
		System.out.println("num1 : " + num1);
		int num2 = num1;
		System.out.println("num2 : " + num2);
		num2 = 100;
		System.out.println("num2 : " + num2);
		System.out.println("num1 : " + num1);

		int[] arr1 = { 1, 2, 3, 4, 5 };
		System.out.println("arr1 출력");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " "); // 1 2 3 4 5
		}
		System.out.println();

		int[] arr2 = arr1;
		System.out.println("arr2 출력");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i] + " ");// 1 2 3 4 5
		}
		System.out.println();
	}

	public void test2() {
		int[] arr1 = { 1, 2, 3, 4, 5 };

		// 1) 개발자가 소스코드로 구현 (깊은 복사)
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("arr1 출력");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " "); // arr1[1] -> arr1[i]로 수정
		}
		System.out.println("\narr2 출력"); // 줄바꿈 추가
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

	public void test3() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// System.arraycopy사용( 배열의 일부만 복사하고 싶을떄 주로사용)
		int[] arr2 = new int[arr1.length];// 데이터를 복사해서 저장할 배열
		// System.arraycopy(5개 데이터 전달)
		/*
		 * 1.데이터가 복사될 배열의 주소(arr1) 2.배열의 데이터 중 복사를 시작하고 싶은 인덱스 번호(arr1배열중 복사를 시작할 인덱스번호)
		 * 3. 데이터를 복사해서 저장할 배열의 주소(arr2) 4.데이터를 복사해서 저장할 배열의 시작 인덱스번호 (arr2배열중 복사를
		 * 시작할인덱스 번호) 복사할 데이터 길이
		 */
		System.arraycopy(arr1, 1, arr2, 2, 3);
		System.out.println("arr1 출력");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\narr2 출력"); // 줄바꿈 추가
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		// 3. 같은길이와 데이터로 전체를 깊은복사 하고싶을때 사용
		int[] arr3 = arr1.clone();
		System.out.println("\n arr3 출력"); // 줄바꿈 추가
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
			System.out.println();

		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String str1 = sc.next();
		System.out.print("문자열을 입력하세요 : ");
		String str2 = sc.next();
		// 문자열은 비교연산자로는 같은지 체크할수 없음
		// 같은지 체크하는 방법 문자열1.equals(문자열2) / 문자열2.equals(문자열 1번)
		// -> boolean 데이터로 결과를 제공 받음(true면 같음, false면 다름)
		if (str1.equals(str2)) {
			System.out.println("입력한 두 문자열이 같습니다");
		} else {
			System.out.println("입력한 두 문자열이 다릅니다");

		}
	}

	public void test5() {
		// 2차원 배열 -> 배열 내부의 자료형이 배열인 형태의 데이터
		// 2차원 배열 선언 -> 자료형[][] 변수이름 = new 자료형[행의길이][열의길이];
		int[][] arr = new int[2][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		for (int i = 0; i < arr.length; i++) { // arr.lenght -> 행의 길이를 구함
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void test6() {
		// 가변배열 -> 2차원 배열의 한 종류
		// -> 일반 2차원 배열과의 차이점은 각 행별로 사용할 수 있는 열의 수가 다름
		// -> 2차원 배열은 실제로는 배열들을 배열로 관리하는 형태 -> 관리되는 가배열의 길이가 다른 상태
		// 가변배열은 최초 배열 생성시 행의길이만 입력하고 열의 길이는 입력X
		int[][] arr = new int[3][];
		arr[0] = new int[5];
		arr[1] = new int[2];
		arr[2] = new int[3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[2][0] = 8;
		arr[2][1] = 9;
		arr[2][2] = 10;

		for (int i = 0; i < arr.length; i++) { // arr.lenght -> 행의 길이를 구함
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
