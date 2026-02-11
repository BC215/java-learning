package kh.java.func;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
	Scanner sc;

	public FileTest() {
		super();
		// TODO Auto-generated constructor stub
		this.sc = new Scanner(System.in);
	}

	public void test1() {
		System.out.print("파일명 입력 : ");
		String filename = sc.nextLine();
		// 파일객체
		// ->해당 파일의 정보를 얻어옴 -> FileNotfoundException을 처리하지 않아도 됨
		File file = new File(filename);
		// exists() : 해당파일이 존재하면 true / 존재하지 않으면 false 리턴하는 메소드
		if (file.exists()) {
			System.out.println("파일 있음");
			System.out.println("파일 이름 : " + file.getName());
			System.out.println("파일 상대경로 : " + file.getPath());
			System.out.println("파일 절대경로 : " + file.getAbsolutePath());
			System.out.println("파일 크리 : " + file.length() + "Byte");
			System.out.println("해당 파일을 삭제하시겠습니까(1.yes)?");
			int select = sc.nextInt();
			if (select == 1) {
				// delete() : 파일을 삭제하고 삭제결과를 리턴(지워지면 true / 못지웠으면 false)
				boolean result = file.delete();
				System.out.println(result);
			}
		} else {
			System.out.println("파일 없음");
		}
	}

	public void test2() {
		// 저장하려는 파일이름이 겹치는경우
		// -> 넘버링 파일이름(1).jpg
		System.out.println("저장 할 파일 이름 입력 : ");
		String filename = sc.next();
		File file = new File(filename);

		// 파일명 중복을 처리하기위한 변수 (최종 저장 경로)
		String filepath = filename;

		if (file.exists()) {
			// test.txt
			// test .txt
			// -> 파일명이 겹쳐서 숫자가 붙은 위치는 확장자 이전 -> 마지막 .의 위치를 찾아야함
			int dotIndex = filename.lastIndexOf(".");
			// 문자열 시작부터 . 앞까지 복사 -> test
			String onlyFilename = filename.substring(0, dotIndex);
			// 문자열 . 부터 끝까지 복사 -> .txt
			String extention = filename.substring(dotIndex);

			// 중복된 파일명이 있으면 뒤에 붙일 숫자
			int count = 1; // 0보다는 1부터 붙이는 것이 일반적입니다.
			while (true) {
				filepath = onlyFilename + "(" + count + ")" + extention;
				// 중복파일 체크
				File dupCheck = new File(filepath);
				if (dupCheck.exists()) {
					count++;
				} else {
					break;
				}
			}
		} else {
			// 이때는 해당 파일명이 중복이 아니므로 입력받은 파일명으로 저장
			// filepath = filename; (위에서 이미 초기화됨)
		}

		try {
			// 결정된 filepath로 실제 파일 생성
			File saveFile = new File(filepath);
			if (saveFile.createNewFile()) {
				System.out.println(filepath + " 파일이 성공적으로 생성되었습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test3() {
		// 저장하려는 파일이름이 겹치는경우
		// -> 덮어쓸지 물어보고 덮어 쓴다고하면 덮어쓰고 아니면 새로입력

		System.out.print("저장 할 파일 이름 입력: ");
		String filename = sc.next(); //
		File dupCheck = new File(filename);

		if (dupCheck.exists()) {
			// 중복된 파일명입니다. 덮어쓰시겠습니까(1.yes/2.no)?
			System.out.print("중복된 파일명입니다. 덮어쓰시겠습니까(1.yes/2.no)?");
			int select = sc.nextInt();

			if (select == 1) {
				// Yes를 선택하면 아래 try 블록으로 진행 (덮어쓰기)
				System.out.println("기존 파일을 덮어씁니다.");
			} else if (select == 2) {
				// No를 선택하면 메소드를 종료하고 파일명을 다시 입력
				System.out.println("파일명을 다시 입력하세요.");
				return; // 메소드 즉시 종료
			}
		} else {

		}

		try {
			FileOutputStream fos = new FileOutputStream(filename);

			System.out.println("성공적으로 저장되었습니다.");
			fos.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}