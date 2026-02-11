package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {
	public void testServer() {
		Scanner sc = new Scanner(System.in);
		// 1.서버에서 사용할 포트번호를 지정
		// 사용 가능한 포트번호 범위 : 0 ~ 65535 중 1개사용
		// 0~1000 사이의 포트번호는 잘알려진 포트번호로 일반적으로 사용하지 않음.
		int port = 7777;

		// 반환할 객체 미리 선언
		// 서버포트 열고 접속 기다리는 객체
		ServerSocket server = null;
		// 데이터를 주고받을때 사용할 보조 스트림
		DataInputStream dis = null;
		DataOutputStream dos = null;

		try {
			// 2.서버소켓 객체 생성
			// 생성자에 전달한 포트번호로 서비스 제공 예정
			server = new ServerSocket(port);
			System.out.println("서버 준비 완료");
			System.out.println("클라이언트 접속 기다리는중...");
			// 3.클라이언트 접속 요청 대기
			// 4. 클라이언트가 접속요청을 하면 수락해서 통신하기 위한 코드

			Socket socket = server.accept();// 클라이언트 접속을 기다리는 코드
			System.out.println("클라이언트가 접속했습니다");
			System.out.println("대화를 종료하려면 exit 를 입력해주세요.");
			// 5.데이터를 주고받기위한 스트림 추출(소켓 내부에 양방향 스트림이 이미 존재)
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			// 6.보조스트림을 성능/기능 개선
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			// 데이터 송/수신 준비 끝

			// 서버가 전송한 문자열을 수신해서 변수에 저장

			while (true) {
				// 서버가 클라이언트에게 보낼 메시지 입력
				System.out.print("To. Client  : ");
				String str = sc.nextLine();

				// 서버가 "exit"를 입력하면 클라이언트에게 알리고 종료
				dos.writeUTF(str);
				if (str.equals("exit")) {
					System.out.println("----------------------------------------------------.");
					System.out.println("채팅을 종료합니다.");
					break;
				}

				// 클라이언트로부터 메시지 수신 대기
				System.out.println("상대방이 입력중입니다...");
				String msg = dis.readUTF();

				// 클라이언트가 보낸 메시지가 "exit"이면 종료
				if (msg.equals("exit")) {
					System.out.println("----------------------------------------------------.");
					System.out.println("클라이언트가 종료를 요청했습니다.");
					System.out.println("채팅을 종료합니다.");
					break;
				} else {
					System.out.println("Client : " + msg);
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// 5.자원 반환
				server.close();
				dis.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
