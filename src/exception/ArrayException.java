package exception;

public class ArrayException {
	
	public static void main(String[] args) {
		
		//로직에러 발생!!!
		//아래와 같은 로직에러는 예외처리 하지 않는다.
		int[] a= {10, 20, 30, 40, 50};
		for(int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		
	}

}
