package ex02;

public class Exam03 {

	public static void main(String[] args) {
		//java 점수를 입력받아서 학점을 구하는 프로그램 구현
		//90이상 A 
		/*
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score >= 90)
			System.out.println("A");
		else if(score >= 80)
			System.out.println("B");
		else if(score >= 70)
			System.out.println("C");
		else if(score >= 60)
			System.out.println("D");
		else System.out.println("F");
		*/
		int[] num = {100,80,60};
		int numLength = num.length-1;
		int max=0;
		for(int i = 0; i < numLength; i++) {
			if(num[i]>max) max = num[i];
		}
		System.out.println(max);
		
		
		
		int n1=100, n2=80, n3=60;
		int maxVal, minVal;
		maxVal = minVal = 0;
		if(n1 >= n2) 
			if(n1 > n3)
				maxVal = n1;
		else maxVal = n3;
		else {
			if(n2 > n3)
				maxVal = n2;
			else
				maxVal = n3;
			}
		System.out.println("max : " + maxVal +"  min : "+ minVal);
		
	}
}
