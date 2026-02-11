package kr.co.iei.point.vo;

//Grade 클래스는 모든 등급용 클래스의 공통부모 클래스
//새로운 등급 클래스를 만들떄는 Grade를 상속 -> 동일한 부분은 모두 Grade에 작성
//등급별로 보너스는 다르게 연산해야함 -> getBonus()메소드는 반드시 오버라이딩 할수있도록 처리
public abstract class Grade {
	private String grade;
	private String name;
	private int point;

	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Grade(String grade, String name, int point) {
		super();
		this.grade = grade;
		this.name = name;
		this.point = point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public abstract double getBonus();
}