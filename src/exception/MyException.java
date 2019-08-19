package exception;

public class MyException extends Exception {
	
	private static final long serialVersionUID = 1;
	
	public MyException() {
		super("MyException 발생");
	}
	
	public MyException(String str) {
		System.out.println(str);
	}

}
