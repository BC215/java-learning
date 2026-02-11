package kh.java.func;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StreamTest {

	// quiz.txt파일 내용을 읽어서 quiz.gif파일로 내보내기
	public void test1() {
		// 보조스트림을 사용하는 버전
		// quiz.txt 파일에서 내용을 읽어옴 -> InputStream, Reader
		// -> 읽어올 데이터가 긴 문자열 1줄 -> Reader
		// 0.파일에서 데이터를 읽어올 보조스트림
		BufferedReader br = null;

		// quiz.gif로 내보냄 -> OutputStream, Writer
		// -> 내보낼 데이터가 이미지 -> OutputStream
		// 0.파일을 내보낼 보조스트림
		BufferedOutputStream bos = null; // BufferedOutputStream을 사용하도록 선언

		try {
			// 1.파일내용을 읽어오기 위한 주스트림 생성
			FileReader fr = new FileReader("quiz.txt");
			// 주스트림을 이용하여 보조 스트림 생성
			br = new BufferedReader(fr);

			// 1. 파일 내보내기 위한 주스트림 생성
			FileOutputStream fos = new FileOutputStream("quiz.gif");
			// 보조 스트림 연결
			bos = new BufferedOutputStream(fos);

			// quiz.txt.는 1줄짜리 긴 문자열 -> 1줄만 읽어오면 전체 파일을 다 읽어옴
			System.out.println("파일 읽어오기 전");
			String str = br.readLine();
			System.out.println("파일 읽어온 후");

			// 읽어온 문자열 형태 -> 10진수 공백 10진수 공백...
			// 공백을 제거한 문자열을 byte배열(ArrayList<Byte>)로 변환
			ArrayList<Byte> list = new ArrayList<Byte>();
			// 문자열에서 공백기준으로 잘라서 토큰형태로 변환
			StringTokenizer ST = new StringTokenizer(str, " ");
			while (ST.hasMoreTokens()) {
				String data = ST.nextToken();
				int iNum = Integer.parseInt(data);
				byte num = (byte) iNum;
				list.add(num);
			}
			System.out.println(list.size());

			System.out.println("내보내기 시작");
			for (byte b : list) {
				bos.write(b);
			}
			System.out.println("내보내기 끝");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("데이터 형식 오류");
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void test2() {
		// 보조스트림을 사용하지 않는 버전
		// quiz.txt를 읽어오기위한 주스트림선언
		FileReader fr = null;
		// quiz1.gif로 내보내기위한 주스트림 선언
		FileOutputStream fos = null;

		try {
			// 1.파일을 읽어오기 위한 주스트림 생성
			fr = new FileReader("quiz.txt");
			StringBuilder sb = new StringBuilder();

			// read(): 문자 1개 읽어옴
			// read()는 더이상 읽어올 문자가 없으면 -1을 리턴
			int data;
			while ((data = fr.read()) != -1) {
				char ch = (char) data;
				sb.append(ch);
			}

			// 파일 쓰기 스트림 생성 및 데이터 쓰기
			fos = new FileOutputStream("quiz1.gif");

			// 읽어온 문자열 형태 -> 10진수 공백 10진수 공백...
			ArrayList<Byte> list = new ArrayList<Byte>();
			StringTokenizer ST = new StringTokenizer(sb.toString(), " ");

			while (ST.hasMoreTokens()) {
				String byteStr = ST.nextToken();
				int iNum = Integer.parseInt(byteStr);
				byte num = (byte) iNum;
				list.add(num);
			}

			// ArrayList에 저장된 byte 데이터를 fos를 통해 파일에 직접 쓰기
			for (byte b : list) {
				fos.write(b);
			}

			System.out.println("이미지 복원 완료: quiz1.gif");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("데이터 형식 오류");
			e.printStackTrace();
		} finally {
			// 반납
			try {
				if (fr != null)
					fr.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
