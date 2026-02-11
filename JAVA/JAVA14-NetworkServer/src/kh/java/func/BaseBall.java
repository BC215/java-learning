package kh.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

public class BaseBall {
	public void baseball() {
		Random r = new Random();
		int serverPort = 9999;
		ServerSocket server = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		ArrayList<Integer> player = new ArrayList<Integer>();
		ArrayList<Integer> com = new ArrayList<Integer>();
		int count = 0;
		int strike = 0;
		int ball = 0;

		try {
			server = new ServerSocket(serverPort);
			System.out.println("<====Baseball Game====>");
			System.out.println("클라이언트 접속 대기중입니다....");
			Socket socket = server.accept();
			System.out.println("클라이언트가 접속 했습니다.");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			dis = new DataInputStream(in);
			dos = new DataOutputStream(out);
			for (int i = 0; i < 3; i++) {
				int num = r.nextInt(9) + 1;
				com.add(num);
			}
			System.out.println("서버 숫자 :" + com.get(0) + com.get(1) + com.get(2));
			System.out.println("<====Game Start====>");
			while (dis.readBoolean()) {
				player.clear();
				for (int i = 0; i < 3; i++) {
					int num = dis.readInt();
					player.add(num);
				}
				System.out.println("클라이언트가 입력한수 :" + player.get(0) + player.get(1) + player.get(2));
				for (int i = 0; i < 3; i++) {
					if (player.get(i) == com.get(i)) {
						strike++;
					} else if (com.contains(player.get(i))) {
						ball++;
					}
				}
				dos.writeInt(strike);
				dos.writeInt(ball);
				count++;
			}
			System.out.println("시도 횟수 " + count + "회로 종료합니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
