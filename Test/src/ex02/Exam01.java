package ex02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.nextLine();//버퍼를 비워줘야함
		String str = scan.nextLine();
		
		System.out.println(number);
		System.out.println(str);
	}
}
