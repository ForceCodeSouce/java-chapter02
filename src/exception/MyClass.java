package exception;



public class MyClass {
	
	
	///아래와 같은 예외처리가 체크드 예외처리 이다.
	public void dangerMethod() throws MyException{
		
		System.out.println("normal state1");
		//예외 상황 발생
		boolean isDanger = true;
		if(isDanger) {
			throw new MyException("MyException class");	//코드가 아래까지 안내려 간다. - 오류발생  - if문이 없을때!!! 발생!!!
		}
		
		System.out.println("normal state2");
	}

}
