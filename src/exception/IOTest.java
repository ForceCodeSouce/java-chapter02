package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		
		try {
			//FileInputStream fis = new FileInputStream("hello.txt");
			fis = new FileInputStream("hello2.txt");
			int data = fis.read();
			System.out.println(data);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("file not found");
		} catch(IOException e) {
			System.out.println("io error");
		}finally {
			try {
				if(fis != null) {
				fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 위에서 지역변수이기 때문에 안된다.
		}

	}

}
