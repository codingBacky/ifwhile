package ex02;

import java.util.Scanner;

public class Exam14 {

	
	//구구단 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = 0;
		boolean flag = true;
		while(flag) {
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("선택 > ");
		int num = scan.nextInt();
		
		switch (num) {
		case 1: 
			System.out.println("예금액 >");
			balance += scan.nextInt();
			break;
		case 2:
			System.out.println("출금액 >");
			balance -= scan.nextInt();
			break;
		case 3:
			System.out.println("잔고>"+balance);
			break;
		case 4:
			System.out.println("프로그램 종료");
			flag = false;
			break;
		}
		}

	}
				
	
		
}

