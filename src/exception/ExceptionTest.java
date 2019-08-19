package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
	try {
			int a = 10;		//정상 정료      //- finally 실행
			//int a = 0;	//비정상 종료   //- finally 실행
			System.out.println("some code...1");
			int k = 10000 / a;							//로직에러
			
			System.out.println("some code...1");
			System.out.println("some code...2");
			System.out.println("some code...3");
		}catch(ArithmeticException ex){
			//이곳을 비워놓는 인원하고는 상종도 하지 말아라!!!
			
			//1. 로그남기기!!!! (반드시 파일로 남기기!!!)
			//logging
			System.out.println("error :" + ex);
			
			//2. 사과하기
			System.out.println("죄송합니다.예기치....");
			
			//3. 정상 종료 (자원정리)
			return;
			
			//4. 이거라도 안되면 최소한...
			//ex.printStackTrace(); //최소한 이거라도 해줘야 한다. //stack의 상태를 보여주는 것
		}finally {
			//finally는 반드시 실행된다.
			System.out.println("자원정리");
		}
	}

}
