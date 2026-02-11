package kh.java.func;

import java.util.Random;
import java.util.Scanner;

public class Index {
	public void test1() {
		Scanner sc = new Scanner(System.in);

		String[] fruits = { "딸기", "복숭아", "키위", "사과", "바나나" };

		System.out.println("1-1. 바나나 출력: " + fruits[4]);

		System.out.println("1-2. for문 없이 전체 출력");
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);

		System.out.println("1-3. for문으로 전체 출력");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[100];

		// 1~100까지 값 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);

		int[] score = new int[4];

		System.out.print("국어 점수 입력: ");
		score[0] = sc.nextInt();

		System.out.print("영어 점수 입력: ");
		score[1] = sc.nextInt();

		System.out.print("수학 점수 입력: ");
		score[2] = sc.nextInt();

		score[3] = score[0] + score[1] + score[2];

		double avg = score[3] / 3.0;

		System.out.println("국어 점수: " + score[0]);
		System.out.println("영어 점수: " + score[1]);
		System.out.println("수학 점수: " + score[2]);
		System.out.println("합계: " + score[3]);
		System.out.printf("평균: %.2f\n", avg);

	}

	public void test4() {

		Scanner sc = new Scanner(System.in);
		// 1.길이가 5인 정수형 배열 선언
		int[] arr = new int[5];
		// 2. 반복문을 이용해서 숫자 5개를 입력
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 숫자 입력: ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		/*
		 * for (int i = 0; i < arr.length - 1; i++) { if (arr[i] > arr[i + 1]) { int tmp
		 * = arr[i]; arr[i] = arr[i + 1]; arr[i + 1] = tmp;
		 * 
		 * }
		 */
		// 3. 오름차순 정렬(버블정렬)
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		// 1) 배열의 첫번째 칸에있는 숫자와 두번째 칸에 있는 숫자를 비교해서 첫번째 칸의 숫자가 더크면(tmp) 두 수의 자리를 교환

		/*
		 * if(arr[0] > arr[1]) { int tmp = arr[0]; arr[0] = arr[1]; arr[1] = tmp;
		 * 
		 * } //2) 배열의 두번째 칸에 있는 숫자와 세번쨰 칸에있는 숫자를 비교해서 두번째 칸의 숫자가 더크면 두수의 자리를 교환
		 * if(arr[1] > arr[2]) { int tmp = arr[1]; arr[1] = arr[2]; arr[2] = tmp; }
		 * if(arr[2] > arr[3]) { int tmp = arr[2]; arr[2] = arr[3]; arr[3] = tmp; }
		 * if(arr[3] > arr[4]) { int tmp = arr[3]; arr[3] = arr[4]; arr[4] = tmp; }
		 * if(arr[4] > arr[5]) { int tmp = arr[4]; arr[4] = arr[5]; arr[5] = tmp; }
		 */
		// for문으로 작성시
		/*
		 * if (arr[i] > arr[i + 1]) { int tmp = arr[i]; arr[i] = arr[i + 1]; arr[i + 1]
		 * = tmp;
		 */
		// 4. 배열에 있는 숫자 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i] + "\t");
		}

	}

	public void lotto() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int[] user = new int[6];
		int[] com = new int[6];

		System.out.println("====== 로또 ======");

		// 1. 사용자 번호 입력칸 만들기
		for (int i = 0; i < 6; i++) {
			while (true) {
				System.out.print((i + 1) + "번째 번호 입력(1~45) : ");
				int num = sc.nextInt();

				// 1)입력한 숫자가 1~45 사이의 숫자여야함
				// 2)입력 숫자는 중복X
				// 두 조건중 입력숫자가 정상밤위인 경우 중복 체크하는 순서
				// 배열에는 제약조건에 맞는 숫자만 넣을 예정으로 입력한숫자가 정상범위가 아니면 중복검사결과는 무조건 중복이 아니라 고 나옴.

				if (num < 1 || num > 45) {
					System.out.println("1~45 사이 숫자만 입력하세요.");
					continue;
				}

				boolean di = false;
				for (int j = 0; j < i; j++) {
					if (user[j] == num) {
						di = true;
						break;
					}
				}

				if (di) {
					System.out.println("중복된 숫자입니다.");
				} else {
					user[i] = num;
					break;
				}
			}
		}

		// 2. 컴퓨터 번호 만들기(for while)
		for (int i = 0; i < 6; i++) {
			while (true) {
				int num = rand.nextInt(45) + 1;

				boolean di = false;
				for (int j = 0; j < i; j++) {
					if (com[j] == num) {
						di = true;
						break;
					}
				}

				if (di) {
					com[i] = num;
					break;
				}
			}
		}

		// 3. 사용자 번호 출력하기 (for)
		System.out.print("사용자 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(user[i] + " ");
		}
		System.out.println();

		// 4. 컴퓨터 번호 출력문(for)
		System.out.print("컴퓨터 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();

		// 5. 맞은 개수 계산하기(count)
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (user[i] == com[j]) {
					count++;
				}
			}
		}

		System.out.println("맞은 개수 : " + count);
	}

}
