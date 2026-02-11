package kh.java.func;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiTest {
	public static void math() {

		// 싱글톤 패턴 : 프로그램이 시작할때 객체를 미리 만들어두고 만들어진걸 모든곳에서 사용
		// 다른 클래스를 객체화할때
		// 1.객체 생성
		// TestClass tc = new TestClass();
		// 2.메소드 호출
		// tc.메소드이름();

		// 싱글톤패턴 : 프로그램이 시작되면 이미 해당 객체가 만들어져 있음(사용준비가 끝남)
		// -> 여러곳에서 사용하는 경우 매번 객체를 생성하는게 아니라 이미 만들어진걸 재사용하는 경우
		// -> 싱글톤 패턴으로 메소드를 만드는 방법-> 메소드를 static으로 생성
		// ->수학기능을 담당하는 Math클래스는 싱글톤으로 만들어진 클래스 -> 객체생성안하고 바로 사용
		// -> Math.메소드이름();

		// abs(숫자) : 절대값(양수/음수 부호를 모두 양수로 변환)
		int num1 = Math.abs(10);
		int num2 = Math.abs(-10);
		System.out.println(num1);
		System.out.println(num2);

		// 올림, 버림, 반올림
		System.out.println(Math.ceil(10.1));// 올림(소수 첫째자리에서 올림)
		System.out.println(Math.floor(10.9));// 버림(소수 첫째자리에서 버림)
		System.out.println(Math.round(10.4));// 반올림(소수 첫째자리에서 반올림)
		System.out.println(Math.round(10.5));// 반올림(소수 첫째자리에서 반올림)
		// 1.3456 -> 반올림해서 소수 2자리까지 표현 -> 1.35
		// 1.3456 -> 134.56 -> 135 -> 1.35
		System.out.println(Math.round(1.3456 * 100) / (double) 100);

		// max(숫자1.숫자2),min(숫자1,숫자2)
		System.out.println(Math.max(100, 200));
		System.out.println(Math.max(200, 100));

		System.out.println(Math.min(200, 100));
		System.out.println(Math.min(100, 200));

		System.out.println(Math.random()); // 0.0 ~ 1.0 사이의 임의의 실수 1개 리턴
	}

	public void test1() {
		// 1970년 1월 1일 0시 부터 현재까지 몇 ms흘렀는지를 저장
		Date date1 = new Date(); // 객체가 생성되는 시점의 시스템 시간을 가져옴
		System.out.println(date1);
		// Date객체는 생성자가 2개(2개이외 추가로 있는 생성자는 모두 deprecate -> 없어질 예정인 생성자
		// 기본생성자 -> 현재 시스템 시간을 가져옴(객체 생성시점)
		// long 매개변수를 주는 형태로 사용하면 -> 기준시간에서 매개변수로 받은 시간만큼 흐른 시간을 가져옴
		Date date2 = new Date(0);
		System.out.println(date2);
		Date date3 = new Date(24 * 60 * 60 * 1000);
		System.out.println(date3);
		// Date는 날짜를 표현하기위한 객체
		// SimpelDateFormat : date타입을 원하는 형식의 문자열로 리턴해주는 객체
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

		String str1 = sdf1.format(date1);
		System.out.println(str1);

		// 년도 : yyyy or yy
		// 월 : M or MM or MMM or MMMM
		// 일 : d or dd
		// 요일 : E or EEEE
		// 오전/오후 : a
		// 시간 : H or HH or h or hh (대문자는 24시 표기, 소문자는 12시 표기)
		// 분 : m or mm
		// 초 : s or ss
		// 밀리초 : SSS
		SimpleDateFormat sdf2 = new SimpleDateFormat("a yyyy-MM-dd hh:mm:ss:SSS EEEE");
		String str2 = sdf2.format(date1);
		System.out.println(str2);
		String str3 = sdf2.format(date3);
		System.out.println(str3);
	}

	public void test3() {
		// Date 객체는 날짜 및 시간을 표현하는객체
		// 날짜 및 시간을 계산하고싶으면 Calendar객체 사용
		// Calendar의 생성자는 접근제어지지자가 protected
		// Calendar 객체의 getInstanc()메소드는 싱글톤방식으로 구현되어 있음
		Calendar time1 = Calendar.getInstance(); // getInstanc()메소드가 실행되는 시점의 시간을 캘린더객체로 리턴
		// Calendar 객체에서 정보를 가져오는 방법 -> 인스턴스저장한변수.get(알고싶은정보); -> 정보는 정수로 전달
		int year = time1.get(Calendar.YEAR); // 년도
		System.out.println(year);
		System.out.println(time1.get(Calendar.MONTH) + 1 + "월"); // 월(0~11 제공) -> 필요시 보정필요
		System.out.println(time1.get(Calendar.DATE) + "일"); // 일
		System.out.println(time1.get(Calendar.AM_PM));// AM : 0 / PM : 1
		System.out.println(time1.get(Calendar.HOUR) + "시");// 시간
		System.out.println(time1.get(Calendar.MINUTE) + "분");// 분
		System.out.println(time1.get(Calendar.SECOND) + "초");// 초
		System.out.println(time1.get(Calendar.MILLISECOND) + "밀리초");// 밀리초
		System.out.println(time1.get(Calendar.DAY_OF_WEEK));// 요일(1: 일요일 ~ 7: 토요일)
		System.out.println("---------------------------------------------------------------");
		Calendar day1 = Calendar.getInstance();

		System.out.println(day1.get(Calendar.YEAR));
		System.out.println(day1.get(Calendar.MONTH) + 1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));

		System.out.println("---------------------------------------------------------------");
		// 캘린더 객체의 정보를 변경 -> 2025/12/31
		day1.set(Calendar.DATE, 31); // 날짜를 31일로 변경(요일도 같이변경됨)
		System.out.println(day1.get(Calendar.YEAR));
		System.out.println(day1.get(Calendar.MONTH) + 1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));

		System.out.println("---------------------------------------------------------------");
		// 캘린더 객체의 정보를 변경 -> 2026/6/30
		day1.set(Calendar.YEAR, 2026); // 연도를 2026년으로 변경
		day1.set(Calendar.MONTH, 5); // 6월로 변경(아래 +1이므로 5입력)
		day1.set(Calendar.DATE, 30); // 날짜를 30일로 변경(요일도 같이변경됨)
		System.out.println(day1.get(Calendar.YEAR));
		System.out.println(day1.get(Calendar.MONTH) + 1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));
		System.out.println("---------------------------------------------------------------");
		day1.set(2035, 11, 31); // 따로안하고 한번에 변경가능
		System.out.println(day1.get(Calendar.YEAR));
		System.out.println(day1.get(Calendar.MONTH) + 1);
		System.out.println(day1.get(Calendar.DATE));
		System.out.println(day1.get(Calendar.DAY_OF_WEEK));
		System.out.println("---------------------------------------------------------------");

		Calendar day2 = Calendar.getInstance();
		// getTimeInMillis(); : 1970년 1월 1일 0시 부터 몇 ms초가 지났는지 long 타입으로 반환
		long time = day2.getTimeInMillis();
		System.out.println("time : " + time);
		long day = time / (24 * 60 - 60 - 1000);
		System.out.println("day : " + day);
		long year2 = day / 365;
		System.out.println("year : " + year2);

		System.out.println("---------------------------------------------------------------");
		Date date1 = new Date(time);
		System.out.println(date1);
		Date date2 = new Date(time + 24 * 60 * 60 * 1000);
		System.out.println(date2);
		System.out.println("---------------------------------------------------------------");
		// 2025-12-30
		String data1 = day2.get(Calendar.YEAR) + "-" + (day2.get(Calendar.MONTH) + 1) + "-" + day2.get(Calendar.DATE);
		System.out.println(data1);
		System.out.println("---------------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

		String data2 = sdf.format(date1);
		System.out.println(data1);
		System.out.println(data2);

	}
}
