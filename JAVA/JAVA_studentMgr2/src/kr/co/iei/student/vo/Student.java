package kr.co.iei.student.vo;

public class Student {

	private String name;
	private int age;
	private String addr;

	// 기본 생성자
	public Student() {
	}

	// 모든 전역변수를 초기화 하는 생성자
	public Student(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	// Getter & Setter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}