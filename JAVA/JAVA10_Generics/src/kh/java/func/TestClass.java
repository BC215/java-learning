package kh.java.func;

public class TestClass {
	public void test1() {
		GenericTest1 gt1 = new GenericTest1();
		gt1.setData1(100);
		gt1.setData2("hi");

		System.out.println(gt1.getData1() + 1);
		System.out.println(gt1.getData2() + 1);

		// GenericTest2는 GenericTest1과 나머지는 모두같은데 data1의 변수의 타입이 String
		GenericTest2 gt2 = new GenericTest2();
		gt2.setData1("100");
		gt2.setData2("hello");

		System.out.println(gt2.getData1() + 1);
		System.out.println(gt2.getData2() + 1);

		// GenericTest3 클래스의 data1 변수의 자료형은 제네릭으로 설정.
		// -> 제네릭은 객체 생성할떄 자료형을 지정
		GenericTest3<String> gt3 = new GenericTest3<String>();
		gt3.setData1("1000");
		System.out.println(gt3.getData1() + 1);
		// 만약 data1의 자료형을 정수로 사용하고 싶으면 ?
		// int를 사용할 수 없음
		// Generic으로 자료형 설정할때 반드시 참조형으로 설정(기본 자료형은 사용불가)
		// 그럼에도 불구하고 기본형을 써야하면 -> 기본형을 참조형으로 변환해서 사용 _> Wrapper
		GenericTest3<Integer> gt4 = new GenericTest3<Integer>();
		gt4.setData1(1000);
		System.out.println(gt4.getData1() + 1);

		// GenericTest4 객체는 Generic이 2개 설정 -> 2개 자료형을 모두 지정하면서 객체 생성
		GenericTest4<String, Integer> gt5 = new GenericTest4<String, Integer>();
		GenericTest4<Integer, String> gt6 = new GenericTest4<Integer, String>();

	}

	public void test2() {
		Tiger t1 = new Tiger(100);
		Object o = (Object) t1;// 업캐스팅
		AnimalMgr1 am1 = new AnimalMgr1(o);

		Rabbit r1 = new Rabbit(50);
		AnimalMgr1 am2 = new AnimalMgr1(r1);

		Object o1 = am1.getData1();
		// 업캐스팅을 해둔 상태면 부모클래스가 가지고 있는 기능만 사용이가능
		// 자식 클래스에서 추가된 기능은 다운캐스팅을 해야 사용가능
		// geHp(), setHp(), tigerFunctin()은 Tiger에만 있고 Object에는 없는기능
		// 해당 기능을 사용하고 싶으면 -> 다운캐스팅
		// System.out.println(o1.getHp);
		Tiger t2 = (Tiger) o1;
		System.out.println(t2.getHp());
		t2.tigerFunction();

		Object o2 = am2.getData1();
		Rabbit r2 = (Rabbit) o2;
		System.out.println(r2.getHp());
		r2.rabbitFunction();
	}

	public void test3() {
		Tiger t1 = new Tiger(100);
		Animal a1 = (Animal) t1;
		AnimalMgr2 am1 = new AnimalMgr2(a1);

		Rabbit r1 = new Rabbit(50);
		AnimalMgr2 am2 = new AnimalMgr2(r1);

		Animal a2 = am1.getData1();
		System.out.println(a2.getHp());
		// tigerFunction()은 Animal 에는없고 Tiger에만 존재 -> 사용하려면 결국 다운캐스팅
		Tiger t2 = (Tiger) a2;
		t2.tigerFunction();
		Animal a3 = am1.getData1();
		// a3도 Rabbit 객체가 업캐스팅 된 상태 -> getHp()는 바로 사용할수 있지만 rabbitfunction사용하려면 다운캐스팅
		Rabbit r2 = (Rabbit) a3;
		r2.rabbitFunction();
	}

	public void test4() {
		Tiger t1 = new Tiger(100);
		AnimalMgr3<Tiger> am1 = new AnimalMgr3<Tiger>();

		Rabbit r1 = new Rabbit(50);
		AnimalMgr3<Rabbit> am2 = new AnimalMgr3<Rabbit>();

		Tiger t2 = am1.getData1();
		t2.getHp();
		t2.tigerFunction();

		Rabbit r2 = am2.getData1();
		r2.getHp();
		r2.rabbitFunction();
	}
}
