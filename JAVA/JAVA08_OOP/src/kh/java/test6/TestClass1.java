package kh.java.test6;

import java.util.Objects;

//abstract 메소드를 포함한 클래스는 반드시 abstract클래스
public abstract class TestClass1 {
	private int num;

	public TestClass1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestClass1(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "TestClass1 [num=" + num + "]";
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	public void setNum(int num) {
		this.num = num;

	}

	public void methodTest1() {
		System.out.println("test-1");
	}

	// 메소드에 코드 실행 부분이 없음 -> 미완성된 메소드 -> 추상메소드
	// 코드 실행부분을 의도적으로 만들지 않을때 abstract 키워드 사용
	public abstract void methodTest2();
}
