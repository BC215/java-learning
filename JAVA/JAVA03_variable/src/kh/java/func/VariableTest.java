package kh.java.func;

public class VariableTest {
	
	public void test1() {
		//기본 자료형 8개
		//논리형(boolean), 문자(char), 정수형(byte, short, int, long), 실수형(float, double)
		//참조자료형(기본형 8개를 제외하면 모두 참조형
		//문자열(string)
		
		//변수 선언 : 컴퓨터의 메모리중 일정영역을 데이터 저장용도로 사용하겠다 선언
		//변수 선언방법 : 자료형 변수이름;
		//1. 논리형 변수 선언
		boolean bool;
		//2. 문자형 변수 선언
		char ch;
		//변수는 선언하면 최초에 쓰레기값이 들어있는 상태 -> 선언한 이후에 바로 사용하는것은 불가능
		//변수에 데이터를 한번 넣은후 사용이 가능 -> 최초에 한번 데이터를 넣는 행위 -> 초기화

		// = : 같다 라는 의미가 아니라 대입 연산자
		// A = B; -> B라는 데이터를 A라는 공간에 대입
		// ch변수에 대문자 A를 대입
		ch = 'A';
		System.out.println(ch); // 변수를 사용하면 변수 내부에 있는 값을 해당 위치로 가져옴
		
		//논리형 변수에 데이터 대입 -> 논리형은 데이터가 2개(true / false)
		bool = false;
		
		//정수형변수(int) 이름은 num1 선언
		int num1;
		//정수형변수에 10 대입
		num1 = 10;
		
		System.out.println(num1); // 변수를 사용하면 해당 변수에 들어있는 데이터를 복사해서 가져용
		System.out.println(num1); // 재사용해도 데이터가 들어있음
		
		num1 = 100; //변수에 다른 데이터를 대입하면 해당 데이터로 변경
		System.out.println(num1);
		
		num1 = num1 + 100; // 위에 선언된 num1 = 100에 100을 더해 num1은 200이됨
		System.out.println(num1);
		
		//실수형변수(double) 이름 num2 선언
		double num2;
		//실수형 변수에 3.14라는 값을 대입
		num2 = 3.14;
		System.out.println(num2);
		
		//실수형변수(double) 이름 num3 선언하면서 3.14라는 값으로 초기화
		double num3 = 3.14; // 변수를 선언하면서 바로 초기화하는 작업
		System.out.println(num3);
	
	}
	
	public void test2() {
		//정수형 변수를 생성해서 데이터 대입
		int num1 = 1000;
		long num2 = 20000000000l; //정수뒤에 L(l)을 붙이면 long타입 정수임을 알려줌
			
		
		//실수형 변수를 생성에서 데이터 대입
		double num3 = 3.14;
		float num4 = 3.14f; //실수 뒤에 F(f)를 붙이면 float타입 실수임을 알려줌
	
		//상수형 변수
		//변수 선언시 final 키워드를 앞에 붙이면 일반 변수가 아니라 상수형 변수
		//상수형 변수의 특징: 한번 값을 초기화 하고 난후 변경 불가
		//일반변수는 변수이름을 카멜표기법으로 작성하지만, 상수형 변수는 일반변수와 구분하기 위해 모두 대문자로 작성
		final int NUM5;
		NUM5 = 200;
		System.out.println(NUM5);
		//NUM5 = 300; // 상수형 변수는 값이 변경되지 않는 변수로 한번 초기화 한이후에는 값을 다시 대입하는것이 불가능
	
	
	}

	public void test3() {
		int num = 2147483647;
		long result = (long)num + 1; // num 앞에 (long)은 강제 형변환  혹은 뒤에 L 넣어도됨
		System.out.println(result); //214648347
	
		//강제 형변환을 해야하는 경우(큰 자료형 데이터를 작은 자료형에 넣을때)
		//강제형변환은 데이터의 유실을 체크해야함
		int num2 = 290;
		long num3 = num2;
		byte num4 = (byte)num2;
		System.out.println(num4);
	}
	
	public void test4() {
		//System.out.println(""); : 괄호안의 내용을 출력후 개행(엔터 역활)
		//System.out.print(""); : 괄호안의 내용을 출력
		//System.out.println("안녕하세요");
		//System.out.print("제 이름은 ");
		//System.out.println("이병창 입니다");
		//System.out.println("----------------------");
		//System.out.print("안녕하세요");
		//System.out.println();//아무것도 출력하지 않고 엔터(단일사용가능)
		//System.out.print("제 이름은 ");
		//System.out.print(); // print의 경우 반드시 ()안에 데이터를 반드시 넣어줘야함
		/*
		 논리형(boolean), 문자(char), 정수(int, long), 실수(float, double), 문자열(string)
		 */

		//실습문제 : 변수를 3개 선언 -> 이름(문자열), 나이(정수/int), 주소(문자열)
		// 선언된 변수에 본인 이름, 나이, 주소를 대입
		// 최종출력 예시
		// 안녕하세요 제 이름은 ***이고, 나이는 **살  사는곳은 **입니다.
		
			String my_name;
			my_name = "이병창";
			//String my_name = "이병창";
			int my_age;
			my_age = 29;
			//int my_age = 29;
			
			String my_address;
			my_address = "남양주";
			//String my_address = "남양주";
			
			System.out.println("안녕하세요 " + "제 이름은 "+ my_name + "이고");
			System.out.print("나이는 " + my_age + "살이며");
			System.out.println();
			System.out.print("사는곳은 ");
			System.out.print(my_address);
			System.out.println(" 입니다");
			
			//System.out.printf(); : printf는 정해진 형식에 맞춰서 줄바꿈하지 않고 출력
			//&s는 문자열, &d는 정수 / 반드시 순서,종류에 맞게 변수 입력해줘야함
			System.out.printf("안녕하세요 제 이름은 %s이고, 나이%d살, 사는곳은 %s입니다.",my_name,my_age,my_address);
			/*
			 d 정수 / o 8진수/ x 16진수
			 f 실수 / g e,f중 더 짧은표현/  A 16진수 실수
			 */			
			}
			
	public void test5() {
		
		int num = 100;
		// -> 정수는 : 100
		
		System.out.print("정수는 : ");
		System.out.print(num);
		System.out.println();
		
		System.out.println("정수는 : "+num);
		
		System.out.printf("정수는 : %d",num);
		System.out.println();
		
		double doubleNum = 3.14;
		System.out.printf("실수는 : %f",doubleNum);
		System.out.println();
		
		//소수점 자리를 조절하고싶다면 ?
		// %.*f 입력(* = 몇자리수 지정)
		System.out.printf("실수는 : %.3f",doubleNum);
		System.out.println();
		
		System.out.printf("정수는 : %d",200); // 그냥 뒤에 변수가 아닌숫자 입력해도됨
		System.out.println();
		
		// 문자, 문자열 처리
		char ch = 'A';
		System.out.printf("문자 : %C",ch);
		System.out.println();
		
		String str = "Hello";
		System.out.printf("문자열 : %s",str);
		System.out.println();
		
		System.out.printf("%c %s %d %f",ch,str,num,doubleNum);
		System.out.println();
		
		int number = 100;
		// printf -> 우리반 출석율 100
		System.out.printf("우리반 출석율 %d",number);
		System.out.println();
		
		// printf -> 우리반 출석율 100%입니다. => %* 뒤에 % 를 붙이고싶으면 %을 두번 쓰면됨(%%) 
		
		System.out.printf("우리반 출석율 %d%%입니다",number);
		System.out.println();
		
		// 다만 print나 println에서는 상관없음 
		System.out.println("우리반 출석율 "+ number +"%입니다");
		System.out.print("우리반 출석율 "+ number +"%입니다");
		System.out.println();
		
		//제 이름은 이병창입니다.
		System.out.println("제 이름은 이병창 입니다 ");
		
		//제 이름은 "이병창"입니다. =>\"***\"
		System.out.println("제 이름은 \"이병창\" 입니다 ");
		
		// \t = 띄어쓰기(글씨수에 따라 달라짐), \n 개행(엔터역활), \\ \를 보여지게함.
		// print, pirntf, println 상관없이 사용가능
		System.out.println("제\\ 이름은 \t이병창 \n입니다 "); 
	}
	
	
	public void test6() {
		
		int num1 = 100;
		long num2 = 999900000000l;
		float num3 = 486.520f;
		double num4 = 5697.890123;
		char ch = 'A';
		String st1 = "Hello JAVA";
		
		System.out.println("num1 : " + num1);	
		System.out.printf("num2 : ");	
		System.out.print(num2);	
		System.out.println();
		System.out.printf("num3 : %f \n",num3);	
		System.out.printf("num4 : %f \n",num4);	
		System.out.printf("num5 : %C \n",ch);		
		System.out.printf("num5 : %s \n",st1);
		
		boolean bool = true;
		
		System.out.println(bool);
		
	}
	
	public void test7() {
		String name3 = "이병창"; 
		int age3= 29;
		char gen3= '남';
		String add3= "서울";
		String num3 = "010-5678-4321" ;
		String email3= "789@gmail.com";;
	
				

		System.out.println("이름 \t 나이 \t 성별 \t 지역 \t 전화번호 \t 이메일");
		System.out.println("--------------------------------------------------------------------");		
		System.out.printf(" %s \t %d \t %s \t %s \t %s \t %s \n",name3,age3,gen3,add3,num3,email3);
		
		String name4 = "김땡떙"; 
		int age4 = 29;
		char gen4 = '남';
		String add4 = "경기도";
		String num4 = "010-1234-5678";
		String email4 = "123@gmail.com";
	
		System.out.println("--------------------------------------------------------------------");	
		System.out.printf(" %s \t %d \t %s \t %s \t %s \t %s \n",name4,age4,gen4,add4,num4,email4);
	}
}
