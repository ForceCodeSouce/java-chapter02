package chapter02;

public class StaticMethodTest {
	
	private int n;
	private static int m;
	
	public void f1() {
		n = 10; //인스턴스 변수
		// 원칙적으로 클래스 이름(namespace)로 접근해야 한다.
		// 하지만, 같은 클래스인 경우 생략 가능.
		// StaticMethodTest.m = 20
		m = 20;	//static 변수
	}
	
	public static void f2() {
		//에러
		//n = 10;
		m = 20;
	}
	
	public void f3() {
		f1();
		
		//StaticMetohdTest.f2()
		f2();
	}
	
	public static void f4() {
		//에러
		//f1();
		
		//static에서는 static 영역에 접근할수 있다.
		f2();
	}
	
	public static void main(String[] args) {
		f2();
		f4();
	}
	

}
