package chapter02;

import chapter02.Customer;

public class CustomerApp {
	
	//protected는 상속과 관련되어 사용할수 있다.
	
	//패키지가 다르면 호출하수 없다.
	public static void main(String[] args) {
		Customer c = new Customer();
		
		//protected는 같은 패키지에서 접근 가능 O
		c.name = "둘리";
		
		//private은 외부에서 접근 X
		//c.age = 10;
		c.setAge(10);
		
	}

}
