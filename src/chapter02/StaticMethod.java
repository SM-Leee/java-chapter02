package chapter02;

public class StaticMethod {
	
	private int n;
	private static int m;
	
	public void f1() {
		n = 10;
		m = 20;
		//원칙적으로는 클래스이름(네임스페이스)로 접근해야 한다.
		//하지만 같은 클래스인 경우 생략 가능
		//StaticMethod.m = 20;
	}
	
	public static void f2() {
		// 에러 : static 함수 안에서는 instance변수는 쓸수없다, 그런데 같은 static인 경우에는 가능하다.
		//n = 10;
		m = 20;
		
	}
	public void f3() {
		f1();
		f2();
		//StaticMethod.f2();
	}
	public static void f4() {
		// 에러 : static은 변수던 함수던 static만 쓸수 있다.
		//f1();
		f2();
	}
	
	public static void main(String[] args) {
		f2();
		f4();
		//static 함수안에서는 static만 쓸수있지만, 객체 생성하여 다른 함수들을 쓸수있다.
	}
	
}
