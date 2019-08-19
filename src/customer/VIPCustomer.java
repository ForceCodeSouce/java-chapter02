package customer;

//다른 패키지 import 접근
import chapter02.Customer;

public class VIPCustomer extends Customer{
	//protected는 상속과 관련되어 사용할수 있다.
	
	public void showInfo() {
		//패키지 접근제어 자체를 상관하지 말라!!!
		//protected는 같은 패키지 뿐만 아니라
		//자식 클래스에서도 접근이 가능하다.
		System.out.println(name);
	}
	

}
