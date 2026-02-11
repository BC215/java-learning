package kj.java.test2;

import java.util.Scanner;

public class MySmartPhone {
	boolean power = false;
	int battery = 50; // 기본 배터리 50%
	String home = "홈 화면";

	public void startPhone() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n======== Phone ========");

			if (power == true) {
				System.out.println("상태: [ON] " + home);
			} else {
				System.out.println("상태: [OFF]");
			}

			System.out.println("배터리: " + battery + "%");
			System.out.println("--------------------------------");
			System.out.println("1. 전원 버튼");
			System.out.println("2. 유튜브 실행");
			System.out.println("3. SNS 실행");
			System.out.println("4. 충전기 연결");
			System.out.println("5. 배터리 상태 체크");
			System.out.println("0. 종료하기");
			System.out.print("선택 >> ");

			int select = sc.nextInt();

			if (power == false && select > 1) {
				System.out.print("잠시만 기다려주세요");
				for (int i = 0; i < 5; i++) {
					System.out.print(".");
					sleep(400);
				}
				System.out.println();
				System.out.println("먼저 전원을 켜주세요!");
				continue;
			}

			switch (select) {
			case 1:
				poweronoff();
				break;
			case 2:
				runApp("YouTube");
				break;
			case 3:
				runApp("SNS");
				break;
			case 4:
				chargeBattery();
				break;
			case 5:
				batteryCheck();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				for (int i = 0; i < 5; i++) {
					System.out.print(".");
					sleep(400);
				}
				System.out.println();
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	// 전원
	public void poweronoff() {

		power = !power;

		if (power == true) {
			System.out.print("부팅중");
			for (int i = 0; i < 10; i++) {
				System.out.print(".");
				sleep(400);
			}
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("핸드폰이 켜졌습니다.");
			sleep(400);
		} else {
			System.out.print("종료중");
			for (int i = 0; i < 10; i++) {
				System.out.print(".");
				sleep(400);
			}
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("핸드폰이 꺼졌습니다.");
			sleep(400);
		}
	}

	// 앱실행시 배터리소모 및 경고
	public void runApp(String appName) {
		if (battery < 10) {
			for (int i = 0; i < 5; i++) {
				System.out.print(".");
				sleep(400);
			}
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println("배터리가 부족하여 앱을 실행할 수 없습니다.");
			return;
		}
		// 앱기동
		home = appName;
		System.out.print(appName + " 실행중");
		for (int i = 0; i < 5; i++) {
			System.out.print(".");
			sleep(400);
		}
		System.out.println();
		sleep(300);
		System.out.println("--------------------------------");
		System.out.println(appName + "실행완료");
		battery -= 10; // 앱 실행 시 배터리 10 감소
	}

	// 충전
	public void chargeBattery() {
		System.out.println("고속충전중");
		for (int i = 0; i < 5; i++) {
			System.out.print("⚡️");
			sleep(400);
		}
		System.out.println();
		System.out.println("--------------------------------");
		battery = battery + 20;
		if (battery > 100) {
			battery = 100;
		}
		sleep(400);
		System.out.println("충전완료. 현재 배터리: " + battery + "%");
	}

	public void batteryCheck() {
		System.out.print("배터리 검사 중");
		for (int i = 0; i < 5; i++) {
			System.out.print(".");
			sleep(400);
		}
		System.out.println("--------------------------------");
		System.out.println("\n[검사 결과] 배터리 성능 상태 정상");
	}

	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}