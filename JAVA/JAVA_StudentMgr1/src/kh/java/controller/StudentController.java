package kh.java.controller;

import java.util.Scanner;

public class StudentController {
	// 학생 최대 10명 정보를 관리하는 프로그램
	// 각 학생은 이름(String),나이(int),주소(String) 정보를 가지고 있음
	// 1) 동명이인은없음 / 2) 입력값은 정상
	// 각 정보를 10개씩 관리할 배열 생성
	String[] names;
	int[] ages;
	String[] addrs;
	// 1)학생정보를 새로 입력받으면 배열에 몇번째에 넣을지 기억하고있는 변수
	// 2 현재 저장된 학생의수
	int index;
	// 키보드 값을 입력받기 위한 스캐너
	Scanner sc;

	// 기본생성자를 만들어서 전역변수의 초기값을 세팅
	public StudentController() {
		names = new String[10];
		ages = new int[10];
		addrs = new String[10];
		index = 0;
		sc = new Scanner(System.in);

	}

	// 메인메뉴를 진행하는 메소드
	public void main() {
		while (true) {
			System.out.println("\n---------- 학생 관리 프로그램 v1 ----------");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 정보 출력(현재 저장된 모든학생정보 출력)");
			System.out.println("3. 학생 정보 출력(이름을 입력받아서 일치하는 1명)");
			System.out.println("4. 학생 정보 수정(이름을 입력받아서 일치하는 1명)");
			System.out.println("5. 학생 정보 삭제(이름을 입력받아서 일치하는 1명)");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				printOneStudent();
				break;
			case 4:
				upadateStudent();
				break;
			case 5:
				deletStudent();
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}// switch 종료
		} // while종료
	}// main()종료

	// 학생정보를 입력받아서 배열에 저장하는 메소드
	public void insertStudent() {
		System.out.println("\n---------- 학생 정보 등록 ----------");
		// 등록할 학생 정보를 입력받음
		sc.nextLine(); // 버퍼비우기
		System.out.print("등록 할 학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("등록 할 학생 나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("등록 할 학생 주소 입력 : ");
		String addr = sc.nextLine();
		// 입력받은 정보를 각 배열에 저장
		names[index] = name;
		ages[index] = age;
		addrs[index] = addr;
		// 학생 1명정보를모두 배열에 저장 > index 변수는 다음 위치로 변경
		index++;
		System.out.println("정보 등록 완료!!");
	}// insertStudent()종료

	// 저장된 모든 학생 정보를 출력하는 메소드
	public void printAllStudent() {
		System.out.println("\n---------- 전체 학생 정보 출력 ----------");
		System.out.println("이름\t나이\t주소");
		for (int i = 0; i < index; i++) {
			String name = names[i];
			int age = ages[i];
			String addr = addrs[i];
			System.out.println(name + "\t" + age + "\t" + addr);
		}
	}// printAllstudet 종료

	// 이름을 입력받아서 이름과 일치히는 학생의 정보를 출력하는 메소드
	public void printOneStudent() {
		System.out.println("\n---------- 학생 정보 출력(1명) ----------\n");
		System.out.print("조회 할 학생 이름 입력: ");
		String name = sc.next();
		// 이름이 저장되어있는 배열은 names 배열 -> 입력받은 이름이 names 배열 몇번째에 있는지 조회
		// -> 몇번째 인지 알아야 나이,주소를 찾을수 있기 때문
		int searchIndex = -1; // 조회가 안됐을때의 값으로 처음 초기화
		for (int i = 0; i < index; i++) {
			if (name.equals(names[i])) {
				searchIndex = i;
				break; // 동명이인이 없으므로 같은 이름을 찾으면 이름을 검사하는 반복문 종료

			}
		}
		if (searchIndex == -1) {
			System.out.println("학생 정보를 조회할 수 없습니다");
		} else {
			System.out.println("이름 : " + names[searchIndex]);
			System.out.println("나이 : " + ages[searchIndex]);
			System.out.println("주소 : " + addrs[searchIndex]);
		}

	}// printOneStudent()종료

	// 학생이름을 입력받아서 해당 학생이 있으면, 이름,나이,주소를 추가로 입력받아서 정보를 수정하는 메소드

	public void upadateStudent() {
		System.out.println("\n---------- 학생 정보 수정 ----------\n");
		System.out.print("수정 할 학생 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			System.out.println("학생 정보를 찾을 수 없습니다");

		} else {
			System.out.print("수정할 이름 입력: ");
			String newName = sc.next();
			System.out.print("수정할 나이 입력: ");
			int newAge = sc.nextInt();
			System.out.print("수정할 주소 입력: ");
			String newAddr = sc.nextLine();
			names[searchIndex] = newName;
			ages[searchIndex] = newAge;
			addrs[searchIndex] = newAddr;
			System.out.println("정보수정 완료");
		}

	}// upadateStudent()종료

	// 학생이름을 입력 받아서 입력받은 학생 정보를 삭제하는 메소드

	public void deletStudent() {
		System.out.println("\n---------- 학생 정보 삭제 ----------\n");
		System.out.print("삭제 할 학생 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);
		if (searchIndex == -1) {
			System.out.println("학생 정보를 찾을 수 없습니다");
		} else {
			// 해당위치의 데이터를 그냥 삭제하면 중간에 빈칸이 발생 -> 신규추가, 전체출력 , 조회 등에 문제 발생
			// -> 데이터를 삭제하면 해당 칸의 데이터 이후의 값들을 하나씩 당겨서 빈칸이 없이 데이터가 채워지게
			for (int i = searchIndex; i < index - 1; i++) {
				names[i] = names[i + 1];
				ages[i] = ages[i + 1];
				addrs[i] = addrs[i + 1];
			}
			names[index - 1] = null;
			ages[index - 1] = 0;
			addrs[index - 1] = null;
			index--;
			System.out.println("삭제 완료!!");
		}

	}// deletStudent()종료

	// 매개변수로 받은 이름이 names 배열에 몇번째 있는지 리턴하는 메소드
	// 단 학생이름이 names 배열에 존재하지 않으면 -1 을 리턴

	public int searchStudent(String name) {
		int serchIndex = -1;
		for (int i = 0; i < index; i++) {
			if (name.equals(names[i])) {
				serchIndex = i;
				break;

			}
		}
		return serchIndex;
	}// serchStudent()종료
}
