package kh.java.test4;

public class Aclass {
	// 필드(멤버 변수)를 private으로 선언하여 외부 직접 접근 차단
	private int num;
	private String str;

	// 기본 생성자
	public Aclass() {
		super();
	}

	// 모든 필드를 초기화하는 생성자
	public Aclass(int num, String str) {
		this.num = num;
		this.str = str;
	}

	// public 접근 제한자를 가진 Getter 및 Setter 메서드 제공
	// num 값에 접근하기 위한 메서드들
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	// str 값에 접근하기 위한 메서드들
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void test1() {
		System.out.println("test1!!!!!!");
	}
}