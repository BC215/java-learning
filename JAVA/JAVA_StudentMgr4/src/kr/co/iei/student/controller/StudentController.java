package kr.co.iei.student.controller;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import kr.co.iei.student.vo.Student;

public class StudentController {
	Scanner sc;
	// 학생정보를 HashMap으로 관리
	// 관리하고 싶은 학생 1명 정보 이름/나이/주소 -> Student -> HashMap에서 Student는 value
	// 학생을 관리하고 싶은 key는 절대 중복이 되면 안됨 -> 이름을 key -> key의 자료형 string
	HashMap<String, Student> students;

	public StudentController() {
		super();
		sc = new Scanner(System.in);
		students = new HashMap<String, Student>();
	}

	public void main() {
		while (true) {
			System.out.print("\n---------- 학생 관리 프로그램 v4 -----------\n");
			System.out.println("1. 학생 정보 등록");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 정보 조회");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("0. 프로그램 종료");
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
		} // while 종료

	}// main종료

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
		// map 추가 -> put
		// students.put(addr, s); // key는 입력받은 이름/ value 는 학생 정보가 저장된 Student
		students.put(s.getName(), s);
		System.out.println("학생 정보 등록 완료!");
	}

	public void printAllStudent() {
		System.out.println("\n---------- 전체 학생 정보 출력 ----------\n");
		System.out.println("이름\t나이\t주소");
		// map에 있는 모든 학생 정보를 출력 -> 모든 학생의 이름을 알고 있어야함. -> key가 이름
		// -> Map에 있는 keySet()메소드로 모든 학생의 이름을 Set타입으로 처리
		Set<String> names = students.keySet();
		for (String name : names) {
			// map에서 value를 꺼내는 메소드 -> get
			Student s = students.get(name);
			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAdd());
		}

	}

	public void printOneStudent() {
		System.out.println("---------- 학생 정보 조회 ----------");
		System.out.print("조회 할 학생 이름 입력 : ");
		String name = sc.next();

		// boolean result = students.containsKey(name);
		Student s = students.get(name);
		if (s != null) {
			// Student s = students.get(name);
			System.out.println("이름 : " + s.getName());
			System.out.println("나이 : " + s.getAge());
			System.out.println("주소 : " + s.getAdd());
		} else {
			System.out.println("학생 정보를 찾을수 없습니다.");
		}

	}

	public void updateStudent() {
		System.out.println("---------- 학생 정보 수정 ----------");
		System.out.print("정보를 수정할 학생의 현재 이름 입력 : ");
		String name = sc.next();
		boolean result = students.containsKey(name);
		if (result) {
			System.out.println("수정할 학생 이름 입력 : ");
			String newName = sc.next();
			System.out.println("수정할 학생 나이 입력 : ");
			int newAge = sc.nextInt();
			System.out.println("수정할 학생 주소 입력 : ");
			sc.nextLine();
			String newadd = sc.nextLine();
			// 1)setter 이용 (정상작동)
			// Student s = students.get(name);
			// if (name.equals(newName)) {
			// s.setName(newName);
			// s.setAge(newAge);
			// s.setAdd(newadd);
			// } else {
			// Student newStudent = new Student(newName, newAge, newadd);
			// students.put(newStudent.getName(), newStudent);
			// students.remove(name);
			// }

			// 2)새로운 객체( 이름이 같으면 작동 불가)
			Student newStudent = new Student(newName, newAge, newadd);
			students.remove(name); // ->정보 먼저 삭제하고나서 진행하면 문제X
			students.put(newStudent.getName(), newStudent);
			// if(!name.equals(newName)){
			// students.remove(name);
			// }
			// students.remove(name);
			System.out.println("학생 정보 수정 완료");
		} else {
			System.out.println("학생 정보를 찾을수 없습니다.");

		}
	}

	public void deleteStudent() {
		System.out.println("---------- 학생 정보 삭제 ----------");
		System.out.print("삭제 할 학생 이름 입력 : ");
		String name = sc.next();
		Student s = students.remove(name);
		if (s == null) {
			System.out.println("학생 정보를 찾을수 없습니다.");

		} else {
			System.out.println("학생 정보 삭제 완료");
		}
		// boolean result = students.containsKey(name);

		// if (students.containsKey(name)) {
		// System.out.println("학생 정보를 찾을 수 없습니다.");
		// } else {
		// students.remove(name);
		// System.out.println("학생 정보 삭제 완료");
		// }
	}

}
