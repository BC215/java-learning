package kh.java.test4;

public class Bclass extends Aclass {
	private int data;

	public Bclass() {
		super(); // 부모 생성자 호출

	}

	public Bclass(int num, String str, int data) {
		super(num, str);// super 명령어가 최우선으로 입력되어야함
		setNum(num);
		setStr(str);
		this.data = data;

	}

	@Override
	public void test1() {
		System.out.println("test1 수정");

	}

	public void test2() {
		System.out.println("test2@@@");
	}

}
