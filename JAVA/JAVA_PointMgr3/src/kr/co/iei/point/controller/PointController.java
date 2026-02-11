package kr.co.iei.point.controller;

import java.util.Scanner;

import kr.co.iei.point.vo.Gold;
import kr.co.iei.point.vo.Grade;
import kr.co.iei.point.vo.Silver;
import kr.co.iei.point.vo.Vip;

public class PointController {
	// 사용할 등급이 Silver, Gold, Vip
	// Silver, Gold, Vip 모두 Grade 클래스를 상속해서 만들어진 클래스
	// 다형성을 이용하면 Silver객체, Gold객체, Vip객체 모두 Grade타입으로 저장
	// Grade 배열을 생성하면 Silver, Gold, Vip를 모두 저장할수 있는 배열이 됨
	Grade[] members;
	int index;
	Scanner sc;

	public PointController() {
		super();
		members = new Grade[30];
		sc = new Scanner(System.in);
		index = 0;

		Silver s1 = new Silver("silver", "회원1", 1000);
		Grade grade = (Grade) s1;
		members[index++] = grade;

		Silver s2 = new Silver("silver", "회원2", 2000);
		Grade grade2 = s2;
		members[index++] = grade2;
		members[index++] = new Gold("gold", "회원3", 1000);
		members[index++] = new Gold("gold", "회원4", 2000);
		members[index++] = new Vip("vip", "회원5", 1000);
		members[index++] = new Vip("vip", "회원6", 2000);
	}

	public void main() {
		while (true) {
			System.out.println("\n---------- 회원 관리 프로그램 v3 ----------\n");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 출력");
			System.out.println("3. 회원 정보 조회");
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
				searchMember();
				break;
			case 4:
				updateMember();
				break;
			case 5:
				deleteMember();
				break;
			case 0:
				return;

			}// switch종료

		} // while종료
	}// main종료

	public void insertMember() {
		System.out.println("\n---------- 회원 정보 등록 ----------\n");
		System.out.print("등록할 회원 등급 입력[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("등록할 회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("등록할 회원 포인트 입력 : ");
		int point = sc.nextInt();
		switch (grade) {
		case "silver":
			Silver silver = new Silver(grade, name, point);
			Grade gra = (Grade) silver;
			members[index] = gra; // break 위치 수정: 대입 후 break
			index++;
			break;

		case "gold":
			Gold gold = new Gold(grade, name, point);
			Grade gra2 = gold;// 업캐스팅(업캐스팅은 강제형변환을 하지 않아도 상속조건만 맞으면 자동으로 변환)
			members[index] = gra2;
			index++;
			break;

		case "vip":
			Grade vip = new Vip(grade, name, point);
			members[index] = vip;
			index++;
			break;
		}
		System.out.println("회원정보 등록완료!");
	}

	public void printAllMember() {
		System.out.println("\n---------- 전체 회원 출력 ----------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		for (int i = 0; i < index; i++) {
			// members는 Grade[] -> 배열에서 데이터를 하나 꺼내면 Grade타입
			// Grade는 객체생성을 못하고 내부에는 Silver or Gold or Vip 객체가 들어있는 상황
			// 꺼낸 데이터를 사용할때 다운캐스팅 해야하는 경우 -> Grade에는 존재하지 않고 자식에만 존재하는경우

			Grade g = members[i];

			System.out.println(g.getGrade() + "\t" + g.getName() + "\t" + g.getPoint() + "\t" + g.getBonus());

		}
	}

	public void searchMember() {
		System.out.println("\n---------- 회원 정보 조회 ----------\n");
		System.out.print("조회할 이름 입력 : ");
		String name = sc.next();

		Grade m = searchGrade(name);

		if (m == null) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		} else {
			// Grade 객체 내부의 데이터를 바로 출력
			System.out.println("등급 : " + m.getGrade());
			System.out.println("이름 : " + m.getName());
			System.out.println("포인트 : " + m.getPoint());
			System.out.println("보너스 : " + m.getBonus());
		}
	}

	private Grade searchGrade(String name) {
		for (int i = 0; i < index; i++) {
			// 배열에 저장된 객체의 이름과 입력한 이름이 일치하는지 확인
			if (members[i].getName().equals(name)) {
				return members[i]; // 일치하는 객체(Grade)를 즉시 반환
			}
		}
		return null; // 반복문이 끝날 때까지 못 찾으면 null 반환
	}

	public void updateMember() {
		System.out.println("\n---------- 회원 정보 수정 ----------\n");
		System.out.print("수정할 이름 입력 : ");
		String searchName = sc.next();

		// 수정할 회원의 인덱스 위치 확인
		int searchIndex = -1;
		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(searchName)) {
				searchIndex = i;
				break;
			}
		}

		if (searchIndex == -1) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		} else {
			System.out.print("수정할 등급 입력[silver/gold/vip] : ");
			String grade = sc.next();
			System.out.print("수정할 이름 입력 : ");
			String name = sc.next();
			System.out.print("수정할 포인트 입력 : ");
			int point = sc.nextInt();

			// 부모 타입(Grade) 변수를 선언
			Grade updateMember = null;

			switch (grade) {
			case "silver":
				updateMember = new Silver(grade, name, point);
				break;
			case "gold":
				updateMember = new Gold(grade, name, point);
				break;
			case "vip":
				updateMember = new Vip(grade, name, point);
				break;
			}

			if (updateMember != null) {
				// 찾은 인덱스 위치에 새로운 Grade(자식 객체) 대입
				members[searchIndex] = updateMember;
				System.out.println("회원 정보 수정 완료!");
			} else {
				System.out.println("등급을 잘못 입력하셨습니다.");
			}
		}
	}

	public void deleteMember() {
		System.out.println("\n---------- 회원 정보 삭제 ----------\n");
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();

		// 삭제할 회원 위치 확인
		int searchIndex = -1;
		for (int i = 0; i < index; i++) {
			if (members[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}

		if (searchIndex == -1) {
			System.out.println("삭제할 회원 정보를 찾을 수 없습니다.");
		} else {
			// 데이터를 앞으로 한 칸씩 당김
			for (int i = searchIndex; i < index - 1; i++) {
				members[i] = members[i + 1];
			}

			members[index - 1] = null;
			index--;
			System.out.println("회원 정보 삭제 완료!");
		}
	}
}
