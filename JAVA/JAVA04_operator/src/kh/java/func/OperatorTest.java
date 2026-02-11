package kh.java.func;

import java.util.Scanner;

public class OperatorTest {
	
	public void test1() {
		// 산술연술자(+,-,*,/,%)
		// 대입연산자(=) : a=b; -> b라는 값을 a라는 공간(변수)에 대입
		
		// 복합대입연산자 : 산술연산자와 대입연산자가 합쳐진 형태의 연산자
		// +=, -=, *=, /=, %=
		// 현재 변수에 들어있는 데이터를 산술연산해서 변수에 다시 대입하는 연산자
		int num = 10;
		System.out.println("num : "+num);
		num += 5; // num = num +5;
		System.out.println("num : "+num);
		num *= 3; // num = num *3;
		System.out.println("num : "+num);
		
	}	
	
	public void test2() {
		//증감연산자(==,--) : 단항연산자 -> 변수 하나에 사용하는 연산자
		int num = 10;
		System.out.println("num : "+num);
		num++; // num 변수의 값을 1 증가시킴
		System.out.println("num : "+num);
		num--; // num 변수의 값을 1 감소시킴
		System.out.println("num : "+num);
		++num;// num 변수의 값을 1 증가시킴
		System.out.println("num : "+num);
		--num; // num 변수의 값을 1 감소시킴
		System.out.println("num : "+num);
		// 증감연산자가 단독으로 사용되면 위치가 앞/뒤 상관없이 결과가 동일
		//변수++ : 후위연산 -> 인접연산이 있으면 인접연산을 수행하고 증감이 동작
		//++변수 : 전위연산 -> 인접연산이 있으면 증감이 동작한후 인접연산 수행
		int num1 = 10;
		int num2 = num1++ + 2;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
				
		int a = 10;
		int b = 10;
		int c = (a++) + (++b) + a;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
	}
	
	public void test3() {
		//관계연산자( <, >, <=, >=, ==, !=)
		// 10 < 20 -> 맞는지 틀린지 컴퓨터에게 물어보는 내용 => 참(true)/거짓(false)
		// 10 > 20 => false
		Scanner sc = new Scanner(System.in);
	
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		boolean bool1 = num1 < num2 ;
		System.out.println("bool1 : "+bool1);
		
		boolean bool2 = num1 > num2 ;
		System.out.println("bool2 : "+bool2);
		
		boolean bool3 = num1 <= num2 ;
		System.out.println("bool3 : "+bool3);
		
		boolean bool4 = num1 >= num2 ;
		System.out.println("bool4 : "+bool4);
		
		boolean bool5 = num1 == num2 ;
		System.out.println("bool5 : "+bool5);
		
		boolean bool6 = num1 != num2 ;
		System.out.println("bool6 : "+bool6);
	}
	
	
	public void test4() {
		
		Scanner sc = new Scanner(System.in);
		//논리연산자(&&, ||, !)
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt(); 	
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();		
		System.out.print("세번째 정수 입력 : ");
		int num3 = sc.nextInt(); 		
		System.out.print("네번째 정수 입력 : ");
		int num4 = sc.nextInt(); 
		
		boolean result1 = num1 < num2;
		boolean result2 = num3 < num4;
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		boolean result3 = result1 && result2;
		boolean result4 = result1 || result2;
		
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		
		
		boolean result5 = !result1;
		System.out.println("result5 : "+result5);
	}
	
		public void test5() {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두번째 정수 입력 : ");
			int num2 = sc.nextInt();
			
			/*
			  삼항연산자
			  (1) ? (2) : (3)
			  (1) : 논리값(조건식)  <- 최종적으로 true/false
			  (2) : (1)의 논리값이 true 인경우 실행될 코드
			  (3) : (1)의 논리값이 false 인경우 실행될 코드
			  
			 */
		
			int result1 = (num1 > num2) ? (num1) : (num2); 
			System.out.println("result1 : "+result1);
			
			boolean check = num1 > num2;
			int result2 = check ? num1 : num2;
			System.out.println("result2 : "+result2);
			
			System.out.println("result3 : " + (num1 > num2 ? num1 : num2));
			
			String str = (num1 > num2) ? "num1이 더 큼" : "num2가 더 큼";
			
			System.out.println(str);
			
			System.out.println(num1 > num2 ? "num1이 더 큼" : "num2가 더 큼");
		
			//String str2 = (num1 > num2) ? "num1이 더 큼" : num;2 → num2가 문자열이 아니라 불가
			//System.out.println(num1 > num2 ? "num1이 더 큼" : num2); → 가능
			
		
		
		}
		
		public void exam1() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫번째 정수 입력 : ");
			int num1 = sc.nextInt();		
			System.out.print("두번째 정수 입력 : ");
			int num2 = sc.nextInt();		
			System.out.println("=========결과==========");
			
			int sum = num1 + num2;
			int minus = num1 - num2;
			int avg = num1 * num2;
			double div = num1 / num2;


			System.out.printf("두 수를 더한 수 : %d \n", sum);
			System.out.printf("두 수를 뺀수 : %d \n", minus);
			System.out.printf("두 수를 곱한수 : %d \n", avg);
			System.out.printf("두수를 나눈 수 : %.2f \n", div);

		}
		
		public void exam2() {
			int a = 40 , b = 20;
			a += b;
			System.out.printf("a의 값: %d , b의 값 : %d \n", a, b); // 60 20
			
			a -= b;
			System.out.printf("a의 값: %d , b의 값 : %d \n", a, b); //40 20
			
			b *= a;
			System.out.printf("a의 값: %d , b의 값 : %d \n", a, b); //40 800
			
			b /= a;
			System.out.printf("a의 값: %d , b의 값 : %d \n", a, b); //40 20
		
		
		
		}
		
		public void exam3() {
			int a = 10, b =20, c = 30, d = 40;
			boolean result1, result2;
			result1 = ((a < 20 && b > 10) && (c == 20 || d == 40));
			result2 = ((a== 10 && b != 2*10) || (c == 30 && d != 40));
			System.out.printf("첫번째 결과값 : %b \n", result1); // true
			System.out.printf("두번째 결과값 : %b \n", result2); // false
			
		}
		
		public void exam4() {
			Scanner sc = new Scanner(System.in);
			
			
		
	        System.out.print("나이를 입력하세요: ");
	        int age = sc.nextInt();

	        System.out.println(age >= 20 ? "성인입니다. 어서오세요." : "미성년자는 입장불가입니다.");
	        //String message = age >= 20 ? "성인입니다. 어서오세요." : "미성년자는 입장불가입니다.";
	        //System.out.println(message);
		}
		
}
