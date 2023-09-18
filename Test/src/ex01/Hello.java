package ex01;

import java.util.Scanner;

public class Hello {

	public final int MAX;
	
	public Hello() {
		MAX = 100;
	}
	public static void main(String[] args) {
		/*
		 * Hello h = new Hello(); System.out.println(h.MAX);
		 * System.out.printf("정수 : %5d, 실수 : %f, 문자열 : %s\n", 100, 10.2,"aaaa");
		 * System.out.printf("정수 : %5d, 실수 : %f, 문자열 : %s\n", 1, 10.2,"aaaa");
		 * System.out.printf("정수 : %5d, 실수 : %f, 문자열 : %s\n", 1000, 10.2,"aaaa");
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 >>");
		int number = scan.nextInt();
		
		int hour = number/3600;
		int minutes = (number%3600) % 60;
		int second = number % 60;
		scan.close();
		System.out.printf("%d시간 %d분 %d초\n", hour, minutes, second);
	}

}
