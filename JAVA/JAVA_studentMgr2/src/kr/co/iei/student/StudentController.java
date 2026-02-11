package kr.co.iei.student;

import java.util.Scanner;

import kr.co.iei.student.vo.Student;

public class StudentController {
	Student[] students;
	Scanner sc;
	int index;

	public StudentController() {
		students = new Student[10];
		sc = new Scanner(System.in);
		index = 0;
	}

	public void main() {
		while (true) {
			System.out.println("---------- 학생 관리 프로그램v2 ----------");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 전체 학생 출력");
			System.out.println("3. 학생 1명 출력");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료 ");
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
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 0:
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}

	public void insertStudent() {
		System.out.println("---------- 학생 정보 등록 ----------");
		System.out.print("등록 할 학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("등록 할 학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("등록 할 학생 주소 입력 : ");
		sc.nextLine(); // 버퍼 비우기
		String addr = sc.nextLine();

		Student s = new Student(name, age, addr);
		students[index] = s;
		index++;
		System.out.println("학생 정보 등록 완료!");
	}

	public void printAllStudent() {
		System.out.println("---------- 전체 학생 정보 출력 ----------");
		System.out.println("이름\t나이\t주소");
		for (int i = 0; i < index; i++) {
			Student s = students[i];
			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
		}
	}

	public void printOneStudent() {
		System.out.println("---------- 학생 정보 조회 ----------");
		System.out.print("조회 할 학생 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("학생 정보를 조회할 수 없습니다.");
		} else {
			Student s = students[searchIndex];
			System.out.println("학생 이름 : " + s.getName());
			System.out.println("학생 나이 : " + s.getAge());
			System.out.println("학생 주소 : " + s.getAddr());
		}
	}

	public void updateStudent() {
		System.out.println("---------- 학생 정보 수정 ----------");
		System.out.print("정보를 수정할 학생의 현재 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("학생 정보를 찾을 수 없습니다.");
		} else {
			// 1. 새로운 정보들 입력받기
			System.out.print("변경 할 새 이름 입력 : ");
			String newName = sc.next();

			System.out.print("변경 할 나이 입력 : ");
			int newAge = sc.nextInt();

			System.out.print("변경 할 주소 입력 : ");
			sc.nextLine(); // 숫자 입력 후 남은 엔터(버퍼) 제거
			String newAddr = sc.nextLine();

			// 2. setter를 이용해 해당 인덱스의 학생 정보 변경
			students[searchIndex].setName(newName);
			students[searchIndex].setAge(newAge);
			students[searchIndex].setAddr(newAddr);

			System.out.println("학생 정보 수정 완료!");
		}
	}

	public void deleteStudent() {
		System.out.println("---------- 학생 정보 삭제 ----------");
		System.out.print("삭제 할 학생 이름 입력 : ");
		String name = sc.next();
		int searchIndex = searchStudent(name);

		if (searchIndex == -1) {
			System.out.println("학생 정보를 찾을 수 없습니다.");
		} else {
			for (int i = searchIndex; i < index - 1; i++) {
				students[i] = students[i + 1];
			}
			students[index - 1] = null;
			index--;
			System.out.println("학생 정보 삭제 완료!");
		}
	}

	public int searchStudent(String name) {
		for (int i = 0; i < index; i++) {
			if (students[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
}