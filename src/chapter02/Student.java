package chapter02;

public class Student extends Person{
	
	public Student() {
		//1. 자식 생성자에서 부모 생성자는 반드시 호출된다.
		//2. 그래서 코드에 명시적인 부모 생성자 호출이 없는 경우
		//		컴파일러가 자동으로 부모의 기본생성자 호출을 넣어준다.
		//부모의 생성자를 호출하는 것을 자동으로 넣어준다.
		
		//암시적 부모 기본생성자 호출
		//super();	//이것이 생략되어 있는것.
		
		//명시적으로 부모 생성자 호출 시에는
		//자동으로 부모의 기본생서자 호출을 하지 않는다.
		
		super("안태영");	//super는 자식보다 반드시 먼저 호출되어야 한다.
		
		System.out.println("Student() called");
	}

}
