package ex02;

public class Exam08 {

	public static void main(String[] args) {
		//문자열이 "12345"이면 개별문자로 분리해서 합을 구하는 프로그램 구현(합 15)
		//String 클래스 charAt(int i)를 이용
		String str = "12345";
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i)-'0';
			//ascii코드에서 0 = 48이다. -'0'이나 -48을 해줘야 원하는 정수값을 가질수 있다.
			System.out.println(str.charAt(i));
			
		}
		System.out.println("sum : " + sum);
	}
}
