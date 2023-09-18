package ex02;

import java.util.Scanner;

public class Exam13 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료\n");
		int choi = scan.nextInt();
		if (choi == 4) System.out.println("프로그램 종료");
		
		int account = scan.nextInt();
		int accountTotal = 0;
		if (choi == 1) {
			accountTotal += account;
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("선택 > " + choi);
			System.out.println("예금액 > " +account);
		}else if (choi == 2) {
			accountTotal -= account;
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("선택 > " + choi);
			System.out.println("출금액 > " +account);
		}else if (choi == 3) {
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("선택 > " + choi);
			System.out.println("잔고 > " + accountTotal);
		}
				
	}
		
}

