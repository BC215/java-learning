package kh.java.func;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class DnsServer {
	Scanner sc = new Scanner(System.in);

	public void dnsTest() {

		HashMap<String, String> dnsMap = new HashMap<>();
		dnsMap.put("www.naver.com", "125.209.222.142");
		dnsMap.put("www.google.com", "172.217.175.4");
		dnsMap.put("www.kh-academy.co.kr", "211.43.14.187");

		int port = 8888;
		ServerSocket sS = null;

		try {
			sS = new ServerSocket(port);
			System.out.println("DNS 서버 준비완료");

			while (true) {
				Socket client = null;
				try {
					client = sS.accept();
					System.out.println("클라이언트 요청대기");

					Scanner reader = new Scanner(client.getInputStream());
					PrintWriter writer = new PrintWriter(client.getOutputStream(), true);

					String domain = reader.nextLine();
					System.out.println("요청 받은 도메인: " + domain);

					String ip = dnsMap.get(domain);
					if (domain == null) {
						domain = "해당 도메인의 IP 정보가 없습니다.";
					} else {
						System.out.println("[" + domain + "] 의 주소는 " + ip + " 입니다");
					}

					writer.println(ip);
					System.out.println("응답 완료 및 연결 종료\n");

				} catch (Exception e) {

				} finally {

					if (client != null) {
						try {
							client.close();
						} catch (IOException e) {

						}
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 서버 소켓 종료 처리
			if (sS != null) {
				try {
					sS.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}