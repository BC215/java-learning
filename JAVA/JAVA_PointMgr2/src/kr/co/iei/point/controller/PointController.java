package kr.co.iei.point.controller;

import java.util.Scanner;

import kr.co.iei.point.vo.Gold;
import kr.co.iei.point.vo.SearchResult;
import kr.co.iei.point.vo.Silver;
import kr.co.iei.point.vo.Vip;

public class PointController {
	// 등급별로 회원을 나누어 저장할 배열과 인덱스
	Silver[] silvers;
	int sIndex;
	Gold[] golds;
	int gIndex;
	Vip[] vips;
	int vIndex;
	Scanner sc;

	public PointController() {
		super();
		silvers = new Silver[10];
		golds = new Gold[10];
		vips = new Vip[10];
		sIndex = 0;
		gIndex = 0;
		vIndex = 0;
		sc = new Scanner(System.in);

		Silver s1 = new Silver("silver", "회원1", 1000);
		Silver s2 = new Silver("silver", "회원2", 2000);
		Gold g1 = new Gold("gold", "회원3", 1000);
		Gold g2 = new Gold("gold", "회원4", 2000);
		Vip v1 = new Vip("vip", "회원5", 1000);
		Vip v2 = new Vip("vip", "회원6", 2000);

		silvers[sIndex++] = s1;
		silvers[sIndex++] = s2;
		golds[gIndex++] = g1;
		golds[gIndex++] = g2;
		vips[vIndex++] = v1;
		vips[vIndex++] = v2;
	}

	public void main() {
		while (true) {
			System.out.println("\n---------- 회원 관리 프로그램 v2 ----------\n");
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 전체 회원 출력");
			System.out.println("3. 회원 1명 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				inserMember();
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
			}
		}
	}

	// 1. 회원 등록
	public void inserMember() {
		System.out.println("\n---------- 회원 정보 등록 ----------\n");
		System.out.print("등록할 회원 등급 입력[silver/gold/vip] : ");
		String grade = sc.next();
		System.out.print("등록할 회원 이름 입력 : ");
		String name = sc.next();
		System.out.print("등록할 회원 포인트 입력 : ");
		int point = sc.nextInt();

		switch (grade) {
		case "silver":
			silvers[sIndex++] = new Silver(grade, name, point);
			break;
		case "gold":
			golds[gIndex++] = new Gold(grade, name, point);
			break;
		case "vip":
			vips[vIndex++] = new Vip(grade, name, point);
			break;
		}
		System.out.println("회원 정보 등록 완료");
	}

	// 2. 전체 회원 출력
	public void printAllMember() {
		System.out.println("\n---------- 전체 회원 출력 ----------\n");
		System.out.println("등급\t이름\t포인트\t보너스");
		System.out.println("-----------------------------------------------");

		for (int i = 0; i < sIndex; i++) {
			System.out.println(silvers[i].getGrade() + "\t" + silvers[i].getName() + "\t" + silvers[i].getPoint() + "\t"
					+ silvers[i].getBonus());
		}
		for (int i = 0; i < gIndex; i++) {
			System.out.println(golds[i].getGrade() + "\t" + golds[i].getName() + "\t" + golds[i].getPoint() + "\t"
					+ golds[i].getBonus());
		}
		for (int i = 0; i < vIndex; i++) {
			System.out.println(vips[i].getGrade() + "\t" + vips[i].getName() + "\t" + vips[i].getPoint() + "\t"
					+ vips[i].getBonus());
		}
	}

	// 3. 회원 1명 조회
	public void searchMember() {
		System.out.println("\n---------- 회원 1명 조회 ----------\n");
		System.out.print("조회할 이름 입력 : ");
		String name = sc.next();

		SearchResult sr = searchMember2(name);

		if (sr == null) {
			System.out.println("회원 정보를 조회할 수 없습니다.");
			return;
		}

		String grade = sr.getGrade();
		int index = sr.getIndex();

		if (grade.equals("silver")) {
			Silver s = silvers[index];
			System.out.println("등급: " + s.getGrade());
			System.out.println("이름: " + s.getName());
			System.out.println("포인트: " + s.getPoint());
			System.out.println("보너스: " + s.getBonus());
		} else if (grade.equals("gold")) {
			Gold g = golds[index];
			System.out.println("등급: " + g.getGrade());
			System.out.println("이름: " + g.getName());
			System.out.println("포인트: " + g.getPoint());
			System.out.println("보너스: " + g.getBonus());
		} else if (grade.equals("vip")) {
			Vip v = vips[index];
			System.out.println("등급: " + v.getGrade());
			System.out.println("이름: " + v.getName());
			System.out.println("포인트: " + v.getPoint());
			System.out.println("보너스: " + v.getBonus());
		}
	}

	// 4. 회원 정보 수정
	public void updateMember() {
		System.out.println("\n---------- 회원 정보 수정 ----------\n");
		System.out.print("수정할 회원 이름 입력 : ");
		String name = sc.next();

		SearchResult sr = searchMember2(name);

		if (sr == null) {
			System.out.println("회원을 찾을 수 없습니다.");
			return;
		}

		String oldGrade = sr.getGrade();
		int index = sr.getIndex();

		System.out.print("수정 이름 입력 : ");
		String newName = sc.next();

		System.out.print("수정 등급 입력 : ");
		String newGrade = sc.next();

		System.out.print("수정 포인트 입력 : ");
		int newPoint = sc.nextInt();

		// 기존 등급 삭제
		if (oldGrade.equals("silver")) {
			for (int i = index; i < sIndex - 1; i++) {
				silvers[i] = silvers[i + 1];
			}
			silvers[--sIndex] = null;

		} else if (oldGrade.equals("gold")) {
			for (int i = index; i < gIndex - 1; i++) {
				golds[i] = golds[i + 1];
			}
			golds[--gIndex] = null;

		} else if (oldGrade.equals("vip")) {
			for (int i = index; i < vIndex - 1; i++) {
				vips[i] = vips[i + 1];
			}
			vips[--vIndex] = null;
		}

		// 새 등급 적용
		if (newGrade.equals("silver")) {
			silvers[sIndex++] = new Silver(newGrade, newName, newPoint);

		} else if (newGrade.equals("gold")) {
			golds[gIndex++] = new Gold(newGrade, newName, newPoint);

		} else if (newGrade.equals("vip")) {
			vips[vIndex++] = new Vip(newGrade, newName, newPoint);
		}

		System.out.println("수정 완료");
	}

	public void deleteMember() {
		System.out.println("\n---------- 회원 정보 삭제 ----------\n");
		System.out.print("삭제할 회원 이름 입력 : ");
		String name = sc.next();

		SearchResult result = searchMember2(name);

		if (result == null) {
			System.out.println("회원 정보를 찾을 수 없습니다.");
			return;
		}

		int index = result.getIndex();

		switch (result.getGrade()) {
		case "silver":
			for (int i = index; i < sIndex - 1; i++) {
				silvers[i] = silvers[i + 1];
			}
			silvers[--sIndex] = null;
			break;

		case "gold":
			for (int i = index; i < gIndex - 1; i++) {
				golds[i] = golds[i + 1];
			}
			golds[--gIndex] = null;
			break;

		case "vip":
			for (int i = index; i < vIndex - 1; i++) {
				vips[i] = vips[i + 1];
			}
			vips[--vIndex] = null;
			break;

		default:
			System.out.println("알 수 없는 회원 등급입니다.");
			return;
		}

		System.out.println("회원 정보가 삭제되었습니다.");
	}

	public SearchResult searchMember2(String name) {
		for (int i = 0; i < sIndex; i++) {
			if (name.equals(silvers[i].getName())) {
				return new SearchResult("silver", i);
			}
		}
		for (int i = 0; i < gIndex; i++) {
			if (name.equals(golds[i].getName())) {
				return new SearchResult("gold", i);
			}
		}
		for (int i = 0; i < vIndex; i++) {
			if (name.equals(vips[i].getName())) {
				return new SearchResult("vip", i);
			}
		}
		return null;
	}

	// 보너스 점수 수정하기?
	private int newBonus(String grade, int point) {
		if (grade.equals("silver")) {
			return (int) (point * 0.02);
		} else if (grade.equals("gold")) {
			return (int) (point * 0.05);
		} else if (grade.equals("vip")) {
			return (int) (point * 0.1);
		}
		return 0;
	}
}