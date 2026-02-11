package kj.java.test2;

import java.util.Scanner;

public class TV {
	// TV 객체
	// 속성 : 크기 / 전원 /볼륨 / 채널 -
	// 기능 : 전원 On,Off / 채널 1증가 / 채널 1감소 / 볼륨 1증가 / 볼륨 1감소 / 숫자 입력하여 채널 변경
	// 속성 -> 전역변수
	// 기능 -> 메소드
	// 전역변수는 지역변수와 다르게 선언만 하면 기본값 세팅이 됨(숫자 : 0, 문자 : ' ', 논리: false, 참조형: null)

	int inch; // 0
	boolean power; // false
	int volume; // 0
	int channel1; // 0

	public void poweronoff() {
		// 현재 전원상태를 반전(켜진경우 끄고 꺼진경우 키고)
		// power 값을 변환 : false -> true(전원켜기) / true->false(전원끄기)
		power = !power;
		if (power) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");

		}
	}

	public void volumup() {
		// 현재 볼륨을 1 증가
		volume++;
		System.out.println("현재 볼륨 : " + volume);
	}

	public void volumedown() {
		// 현재 볼륨을 1 감소
		volume--;
		System.out.println("현재 볼륨 : " + volume);
	}

	public void channelup() {
		// 현재 채널 1증가
		channel1++;
		System.out.println("현재 채널 : " + channel1);

	}

	public void channeldown() {
		// 현재 채널 1 감소
		channel1--;
		System.out.println("현재 채널 : " + channel1);

	}

	public void changchannel1() {
		// 숫자를 입력받아서 입력받은 숫자로 채널을 변경
		Scanner sc = new Scanner(System.in);
		System.out.print("채널 번호 입력 : ");
		int input = sc.nextInt();
		channel1 = input;
		System.out.println("현재 채널 : " + channel1);

	}

	public void startTv() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("========내가 처음 만들어본 TV========");
			System.out.println("1. 전원버튼");
			System.out.println("2. 채널 올리기");
			System.out.println("3. 채널 내리기");
			System.out.println("4. 채널 입력하기");
			System.out.println("5. 볼륨 올리기");
			System.out.println("6. 볼륨 내리기");
			System.out.println("0. TV 버리기");
			System.out.print("선택 >>  ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				poweronoff();
				break;
			case 2:
				channelup();
				break;
			case 3:
				channeldown();
				break;
			case 4:
				changchannel1();
				break;
			case 5:
				volumup();
				break;
			case 6:
				volumedown();
				break;
			case 7: // 출력시 지정된 초만큼 딜레이 거는 방법
				System.out.println("    0    ");
				sleep(300);
				System.out.println("    0    ");
				sleep(300);
				System.out.println("    0    ");
				sleep(300);
				System.out.println("    0    ");
				sleep(300);
				System.out.println("    0    ");
				sleep(300);
				System.out.println("    0    ");
				sleep(300);
				System.out.println("    0    ");
				sleep(300);
				System.out.println("    0    ");
				sleep(300);

				break;
			case 0:
				return;// 데이터를 되돌려주면서 즉시 메소드 종료(리턴 타입이 void면 메소드 그냥종료)
			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}// switch
		} // while
	}// method

	public void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
