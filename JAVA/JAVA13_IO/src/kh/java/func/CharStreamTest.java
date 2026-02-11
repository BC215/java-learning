package kh.java.func;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamTest {

	Scanner sc;

	public CharStreamTest() {
		super();
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
	}

	public void primaryStream() {
		System.out.print("저장할 파일명 입력 : ");
		String filename = sc.nextLine();
		// 0.반환할 객체 미리 선언
		FileWriter fw = null;

		try {
			fw = new FileWriter(filename); // 1.파일 생성하고 스트림 연결(파일 생성 시점)
			System.out.println("종료는 exit");
			while (true) {
				System.out.print("내용 입력 : ");
				String str = sc.nextLine();

				if (str.equals("exit")) {
					break;
				}

				// 2. 출력메소드 사용
				// 문자스트림은 1문자 단위로 전송 -> 문자열을 매개변수로 주면 내부에서 알아서 처리
				fw.write(str + "\r\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 3.자원반환
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void subStream() {
		System.out.print("저장할 파일명 입력(보조스트림) : ");
		String filename = sc.nextLine();
		// 0.반환할 객체 선언
		// FileWriter fw = null;
		BufferedWriter bw = null; // 보조스트림으로 사용하면 자원반환시 보조스트림을 반환하면 주스트림은 자동으로 반환

		try {
			FileWriter fw = new FileWriter(filename); // 1.주 스트림 생성
			bw = new BufferedWriter(fw); // 보조 스트림 생성(보조스트림은 생성된 주스트림을 이용하여 생성)
			System.out.println("종료는 exit");
			while (true) {
				System.out.println("내용 입력 : ");
				String str = sc.nextLine();
				if (str.equals("exit")) {
					break;
				}
				bw.write(str);// 2.출력메소드 사용
				bw.newLine();// 보조스트림에만 있는 개행처리 메소드
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 3.자원반환
				bw.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public void readerTest() {
		System.out.print("불러올 파일명 입력 : ");
		String filename = sc.nextLine();

		// 0.반환할 객체 선언
		BufferedReader br = null;

		try {
			// 1.파일 내용을 읽어올 주스트림 생성
			// 이때 해당파일이 존재하지 않으면 바로 예외로 빠짐
			FileReader fr = new FileReader(filename);
			// 주스트림을 이용해서 보조스트림 생성
			br = new BufferedReader(fr);

			while (true) {
				// readLine(): 스트림이 연결된 파일에서 1줄을 문자열로 읽어옴
				String str = br.readLine();

				// readLine()이 호출될때마다
				// 더이상 읽어올 데이터가 없으면 null을 리턴
				if (str == null) {
					break;
				}

				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) { // readLine() 시 발생할 수 있는 예외 추가
			e.printStackTrace();
		} finally {
			try {
				// [수정] br이 null인 경우를 체크해야 NullPointerException을 방지할 수 있습니다.
				if (br != null) {
					br.close(); // 3.자원반환
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}