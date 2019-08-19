package chapter02;

public class Person {
	
	private String name;
	
	
	//기본생성자
	public Person() {
		super();
	}



	//생성자가 하나라도 있으면
	//기본생성자를 생성하지 않는다.
	public Person(String name) {
		this.name = name;
		System.out.println("Person() called");
	}

}
