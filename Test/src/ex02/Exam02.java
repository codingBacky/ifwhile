package ex02;

public class Exam02 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 3; i++) {
			sum += i;
		System.out.println("sum:"+ sum);
		System.out.println("i:"+ i);}
		sum = 0;
		for (int i = 1; i < 3; ++i){
			sum += i;
		System.out.println("sum:"+ sum);
		System.out.println("i:"+ i);}
	}
}
