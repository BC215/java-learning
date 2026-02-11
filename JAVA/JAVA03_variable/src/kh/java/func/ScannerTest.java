package kh.java.func;
import java.util.Scanner;

//nextInt : 정수
//nextDouble : 실수
//next : 문자열(띄어쓰기X)
//nextLine : 문자열(띄어쓰기○)
//Int,Double,next는 필요한경우 바로 사용(대신 입력이 정상적이여야함)
//Line은 버퍼에 엔터가 남아있는지 확인필요 -> 있는경우 엔터제거후 사용필요
// 스캐너 기능을 최초로 사용하는경우, 최초가 아니면 바로 이전스캐너가 Line인경우는 바로사용가능


public class ScannerTest {
	
	public void test1() {
			// Scanner 사용방법은 자바가 제공하는 Scanner 클래스 사용
			// 1. import / 2. 별명설정 / 3. 별명.메소드();
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		//사용자가 콘솔에 키보드값을 입력하는걸 기다림, 입력하고 엔터를 치면 입력내용을 프로그램으로 가져옴
		int num1 = sc.nextInt();
		
		System.out.println("입력값 : " +num1);
		
		System.out.print("실수를 입력하세요 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("입력값 : " +num2);
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		//스캐너를 이용한 문자, 문자열 입력받기
		//문자열 입력받는 방법 : sc.next(), sc.nextLine()
		//next는 띄어쓰기 불가 nextLine은 가능
		//순서가 nextLine -> next 정상작동 / 반대는 오작동 버퍼로인해 아래와같이 nextLine추가해줘야함
		//  next -> nextLine 시에는 버퍼 X
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.println("이름 : " +name);
		
		System.out.print("주소를 입력하세요 : ");
		sc.nextLine(); // 버퍼에 남아있는 엔터를 처리하는 목적
		String add = sc.nextLine(); //sc.nextLine은 사용전에 버퍼를 반드시 비워야하 하기 때문.
		System.out.println("주소 : " +add);
		
		//문자를 입력받을때 -> 문자를 바로 입력받는 방법은 없음
		//먼저 문자열로 입력받고 -> 입력받은 문자열중 문자를 추출
		System.out.print("문자열을 입력하세요: ");
		String str = sc.next();
		System.out.println("입력받은 문자열 : " +str);
		//문자열.charAt(숫자): 괄호안에 숫자번째에 해당하는 글자를 문자로 추출
		char ch = str.charAt(1);// 프로그램은 숫자를 0번쨰부터 계산
		System.out.println("문자 : " +ch);

		System.out.print("계속 진행하시겠습니까?[y/n]: ");
		String yN = sc.next();
		char data = yN.charAt(0);
		//char data = sc.next().charAT(0);
		System.out.println("문자 : " +yN);
		}
	
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();	
		
		System.out.print("주소 입력하세요 : ");
		sc.nextLine();
		String add = sc.nextLine();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		int heightInt = (int)height; // 실수를 정수로 강제 변환
		
		System.out.print("몸무게를 입력하세요 : ");
		double weight = sc.nextDouble();	
		
		System.out.print("성별 입력하세요: ");
		String str = sc.next();
		char gen = str.charAt(0);

		System.out.println("이름 : " +name);
		System.out.println("나이 :  " +age);	
		System.out.println("주소 : " +add);
		System.out.println("키 : " +heightInt);	
		System.out.printf("몸무게 : %.1f \n", weight);	
		System.out.println("성별 : " +gen);
	}

	public void exam2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력 : ");
		int num1 = sc.nextInt();	
		
		System.out.print("수학점수 입력 : ");
		int num2 = sc.nextInt();	

		
		System.out.print("영어점수 입력 : ");
		int num3 = sc.nextInt();
		
	    int sum = num1 + num2 + num3;
	    double avg = sum / 3.0;
	    System.out.printf("당신 성적의 총 합은 %d점이고 평균은 %.2f 입니다!", sum, avg);

	}
	
}
