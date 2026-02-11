package kh.java.func;

import java.util.Scanner;
import java.util.Random;

public class RandomClass {
	public void test1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 가위 바위 보 게임 ====");
		System.out.print("당신 선택 (1.가위 / 2.바위 / 3.보) : ");
		int user = sc.nextInt();

		int computer = 2;

		System.out.println("======== 결과 ========");
		System.out.println("당신은 " + choice(user) + "를 냈습니다.");
		System.out.println("컴퓨터는 " + choice(computer) + "를 냈습니다.");
		System.out.println("======================");

		if (user == computer) {
			System.out.println("비겼습니다.");
		} else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		} else {
			System.out.println("당신이 졌습니다.");
		}
	}

	static String choice(int num) {
		if (num == 1)
			return "가위";
		if (num == 2)
			return "바위";
		return "보";
	}

	public void randgame() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------난수 실습문제 실행파일------------");
			System.out.println("1.실습문제 4번(UpAndDown");
			System.out.println("2.실습문제 5번(BaskinRobbins)");
			System.out.println("3.실습문제 6번(Dice)");
			System.out.println("0.프로그램 종료");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.println("===== Up & Down Game =====");
			} else if (select == 2) {
				System.out.println("Game Start");
			} else if (select == 3) {
				System.out.println("Game Score");
			} else if (select == 4) {
				System.out.println("End Game");
			}
		}
	}

	public void updowngame() {

		Scanner sc = new Scanner(System.in);
	    Random rand = new Random();

	    int bestScore = 0;

	    while (true) {
	        System.out.println("===== Up & Down Game =====");
	        System.out.println("1. Game Start");
	        System.out.println("2. Game Score");
	        System.out.println("3. End Game");
	        System.out.print("선택 > ");

	        int menu = sc.nextInt();

	        if (menu == 1) {
	            int answer = rand.nextInt(100) + 1;
	            int count = 0;
	            int user;

	            System.out.println("<<Game Start>>");

	            while (true) {
	                System.out.print("숫자 입력 : ");
	                user = sc.nextInt();

	           
	                if (user < 1 || user > 99) {
	                    System.out.println("1부터 99 사이의 숫자만 입력하세요.");
	                    continue;
	                }

	                count++; 

	                if (user > answer) {
	                    System.out.println("DOWN");
	                } else if (user < answer) {
	                    System.out.println("UP");
	                } else {
	                    System.out.println("<<정답>>");
	                    System.out.println("시도 횟수 : " + count + "회");

	                    if (bestScore == 0 || count < bestScore) {
	                        bestScore = count;
	                    }
	                    break;
	                }
	            }

	        } else if (menu == 2) {
	            if (bestScore == 0) {
	                System.out.println("현재 기록 없습니다.");
	            } else {
	                System.out.println("현재 최고 기록은 " + bestScore + "회 입니다.");
	            }

	        } else if (menu == 3) {
	            System.out.println("게임을 종료합니다.");
	            break;

	        } else {
	            System.out.println("잘못입력했습니다. 메인으로 돌아갑니다.");
	        }

	        System.out.println();
	    }
	}

	public void baskinrobibins() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int menu;
		int win = 0;
		int lose = 0;

		while (true) {
			System.out.println("===== Baskin Robbins31 Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");
			menu = sc.nextInt();

			if (menu == 1) {
				int number = 0;
				boolean gameOver = false;
				boolean userWin = false;

				System.out.println("<< Game Start >>");

				while (!gameOver) {

					System.out.println("<< Your Turn >>");
					System.out.print("input Number : ");
					int userCount = sc.nextInt();

					if (userCount < 1 || userCount > 3) {
						System.out.println("1~3 사이 숫자만 입력하세요.");
						continue;
					}

					for (int i = 0; i < userCount; i++) {
						number++;
						System.out.println(number);

						if (number == 31) {
							System.out.println("유저 패배.");
							lose++;
							gameOver = true;
							break;
						}
					}

					if (gameOver)
						break;

					System.out.println("<< Computer Turn >>");
					int comCount = rand.nextInt(3) + 1;

					for (int i = 0; i < comCount; i++) {
						number++;
						System.out.println(number);

						if (number == 31) {
							System.out.println("유저 승리.");
							win++;
							userWin = true;
							gameOver = true;
							break;
						}
					}
				}

			} else if (menu == 2) {
				System.out.println("<<당신의 전적>>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);

			} else if (menu == 3) {
				System.out.println("게임을 종료합니다.");
				break;

			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}
	}

	public void dice() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int win = 0;
		int lose = 0;
		int draw = 0;
		int money = 10000;

		while (true) {
			System.out.println("===== Dice Game =====");
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print("선택 > ");

			int menu = sc.nextInt();

			if (menu == 1) {

				boolean play = true;

				while (play) {
					System.out.println("<< Game Start >>");

					int userSum = 0;
					for (int i = 1; i <= 3; i++) {
						int dice = rand.nextInt(6) + 1;
						userSum += dice;
						System.out.println(i + "번째 주사위 값 : " + dice);
					}

					System.out.println("내 주사위 총 합 : " + userSum);
					System.out.print("배팅 하시겠습니까[y/n] : ");
					String yn = sc.next();
					char ynChar = yn.charAt(0);

					if (ynChar == 'n') {
						System.out.println("메뉴로 돌아갑니다.");
						break;
					}

					System.out.print("얼마를 배팅하시겠습니까(현재 내 소지금 " + money + "원) : ");
					int bet = sc.nextInt();

					if (bet > money) {
						System.out.println("소지금이 부족합니다.");
						continue;
					}

					int comSum = 0;
					for (int i = 1; i <= 3; i++) {
						int dice = rand.nextInt(6) + 1;
						comSum += dice;
						System.out.println("컴퓨터 " + i + "번째 주사위 값 : " + dice);
					}

					System.out.println("컴퓨터 주사위 총 합 : " + comSum);
					System.out.println("<< 결과 >>");

					if (userSum > comSum) {
						System.out.println("승리");
						System.out.println("+" + bet + "원");
						money += bet;
						win++;
					} else if (userSum < comSum) {
						System.out.println("패배");
						System.out.println("-" + bet + "원");
						money -= bet;
						lose++;
					} else {
						System.out.println("무승부");
						draw++;
					}

					System.out.print("한번 더 하시겠습니까[y/n] : ");
					String again = sc.next();
					char againChar = again.charAt(0);

					if (againChar == 'n') {
						play = false;
					}
				}

			} else if (menu == 2) {

				System.out.println("<<당신의 전적>>");
				System.out.println("WIN : " + win);
				System.out.println("LOSE : " + lose);
				System.out.println("DRAW : " + draw);
				System.out.println("내 소지금 : " + money + "원");

			} else if (menu == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 선택입니다.");
			}
		}
	}
}