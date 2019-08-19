package chapter02;

public class Customer {
	
	//private String name;
	//private / protected로 정보 은닉
	//접근은 Getter / Setter로 접근
	protected String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드로 접근하는 것이 왜 값을, 정보를 보호할수 있는 것인가.
	
	
	
	//this - 내부에서 자기 자신에게 접근할때 this 사용	
	//구분해줘야 하는 경우 사용 this.age = age;
	//객체 자신을 참조하는 것!!!
	//그것을 구분!!!
//	public void sAge(int age) {
//		//age = 10;
//		this.age = age;
//	}
	
	//setter / getter!!!
	
//	public void sAge(int age) {
//		age = age; // 위와 같은 경우에는 매개변수가 우선이 된다.
//				   // 따라서 이것을 구분하기 위해서 This를 사용한다
//		this.age = age;
//	}

//	public int gAge() {
//		return age;
//	}
	
	
	
	

}
