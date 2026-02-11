package kh.java.func;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeServer {
	public void timeTest() {
		Scanner sc = new Scanner(System.in);
		// 1.서버에서 사용할 포트번호를 지정
		int port = 7878;

		ServerSocket server = null;
		DataOutputStream dos = null;

		try {
			server = new ServerSocket(port);

			System.out.println("클라이언트 접속 기다리는중...");

			Socket socket = server.accept(); // 클라이언트 접속을 기다리는 코드
			System.out.println("클라이언트 접속 완료");

			OutputStream out = socket.getOutputStream();

			dos = new DataOutputStream(out);

			String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("a hh:mm:ss"));

			dos.writeUTF(now);
			// System.out.println("[현재시간] : " + now);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 5.자원 반환
			try {
				if (dos != null) {
					dos.close();
				}
				if (server != null && !server.isClosed()) {
					server.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}