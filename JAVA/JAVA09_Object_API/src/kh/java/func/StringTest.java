package kh.java.func;

import java.util.Random;
import java.util.StringTokenizer;

public class StringTest {
	public void test1() {
		// 다른클래스를 객체로 사용할때 import 생략 가능한 경우
		// 1) 같은 패키지 내부에 있는 클래스인경우
		// 2)java.lang 패키지 내부에 있는 클래스들은 import 없이 사용 가능
		StringBuilder sb = new StringBuilder();
		System.out.println("문자열 길이 : " + sb.length());
		// StirngBuilder는 toString을 오버라이딩
		// -> toString 호출시 저장된 문자열을 그대로 반환
		System.out.println(sb.toString());
		sb.append(1);
		// append(param) : 현재 저장된 문자열에 매개변수로 전달한 값을 맨뒤에 추가
		// append는 오버로딩으로 여러 자료형을 추가할수있게 구현되어있음
		sb.append("test");
		System.out.println("문자열 길이 : " + sb.length());
		System.out.println(sb.toString());
		sb.append(1);
		// insert(정수.데이터): 첫번째 매개변수 위치에 두번째 매개변수 데이터를 삽입
		sb.insert(3, "data");
		System.out.println("문자열 길이 : " + sb.length());
		System.out.println(sb.toString());
		// replace(정수.정수.데이터): 첫번째 매개변수 위치부터 두번째 매개변수 앞까지를 세번째 매개변수로 변환
		sb.replace(3, 9, "수정구문");
		System.out.println("문자열 길이 : " + sb.length());
		System.out.println(sb.toString());
		// for(int i=3;i<9;i++)
		// delete(정수,정수) : 첫번째 매개변수 위치부터 두번째 매개변수 앞까지를 삭제
		sb.delete(3, 9);
		System.out.println("문자열 길이 : " + sb.length());
		System.out.println(sb.toString());
		// reverse() : 현재 문자열 순서를 뒤집음
		sb.reverse();
		System.out.println("문자열 길이 : " + sb.length());
		System.out.println(sb.toString());
	}

	public void test2() {
		// 회원가입시 이메일 or 전화번호 인증하는 랜덤 코드 생성
		// 조합 -> 영어 대문자 / 영어 소문자 / 숫자중 랜덤으로 8자리 코드 생성
		Random r = new Random();
		StringBuilder sb = new StringBuilder();// ""
		for (int i = 0; i < 8; i++) {
			// 이번 반복회차에서 대문자/소문자/숫자중 하나를 랜덤으로 선택
			int flag = r.nextInt(3); // 0:숫자, 1:대문자,2:소문자
			if (flag == 0) {
				int randomNum = r.nextInt(10); // 0 ~9 사이 랜덤수
				sb.append(randomNum);
			} else if (flag == 1) {
				int randomNum = r.nextInt(26) + 65;
				char ch = (char) randomNum;
				; // 65~//대문자
				sb.append(ch);
			} else if (flag == 2) {
				int randomNum = r.nextInt(26) + 97; // 97~//소문자
				char ch = (char) randomNum;
				sb.append(ch);
			}
			System.out.println(sb.toString());
		}
	}

	public void test3() {
		// String 클래스에서 자주 사용하는 메소드
		String str1 = "AbcdEfg";
		// toUpperCase() : 문자열을 모두 대문자로 변환해서 리턴(원본문자열은 영향X)
		String str2 = str1.toUpperCase();
		System.out.println(str2);
		System.out.println(str1);
		// toLowerCase() : 문자열을 모두 소문자로 변환해서 리턴(원본문자열 영향X)
		System.out.println(str1.toLowerCase());
		System.out.println(str1);
		// 알파벳에 한해서만 적용이됨 ↓
		String str3 = "한글과 특수문자 @@@###!!!가 섞인 AbcDEFgh";
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());

		String str4 = "abcdabcd";
		// replace(문자열1,문자열2) : 문자열1을 찾아서 문자열2로 대체한 후 리턴(원본문자열 영향X)
		String str5 = str4.replace("a", "A");
		System.out.println(str5);
		System.out.println(str4);

		// indexOf(문자열) : 매개변수로 준 문자열을 찾아서 그 위치를 정수로 리턴
		// -> 문자열 가장 앞에서 부터 검색하다 만난 위치를 리턴
		// -> 매개변수로 준 문자열을 찾지 못하면 -1을 리턴
		int num1 = str4.indexOf("c");
		System.out.println(num1);
		// lastIndexof(문자열) : 매개변수로 준 문자열을 찾아서 그 위치를 정수로 리턴
		// -> 문자열 가장 뒤에서 부터 검색하다가 만난위치를 리턴
		// -> 매개변수로 준 문자열을 찾지못하면 -1을 리턴
		int num2 = str4.lastIndexOf("c");
		System.out.println(num2);

		String str6 = "abcdefghijk";
		// substring(정수1,정수2) : 문자열 중 정수1위치부터 정수2 앞까지를 리턴
		String str7 = str6.substring(3, 7);
		System.out.println(str7);
		System.out.println(str6);
		// substring(정수1) : 문자열중 정수1 위치부터 끝까지 출력
		String str8 = str6.substring(3);
		System.out.println(str8);
		System.out.println(str6);

		String filename = "abcd.txt";// abcd .txt
		int dot = filename.lastIndexOf(".");
		System.out.println(dot);
		String onlyFilename = filename.substring(0, dot); // abcd
		String extension = filename.substring(dot); // .txt
		String newFilename = onlyFilename + "(1)" + extension;
		System.out.println(newFilename);

		// split(문자열) : 매개변수로 준 문자열을 기준으로 문자열을 자름 -> 문자열배열로 리턴
		String str9 = "이병창/수원/학생/KH";
		String[] arr = str9.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(str9);

		// length() : 문자열의 길이를 정수로 리턴
		String str10 = "abcDEF";
		System.out.println(str10.length());

		// charAt(매개변수) : 문자열중 매개변수로 받은 인덱스에 있는 문자열을 문자형태로 리턴

		char ch = str10.charAt(3);
		System.out.println(ch);
	}

	public void test4() {
		String str = "이병창/수원/학생/KH";
		// 첫번째 매개변수의 문자열을 두번째 매개변수 문자열을 기준으로 잘라서 토큰으로 관리하는 객체
		StringTokenizer st = new StringTokenizer(str, "/");
		while (st.hasMoreTokens()) {
			String str1 = st.nextToken();
			System.out.println(str1);
		}
		// int count = st.countTokens();

		// for (int i = 0; i < count; i++) {
		// String str1 = st.nextToken();
		// System.out.println(str1);

		// int count = st.countTokens(); // 현재 저장되어있는 토큰의 수를 리턴
		// System.out.println(count);
		// String str1 = st.nextToken(); // 현재 남아있는 토큰중 가장 앞의 토큰을 꺼내옴
		// System.out.println(str1);
		// count = st.countTokens();
		// System.out.println(count);
		// str1 = st,nextToken();

	}
}
