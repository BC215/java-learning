package kh.java.start;

//실행클래스에서 다른클래스에 있는 기능을 실행하는경우
//1. import : 사용하고 싶은 기능제공클래스의 위치를 선언
//import 패키지 경로. 클래스이름;

//import kh.java.func.TestClass1;
import adc.def.SampleClass;

public class Start {
	//실행메소드
	//실행메소드는 한 프로젝트당 반드시 1개만 존재
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("실행클래스");
		
		// 제외할 해당 클래스,메소드 주석처리
		// 아예 차후 사용할예정이면 메소드만 주석처리해도됨
		
		//2. 별명설정 : 해당클래스를 부를 별명을 설정
		//별명 설정 방법
		// 클래스이름 별명 = new 클래스이름();
		
		//TestClass1 tc1 = new TestClass1();
		//TestClass1 tc2 = new TestClass1();
		SampleClass sc1 = new SampleClass();
		
		//3 메소드 실행 : 별명.메소드이름();
		
		//tc1.test1();
		//tc2.test2();
		sc1.testmethod();
		
	}

}
