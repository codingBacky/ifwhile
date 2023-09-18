package ex02;

public class Exam06 {

	//두정수 합을 구하는 함수
	//반환타입 있고, 매개변수 있는 유형
	public static void main(String[] args) {
		float sum = add(10.0f,(float)20.0);
		//float라고 알려주지 않으면 기본형으로 double형으로 해석함
	}
	//          반환타입 함수명(매개변수)
	public static float add(float n1, float n2) {
		return n1+n2;
	}
}
