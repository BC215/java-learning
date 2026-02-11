package kh.java.func;

public class ObjectTest {
	public void test1() {
		TestClass tc1 = new TestClass();
		int num = tc1.hashCode();
		// hashcode : 객체의 고유한값(인스턴스 식별)
		System.out.println("tc1 hashcode - " + num);
		TestClass tc2 = new TestClass();
		System.out.println("tc2 hashcode - " + tc2.hashCode());

		TestClass tc3 = tc1;
		System.out.println("tc3 hashcode - " + tc3.hashCode());

		// equals : 같은 객체인지 확인하는 메소드

		System.out.println(tc1.equals(tc2));
		System.out.println(tc1.equals(tc1));

		String str1 = new String("abc");
		String str2 = new String("abc");

		if (str1 == str2) {
			System.out.println("두 문자열이 같습니다.");

		} else {
			System.out.println("두 문자열이 다릅니다.");
		}

		if (str1.equals(str2)) {
			System.out.println("두 문자열이 같습니다.");

		} else {
			System.out.println("두 문자열이 다릅니다.");
		}
		String str = "hi";
		System.out.println("str : " + str);
		str = "hello";
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
	}

	public void test2() {
		TestClass tc1 = new TestClass(100, "hi");
		TestClass tc2 = new TestClass(300, "hello");

		System.out.println(tc1); // 출력할때 인스턴스이름을 바로 사용하면 자동으로 toString()메소드 실행
		System.out.println(tc1.toString());
		System.out.println(tc1.hashCode());
		System.out.println(tc2);
		System.out.println(tc2.toString());
		System.out.println(tc2.hashCode());
	}

}