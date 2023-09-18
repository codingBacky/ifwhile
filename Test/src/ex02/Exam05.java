package ex02;

public class Exam05 {

	public static void main(String[] args) {
		//두개의 주사위를 던졌을 때, 눈의 합이 6이되는 모든 경우의 수를 출력하는 프로그램
		int count = 0;
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j < 7; j++) {
				if(i+j == 6) {
				count += 1;
				System.out.println(i +" "+j);
				}
			}
		}
		System.out.println(count+"가지 방법이 있습니다");
	}
}
