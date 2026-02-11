package kj.java.start;

import kh.java.test7.CalcFront;

public class Start {

	public static void main(String[] args) {
		// 1. CalcFront 객체 생성
		CalcFront front = new CalcFront();

		// 2. 클래스 내부에 정의된 test1() 메소드 호출
		front.test1();
		// 추상클래스는 객체생성 불가능(미완성된 클래스로 객체를 생성하는것은 불가능)
		// 추상클래스 - > 상속해서 사용
		// TestClass1 test1 = new TestClass1() {
		// TestClass2 test2 = new TestClass2();
		// test2.methodTest1();
		// test2.methodTest2();
		// TestClass3 test3 = new TestClass3();
		// test3.methodTest1();
		// test3.methodTest2();
		// test3.methodTest3();

		// 추상클래스는 직접 객체생성은 불가능하지만,자식객체를 저장하는 자료형으로 사용이 가능
		// TestClass1 test22 = new TestClass2();
		// TestClass1 test33 = new TestClass3();
		// test22.methodTest2();
		// test33.methodTest2();
	};
	/*
	 * Animal a1 = new Animal(); Tiger t1 = new Tiger(); Rabbit r1 = new Rabbit();
	 * 
	 * a1.move();
	 * 
	 * t1.hunt(); t1.move();
	 * 
	 * r1.jump(); r1.move();
	 * 
	 * // 다형성 : 부모타입 변수에 자식타입의 객체주소를 저장하는것. Animal a2 = new Tiger(); Animal a3 = new
	 * Rabbit();
	 * 
	 * // 반대로는 불가능↓
	 * 
	 * // ->Tiger t2 = new Animal(); // ->Rabbit r2 = new Animal();
	 * 
	 * // 다형성으로 자식타입 객체를 부모타입변수에 저장하면 , 부모타입이 가진 기능만 사용가능.
	 * 
	 * a2.move(); // a2.hunt(); a3.move(); // a3.jump():
	 * 
	 * // 업캐스팅된 상태에서 자식타입객체의 기능을 사용하고 싶으면 -> 다운캐스팅 Tiger t3 = (Tiger) a2; Rabbit r3
	 * = (Rabbit) a3; t3.hunt(); r3.jump();
	 * 
	 * // Tiger t4 = (Tiger) a3;
	 * 
	 * // ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ // Aclass aa = new Aclass(); //
	 * aa.test1(); // Bclass bb = new Bclass(); // bb.test2(); // bb.test1(); //
	 * Bclass bbb = new Bclass(100, "hi", 1000);
	 * 
	 * // MySmartPhone tv = new MySmartPhone(); // tv.startPhone();
	 * 
	 * // TV tv1 = new TV(); // TV tv2 = new TV(); // TV tv = new TV(); //
	 * tv.startTv();
	 * 
	 * /* NewTv tv1 = new NewTv(); int volume = tv1.getvolume();
	 * System.out.println("vol : " + volume); System.out.println("ch : " +
	 * tv1.getChannel()); tv1.setChannel(100); System.out.println("ch : " +
	 * tv1.getChannel()); System.out.println("크기 : " + tv1.getInch());
	 */
	// if(tv1.isPower()) -> 논리형인경우

	// NewTv tv1 = new NewTv(); // 0인치 티비
	// NewTv tv2 = new NewTv(100); // 100인치 티비
	// System.out.println("tv1 : " + tv1.getInch());
	// System.out.println("tv2 : " + tv2.getInch());

}
