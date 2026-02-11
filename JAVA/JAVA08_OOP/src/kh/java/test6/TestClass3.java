package kh.java.test6;

public class TestClass3 extends TestClass1 {
	// 추상클래스 상속하면 추상메소드를 강제로 오버라이딩해야함
	// 오버라이딩을 하고나면 일반클래스 상속한것처럼 추가로 변수,메소드 생성하는것에 제한 없음
	private String str;

	@Override
	public void methodTest2() {
		System.out.println("methodTest2 - TestClass3");
	}

	public void methodTest3() {
		System.out.println("methodTest3");
	}
}
