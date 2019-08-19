package customer;

import chapter02.Customer;

public class CustomerApp {
	
	//패키지가 다르면 호출하수 없다.
	public static void main(String[] args) {
		Customer c = new Customer();
		
		//protected는 다른 패키지에서 접근이 안된다.
		//c.name = "둘리";
	}

}
