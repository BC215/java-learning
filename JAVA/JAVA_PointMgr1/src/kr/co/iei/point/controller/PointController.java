package kr.co.iei.point.controller;

import java.util.Scanner;

import kr.co.iei.point.vo.Silver;

public class PointController {
	Silver[] members;// 기억
	Scanner sc; // 키보드값
	int index; // 저장

	public PointController() {
		members = new Silver[10]; // 10명을 관리하는 프로그램
		sc = new Scanner(System.in);
		index = 0;
	}

	public void main() {
		while (true) {
			System.out.println("---------- 포인트 관리 프로그램v1 ----------");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 조회");
			System.out.println("3. 회원 1명 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				insertMember();
				break;
			case 2:
				printAllMember();
				break;
			case 3:
				printOneMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				// deleteMember();
				break;
			case 0:
				return; // 프로그램 종료
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}

	public void insertMember() {
		System.out.println("---------- 회원 정보 등록 ----------");
		System.out.print("등록 할 회원 등급 입력 : ");
		String grade = sc.next();
		System.out.print("등록 할 회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("등록 할 회원 포인트 입력 : ");
		int point = sc.nextInt();

		Silver s = new Silver(grade, name, point);
		members[index] = s;
		index++;
		System.out.println("회원 정보 등록 완료!");
	}

	public void printAllMember() {
		System.out.println("---------- 전체 회원 정보 출력 ----------");
		System.out.println("등급\t\t이름\t\t포인트\t보너스");
		for (int i = 0; i < index; i++) {
			Silver s = members[i];
			System.out.println(s.getGrade() + "\t" + s.getName() + "\t" + "\t" + s.getPoint() + "\t" + s.getBonus());
		}
	}

	public void printOneMember() {
		System.out.println("---------- 회원 정보 조회 ----------");
		System.out.print("조회 할 회원 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember(name);

		if (searchIndex == -1) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
		} else {
			Silver s = members[searchIndex];
			System.out.println("회원 등급 : " + s.getGrade());
			System.out.println("회원 이름 : " + s.getName());
			System.out.println("회원 포인트 : " + s.getPoint());
			System.out.println("회원 보너스 : " + s.getBonus());
		}
	}

	public void updateMember() {
		System.out.println("---------- 회원 정보 수정 ----------");
		System.out.print("정보를 수정할 회원의 현재 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchMember(name);

		if (searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		} else {
			// 1. 새로운 정보 입력
			System.out.print("변경 할 새 이름 입력 : ");
			String newName = sc.next();
			System.out.print("변경 할 새 등급 입력 : ");
			String newGrade = sc.next();
			System.out.print("변경 할 새 포인트 입력 : ");
			int newPoint = sc.nextInt();

			// 2. setter를 이용해 해당 인덱스의 정보 변경
			members[searchIndex].setName(newName);
			members[searchIndex].setGrade(newGrade);
			members[searchIndex].setPoint(newPoint);

			System.out.println("회원 정보 수정 완료!");
		}
	}

	public int searchMember(String name) {
		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}