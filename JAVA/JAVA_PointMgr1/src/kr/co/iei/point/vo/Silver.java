package kr.co.iei.point.vo;

public class Silver {
	private String name;
	private String grade;
	private int point;

	// 기본 생성자
	public Silver() {
	}

	// 모든 전역변수를 초기화 하는 생성자
	public Silver(String grade, String name, int point) {
		this.grade = grade;
		this.name = name;
		this.point = point;
	}

	// Getter & Setter
	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public int getPoint() {
		return point;
	}

	// Silver 회원은 포인트의 2%를 보너스로
	public double getBonus() {
		return point * 0.02;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
