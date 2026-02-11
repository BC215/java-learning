package kh.java.test.function;

import java.util.Scanner;

public class Exmaple {

	public void exam1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();		
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		double avg = (double)sum / 3;
 
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f \n",avg);
		
		String result = (kor >= 40) ?
		 					(eng >= 40) ? 
								(math >= 40) ? 
										(avg >= 60) ? "합격":"불합격"
										:"불합격"
								   	:"불합격"
								:"불합격";
		String result2 = (kor >= 40) && (eng>= 40) && (math >=40) && (avg >=60) ? "합격" : "불합격";
	   System.out.println(result2);	
	   

	}
	
	public void exam6() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수입력 : ");
		int num = sc.nextInt();
		//입력받은 정수가 홀수인지 짝수인지 출력 -> 어떤수를 2로 나눴을때 나누어 떨어지면 짝수
		// -> 나누어 떨어진다 -> 나눴을때 나머지가 0
		String result = (num % 2== 0) ? "짝수!" : "홀수!";
		System.out.println(result);
		
	}
	
}
