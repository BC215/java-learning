package kh.java.func;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamTest {

	public void primaryStream() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장 할 파일 이름 입력 : ");
		String filename = sc.nextLine();
		// 0.자원반환을 위해서 변수를 미리 선언
		// -> try구문안에서 선언하면finally에서 자원반환이 불가능하므로
		FileOutputStream fos = null;
		try {
			// FileOutputStream 객체를 생성하면서
			// 1) 지정된 경로에 해당파일명을 가진 파일과 스트림이 연결(연결프로그램 -> 파일)
			// 2) 지정된 경로에 파일이 없으면 -> 해당 파일명으로 새 파일을 만든후 연결
			// ->지정된 경로에 파일을 새로생성하고 스트림을 연결 ( 기존에 동일한 파일명이 있으면 덮어쓰기)
			// 파일 이름만 작성하면 현재 프로젝트폴더에 파일이 만들어짐
			// C드라이브 부터 경로를 입력하고 파일이름을 주면 그위치에 만들어짐
			fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\" + filename);// 1.스트림생성
			System.out.println("종료는 exit를 입력하세요");
			while (true) {
				System.out.print("내용 입력 : ");
				String msg = sc.nextLine() + "\r\n";
				if (msg.equals("exit" + "\r\n")) {
					break;
				}
				// FileOutputStream은 Bytestream으로 데이터를 내보낼떼 byte단위로 내보내야함
				// -> 문자열은 byte스트림으로 내보내기엔 너무큼 -> 문자열을 byte단위로 쪼개기
				byte[] data = msg.getBytes();
				fos.write(data); // 2.스트림을 통해서 파일에 데이터를 내보내기(메소드를 통한 출력)
			}

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close(); // 3.자원반환
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	}
}
