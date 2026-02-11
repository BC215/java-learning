package kh.java.func;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test1 {

	public void exam1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("======= D-DAY 계산기");
		System.out.print("D-DAY [년도] 입력 : ");
		int year = sc.nextInt();
		System.out.print("D-DAY [월] 입력 : ");
		int month = sc.nextInt();
		System.out.print("D-DAY [일] 입력 : ");
		int day = sc.nextInt();

		// 오늘 날짜
		Calendar today = Calendar.getInstance();
		today.set(Calendar.HOUR_OF_DAY, 0);
		today.set(Calendar.MINUTE, 0);
		today.set(Calendar.SECOND, 0);
		today.set(Calendar.MILLISECOND, 0);

		// D-DAY 날짜
		Calendar dday = Calendar.getInstance();
		dday.set(year, month - 1, day);
		dday.set(Calendar.HOUR_OF_DAY, 0);
		dday.set(Calendar.MINUTE, 0);
		dday.set(Calendar.SECOND, 0);
		dday.set(Calendar.MILLISECOND, 0);

		long todayMs = today.getTimeInMillis();
		long ddayMs = dday.getTimeInMillis();

		Date todayDate = new Date(todayMs);
		Date ddayDate = new Date(ddayMs);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : " + sdf.format(todayDate));
		System.out.println("D-DAY 날짜 : " + sdf.format(ddayDate));

		long interDay = (ddayMs - todayMs) / (24 * 60 * 60 * 1000);

		if (interDay > 0) {
			System.out.println(interDay + "일 남았습니다.");
		} else if (interDay < 0) {
			System.out.println(Math.abs(interDay) + "일 지났습니다.");
		} else {
			System.out.println("D-DAY 입니다.");
		}

		sc.close();
	}

	public void wrap1() {
		// Wrapper 클래스 : 기본자료형을 참조형으로 사용할 수 있도록 포장하는 클래스

		// boolean -> Boolean
		// char -> Character
		// byte -> Byte
		// short -> Short
		// int -> Int
		// long -> Long
		// float -> Float
		// double -> Double

		// 정수형 변수에 10을 대입
		int num1 = 10;
		// 정수형을 객체로 다뤄야하는경우 -> Wrapper 클래스 사용 ->Integer 사용
		Integer num2 = new Integer(100); // -> 기본형을 참조형으로 포장 -> boxing
		int num3 = num2.intValue(); // -> Wrapper로 감싸진 데이터를 다시 기본형으로 변환 -> unboxing

		// 실수형에 10.5를 대입
		double d1 = 10.5;
		// double ->Double
		Double d2 = new Double(10.5); // boxing
		double d3 = d2.doubleValue();// unboxing

		// auto-boxing, auto-unboxing
		int num11 = 100;
		Integer num12 = 100; // auto-boxing
		int num13 = num12; // auto-unboxing

		Double d11 = 3.14;
		double d12 = d11;
	}

	public void wrap2() {
		// wrapper의 활용 / 기본형 <->문자열 데이터 변환
		// 1) 문자열로 있는 데이터를 기본자료형으로 변환하고 싶을때
		String str1 = "100";
		// 변경하고 싶은 기본자료형의 wrapper 클래스 사용
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);

		String str2 = "3.14";
		double d1 = Double.parseDouble(str2);
		System.out.println(d1);

		// 정상적으로 변환이 불가능한 문자열을 변환하려고하면 에러 발생
		// 에러 예시 ↓
		// String str3 = "100a";
		// int num2 = Integer.parseInt(str3);
		// System.out.println(num2);

		// 문자열 -> 문자
		String str4 = "ABCD";
		char ch = str4.charAt(2);

		// 2) 기본형을 문자열로 바꾸는경우
		int num2 = 100;
		double d2 = 3.14;

		// 2-1) wrapper 클래스 사용하는 방법
		String str5 = Integer.valueOf(num2).toString();
		String str6 = Double.valueOf(d2).toString();
		System.out.println(str5);
		System.out.println(str6);

		// 2-2) String 클래스 사용하는 방법
		String str7 = String.valueOf(num2);
		String str8 = String.valueOf(d2);
		System.out.println(str7);
		System.out.println(str8);

	}
}