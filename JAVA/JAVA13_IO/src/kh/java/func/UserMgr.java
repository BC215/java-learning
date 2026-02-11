package kh.java.func;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserMgr {
	Scanner sc;
	User user;

	public UserMgr() {
		super();
		// TODO Auto-generated constructor stub
		sc = new Scanner(System.in);
		// importUser(); // UserMgr객체가 만들어질때 backup파일 정보를 읽어와서 전역변수 User에 대입하는 메소드 호출
	}

	public void main() {
		while (true) {
			System.out.println("1. 회원 정보 등록");
			System.out.println("2. 회원 정보 출력");
			System.out.println("3. 회원 정보 내보내기");
			System.out.println("4. 회원 정보 불러오기");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				inserUser();
				break;
			case 2:
				printUser();
				break;
			case 3:
				exportUser2();
				break;
			case 4:
				importUser();
				break;
			case 0:
				return;
			}

		}
	}

	public void inserUser() {
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		// 생성자 public User(String id, String pw, String name, int age) 호출
		user = new User(id, pw, name, age);
		// exportUser(); // 새정보를 바로 내보내기
		System.out.println("등록 완료 ");
	}

	public void printUser() {
		// 전역변수 user에 있는 회원정보 출력
		// 단 user에 null이 있으면 " 회원정보 없습니다" 출력

		if (user == null) {
			System.out.println("회원정보 없습니다.");
		} else {

			System.out.println("ID : " + user.getId());
			System.out.println("PW : " + user.getPw());
			System.out.println("이름 : " + user.getName());
			System.out.println("나이 : " + user.getAge());
		}
	}

	public void exportUser() {
		// user에 들어있는 정보를 id/pw/name/age형태로 문자열로 만들어서 back.txt 파일로 저장
		if (user == null) {
			System.out.println("내보낼 회원 정보가 없습니다.");
		} else {
			String exportData = user.getId() + "/" + user.getPw() + "/" + user.getName() + "/" + user.getAge();
			// 내보낼 데이터 아이디.비밀번호/이름/나이 형태의 문자열 -> Writer
			// 0.보조스트림 선언
			BufferedWriter bw = null;

			try {
				// 1.데이터를 내보낼 주스트림 생성
				FileWriter fw = new FileWriter("backup.txt");
				// 주 스트림을 이용해서 보조스트림 생성
				bw = new BufferedWriter(fw);
				// 2.메소드를 이용한 데이터 내보내기
				bw.write(exportData);
				System.out.println("회원 정보 내보내기 완료.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					// 3.자원반환
					bw.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}

		}
	}// exportUser 종료

	public void importUser() {
		// backup.txt 파일 데이터 읽어오기
		// 읽어온 데이터를 전역변수 user에 저장

		// backup.txt 파일이 있는지 체크
		File checkFile = new File("backup.txt");
		if (checkFile.exists()) {
			// 읽어올 데이터가 backup.txt파일 내부에 있는 글씨 -> Reader
			// 0. 보조스트림 선언
			BufferedReader br = null;

			try {
				// 1.데이터를 읽어올 주스트림 생성
				FileReader fr = new FileReader("backup.txt");
				// 생성된 주스트림으로 보조스트림 생성
				br = new BufferedReader(fr);
				// 2.메소드를 통해서 데이터 읽어오기
				String str = br.readLine();
				String[] arr = str.split("/");
				String id = arr[0];
				String pw = arr[1];
				String name = arr[2];
				int age = Integer.parseInt(arr[3]);
				user = new User(id, pw, name, age);
				// System.out.println("정보 불러오기 완료");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("백업 파일이 존재하지 않습니다.");
		}
	}

	public void exportUser2() {
// 전역변수 user에 있는 정보를 내보내는 기능
		if (user == null) {
			System.out.println("내보낼 정보가 없습니다.");
		} else {
			// 객체를 직렬화 해서 내보내는 보조스트림 선언
			ObjectOutputStream oos = null;

			try {

				// 1.데이터를 내보낼 주 스트림 생성
				FileOutputStream fos = new FileOutputStream("backup1.txt");
				// 주스트림 이용해서 보조스트림 생성
				oos = new ObjectOutputStream(fos);
				// 2.메소드를 통해서 객체 내보내기
				oos.writeObject(user);
				System.out.println("객체 내보내기 완료");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void importUser2() throws ClassNotFoundException {
		// backup1.txt에 있는 객체 정보 불러오기
		File checkFile = new File("backup1.txt");
		if (checkFile.exists()) {
			// 0.내보내진 객체를 읽어와서 역질렬화 하는 보조스트림 선언
			ObjectInputStream ois = null;

			try {
				// 1.데이터를 불러올 주 스트림 생성
				FileInputStream fis = new FileInputStream("backup1.txt");
				// 생성된 주 스트림에 부 스트림 생성
				// 2.메소드로 데이터 읽어옴
				ois = new ObjectInputStream(fis);
				Object obj = ois.readObject();
				user = (User) obj;
				System.out.println("불러오기 성공");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} else {
			System.out.println("불러올 정보가 없습니다.");
		}
	}
}