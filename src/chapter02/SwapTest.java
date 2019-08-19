package chapter02;

public class SwapTest {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		
		System.out.println(i + ":" + j);
		
		swap1(i, j);	//이와 같이 값 복사를 통해서는 swap되지 않는다.
		
		System.out.println(i + ":" + j);
		
		//객체를 가리키는 값!!!
		//call by Value - 값 복사!!!
		//call by Reference
		Value v1 = new Value(10);	//Stack에 들어가게 됨.
		Value v2 = new Value(20);
		
	System.out.println(v1.val + ":" + v2.val);
		
		swap2(v1, v2);	//이와 같이 값 복사를 통해서는 swap되지 않는다.
		
		System.out.println(v1.val + ":" + v2.val);

	}

	//이와 같이 값 복사를 통해서는 swap되지 않는다.
	public static void swap1(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}
	
	//기본타입을 클래스 타입으로 변경
	public static void swap2(Value m, Value n) {
		int temp = m.val;
		m.val = n.val;
		n.val = temp;
	}

}
